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
    
    public String Search(String id, String master)
    {
        ArrayList<String> lineas = getAll(master);
        String reg = lineas.get(0);
        boolean flag = false;
        return "null";
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
