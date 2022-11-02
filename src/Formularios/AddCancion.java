/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;


import Funciones.ArchivoSecuencial;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.Color;
import java.awt.Image;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.ImageIcon;
import Funciones.AESencripter;
import Funciones.ArchivoSecuencial;

public class AddCancion extends javax.swing.JFrame {

    /**
     * Creates new form AddCancion
     */
    public AddCancion() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JTFName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JTFArtist = new javax.swing.JTextField();
        JBRuta = new javax.swing.JButton();
        JTFRuta = new javax.swing.JTextField();
        JBTNAgregarCancion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        JBTNVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        JTFName.setBackground(new java.awt.Color(102, 102, 102));
        JTFName.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        JTFName.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre del artista");

        JTFArtist.setBackground(new java.awt.Color(102, 102, 102));
        JTFArtist.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        JTFArtist.setForeground(new java.awt.Color(255, 255, 255));
        JTFArtist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFArtistActionPerformed(evt);
            }
        });

        JBRuta.setBackground(new java.awt.Color(102, 102, 102));
        JBRuta.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        JBRuta.setForeground(new java.awt.Color(255, 255, 255));
        JBRuta.setText("Ruta Archivo");
        JBRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRutaActionPerformed(evt);
            }
        });

        JTFRuta.setBackground(new java.awt.Color(102, 102, 102));
        JTFRuta.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        JTFRuta.setForeground(new java.awt.Color(255, 255, 255));

        JBTNAgregarCancion.setBackground(new java.awt.Color(102, 102, 102));
        JBTNAgregarCancion.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        JBTNAgregarCancion.setForeground(new java.awt.Color(255, 255, 255));
        JBTNAgregarCancion.setText("Agregar cancion");
        JBTNAgregarCancion.setEnabled(false);
        JBTNAgregarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNAgregarCancionActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre de la canción");

        JBTNVolver.setBackground(new java.awt.Color(102, 102, 102));
        JBTNVolver.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        JBTNVolver.setForeground(new java.awt.Color(255, 255, 255));
        JBTNVolver.setText("Volver");
        JBTNVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(JTFName, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(JBRuta)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFArtist, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(JBTNVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                .addComponent(JBTNAgregarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(JTFArtist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBRuta)
                    .addComponent(JTFRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBTNAgregarCancion)
                    .addComponent(JBTNVolver))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public String RutaCancion="";

    private void JBRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRutaActionPerformed
        // TODO add your handling code here:
        JBTNAgregarCancion.setEnabled(true);
        JFileChooser dialogo = new JFileChooser("C:\\MEIA");

        File ficheroImagen;
        String rutaArchivo;

        int valor = dialogo.showOpenDialog(this);
        if (valor == JFileChooser.APPROVE_OPTION) {
            ficheroImagen = dialogo.getSelectedFile();
            rutaArchivo = ficheroImagen.getPath();

            RutaCancion=rutaArchivo;
            JTFRuta.setText(rutaArchivo);

           
        }
    }//GEN-LAST:event_JBRutaActionPerformed

    private void JTFArtistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFArtistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFArtistActionPerformed

    public int codigo=0;
    private void JBTNAgregarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNAgregarCancionActionPerformed
        //Comienzo con el Secuencial de la cancion
       
        Login l1 = new Login();
        String bitacoraUsersPath="C:\\MEIA\\bitacora_canciones.txt"; //Dirección
            String userPath = "C:\\MEIA\\canciones.txt";
            String bitacoraDesc = "C:\\MEIA\\desc_bitacora_canciones.txt";
            String userDec = "C:\\MEIA\\desc_canciones.txt";
            //Validar el codigo
            String[][] fileInfo = new String[9][2];
             String[][] fileInfo2 = new String[9][2];
            ArchivoSecuencial list = new ArchivoSecuencial();
            fileInfo= list.getDescriptor(userDec);
            fileInfo2= list.getDescriptor(bitacoraDesc);
            
            codigo=Integer.parseInt(fileInfo[5][1].trim())+Integer.parseInt(fileInfo2[5][1].trim())+1;
           /* String COD="";
            if(codigo<10)
            {
                COD ="0"+codigo+"";
            }
            else
            {
                COD=codigo+"";
            }*/
            
            //Llenar
            String NombreCancion = JTFName.getText(),
                    Artista= JTFArtist.getText(),
                    PathCancion=JTFRuta.getText(),
                    Usuario=l1.usertx;
            
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDateTime date = LocalDateTime.now();
            String dt = dtf.format(date);
            
            
            String Informacion = String.join("|",codigo+"",NombreCancion,Artista,PathCancion,Usuario,dt,"1" );
            String strError="";
            
            ArchivoSecuencial as = new ArchivoSecuencial();            
            as.Add(Usuario, Informacion, bitacoraUsersPath, userPath, bitacoraDesc, userDec, Usuario, true);            
            
            Menu m1=new Menu();
            m1.setVisible(true);
            this.dispose();
      //***************      
    }//GEN-LAST:event_JBTNAgregarCancionActionPerformed

    private void JBTNVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNVolverActionPerformed
        // TODO add your handling code here:
        Menu m1 = new Menu();
        m1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JBTNVolverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddCancion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCancion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCancion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCancion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCancion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBRuta;
    private javax.swing.JButton JBTNAgregarCancion;
    private javax.swing.JButton JBTNVolver;
    private javax.swing.JTextField JTFArtist;
    private javax.swing.JTextField JTFName;
    private javax.swing.JTextField JTFRuta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
