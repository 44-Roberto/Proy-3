/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import java.io.*;
import javax.swing.JFileChooser;
import jaco.mp3.player.MP3Player;

public class Musica extends javax.swing.JFrame {

    /**
     * Creates new form Musica
     */
    public Musica() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTFRuta = new javax.swing.JTextField();
        JBRuta = new javax.swing.JButton();
        JBReproducir = new javax.swing.JButton();
        JBDetener = new javax.swing.JButton();
        JBTNVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JBRuta.setText("Ruta Archivo");
        JBRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRutaActionPerformed(evt);
            }
        });

        JBReproducir.setText("Reproducir");
        JBReproducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBReproducirActionPerformed(evt);
            }
        });

        JBDetener.setText("Detener");
        JBDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBDetenerActionPerformed(evt);
            }
        });

        JBTNVolver.setText("Volver");
        JBTNVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(JBRuta)
                        .addGap(18, 18, 18)
                        .addComponent(JTFRuta, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBTNVolver)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBReproducir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JBDetener)))))
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBRuta)
                    .addComponent(JTFRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBReproducir)
                    .addComponent(JBDetener))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(JBTNVolver)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public String RutaCancion="";
public MP3Player mp3Player;
  public File f ;
    private void JBRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRutaActionPerformed
        // TODO add your handling code here:
        JFileChooser dialogo = new JFileChooser("C:\\MEIA");

        File ficheroImagen;
        String rutaArchivo;

        int valor = dialogo.showOpenDialog(this);
        if (valor == JFileChooser.APPROVE_OPTION) {
            ficheroImagen = dialogo.getSelectedFile();
            rutaArchivo = ficheroImagen.getPath();

            RutaCancion=rutaArchivo;
            f=new File(RutaCancion);
            JTFRuta.setText(rutaArchivo);

            mp3Player =new  MP3Player(f);
        }
    }//GEN-LAST:event_JBRutaActionPerformed

    private void JBReproducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBReproducirActionPerformed
        try {

            mp3Player.play();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_JBReproducirActionPerformed

    private void JBDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBDetenerActionPerformed
        // TODO add your handling code here:
        mp3Player.stop();
    }//GEN-LAST:event_JBDetenerActionPerformed

    private void JBTNVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNVolverActionPerformed
        // TODO add your handling code here:
        Menu M1 = new Menu();
        M1.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(Musica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Musica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Musica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Musica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Musica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBDetener;
    private javax.swing.JButton JBReproducir;
    private javax.swing.JButton JBRuta;
    private javax.swing.JButton JBTNVolver;
    private javax.swing.JTextField JTFRuta;
    // End of variables declaration//GEN-END:variables
}
