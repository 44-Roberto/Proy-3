/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AndresLima
 */
public class ArbolBinario {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    
    public void Add(String key, String info, String pathMaster, String descriptor, int keySize){
        File master = new File(pathMaster);
        
    }
    
    public String Search(String id, String master, int keySize)
    {
        String resultado = "null";
        ArrayList<String> lineas = getAll(master);
        if (lineas.isEmpty()) {
            return resultado;
        }
        String reg = lineas.get(0);
        var temp = reg.split("[|]");
        String key = getKey(reg, keySize);
        while(id.compareTo(key) != 0){            
            int p;
            if(id.compareTo(key) < 0){
                if (temp[0].equals("null")) {
                    return "null";
                }else{
                    p = Integer.parseInt(temp[0]);
                    reg = lineas.get(p - 1);
                    temp = reg.split("[|]");
                    key = getKey(reg, keySize);
                }
            }else{
                if (temp[1].equals("null")) {
                    return "null";
                }else{
                    p = Integer.parseInt(temp[1]);
                    reg = lineas.get(p - 1);
                    temp = reg.split("[|]");
                    key = getKey(reg, keySize);
                }
            }
        }
        return reg;        
    }
    
    private String getKey(String reg, int keySize){
        var temp = reg.split("[|]");        
        String[] aux = new String[keySize];
        int c = 0;
        while(c < keySize){
            aux[c] = temp[c+2];
            c++;
        }
        String key = String.join("|", aux);
        return key;
    }
    
    public ArrayList<String> getAll(String pathMaster){
        ArrayList<String> resultado = new ArrayList<>();        
        File mast = new File(pathMaster);
        FileReader LecturaArchivo;
        BufferedReader LeerArchivo; 
        if (mast.exists()) {
            try {           
                LecturaArchivo = new FileReader(mast);
                LeerArchivo = new BufferedReader(LecturaArchivo);
                String Linea;                
                Linea=LeerArchivo.readLine();
                String[] registro;
                while(Linea != null){
                    if (!"".equals(Linea)) {                                                                        
                        if (!Linea.endsWith("1")) {
                            //Si el registro esta deshabilitado se regresa continua
                            continue;
                        }
                                                
                        resultado.add(Linea);
                    }
                    Linea=LeerArchivo.readLine();
                }
                LecturaArchivo.close();
                LeerArchivo.close();
                
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ArchivoSecuencial.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            } catch (IOException ex) {
                Logger.getLogger(ArchivoSecuencial.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
        return resultado;
    }
}
