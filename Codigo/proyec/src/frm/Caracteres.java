/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frm;

import static frm.Registro.txtRcontra;
import static frm.Registro.txtRnombre;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author CECYT8
 */
public class Caracteres extends javax.swing.JFrame {

    /**
     * Creates new form Caracteres
     */
    int tipov;
    String ver;
      public static String num="";
    public Caracteres() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
       setIconImage(new ImageIcon(getClass().getResource("../Imagenes/icono1.jpg")).getImage());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rdbCerrada = new javax.swing.JRadioButton();
        rdbAbierta = new javax.swing.JRadioButton();
        btnEmpezar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 0, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("CONFIGURACION");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 204, 255));
        jLabel7.setText("Tipo de votacio");

        rdbCerrada.setBackground(new java.awt.Color(153, 0, 51));
        tipo.add(rdbCerrada);
        rdbCerrada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbCerrada.setForeground(new java.awt.Color(255, 255, 255));
        rdbCerrada.setText("Cerrada");
        rdbCerrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbCerradaActionPerformed(evt);
            }
        });

        rdbAbierta.setBackground(new java.awt.Color(153, 0, 51));
        tipo.add(rdbAbierta);
        rdbAbierta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbAbierta.setForeground(new java.awt.Color(255, 255, 255));
        rdbAbierta.setText("Abierta");
        rdbAbierta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbAbiertaActionPerformed(evt);
            }
        });

        btnEmpezar.setText("Siguiente");
        btnEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpezarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdbAbierta)
                                    .addComponent(rdbCerrada)
                                    .addComponent(btnEmpezar)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdbCerrada)
                .addGap(14, 14, 14)
                .addComponent(rdbAbierta)
                .addGap(18, 18, 18)
                .addComponent(btnEmpezar)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpezarActionPerformed
                  

                if(tipov==0){
             num ="0";                    Seleccion JSeleccion = new Seleccion();
                   
                    JSeleccion.setVisible(true);
                       Cerrar obj = new Cerrar();
                       
        
          
                    this.setVisible(false);

           
        }else{
num="1";
                               Seleccion1 JSeleccion1 = new Seleccion1();
                    JSeleccion1.lblnum.setText(num);

                    JSeleccion1.setVisible(true);
                       Cerrar obj = new Cerrar();
        obj.lblnum1.setText(num);
                    this.setVisible(false);
        }
         
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmpezarActionPerformed

    private void rdbCerradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbCerradaActionPerformed
 tipov=0;

    }//GEN-LAST:event_rdbCerradaActionPerformed

    private void rdbAbiertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbAbiertaActionPerformed
        tipov=1;
    }//GEN-LAST:event_rdbAbiertaActionPerformed

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
            java.util.logging.Logger.getLogger(Caracteres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caracteres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caracteres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caracteres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caracteres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmpezar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rdbAbierta;
    private javax.swing.JRadioButton rdbCerrada;
    private javax.swing.ButtonGroup tipo;
    // End of variables declaration//GEN-END:variables
}
