/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frm;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author CECYT8
 */
public class inicio extends javax.swing.JFrame {

    /**
     * Creates new form inicio
     */
    public inicio() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../Imagenes/icono1.jpg")).getImage());
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlInicio = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPcontra = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlInicio.setBackground(new java.awt.Color(153, 0, 51));
        pnlInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        pnlInicio.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        pnlInicio.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        pnlInicio.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 150, 27));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("INICIO");
        pnlInicio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("NOMBRE USUARIO");
        pnlInicio.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("CONTRASEÑA");
        pnlInicio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));
        pnlInicio.add(txtPcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 150, 30));

        getContentPane().add(pnlInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        Registro obj = new Registro();
        obj.setVisible(true);
        dispose();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
             
        String nombre=txtNombre.getText();
        String contra=txtPcontra.getText();
        try {
            Iniciar(nombre,contra);
            
            
            // TODO add your handling code here:
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }  


        public void Iniciar(String nombre,String contra) throws SQLException{
        
        
        String SQL="";
        String Dato="";
       String Dato1="";
       
        Conectar con = new Conectar();
         Connection cnn = con.getConnection();
         SQL = "select * from inicio where Usuario='"+nombre+"' && Contra='"+contra+"'";
         Statement st = cnn.createStatement();
         ResultSet rs = st.executeQuery(SQL);
         while(rs.next()){
             Dato = rs.getString("Usuario");
             
         }
         while(rs.next()){
             Dato = rs.getString("Contra");
             
         }
 
        if (nombre.equals("") && (contra.equals("")) || !nombre.equals(Dato) && !contra.equals(Dato1)) {

            JOptionPane.showMessageDialog(null, "REGISTRATE PARA PODER ENTRAR");
        } else {

            Caracteres obj = new Caracteres();
            obj.setVisible(true);
            dispose();
            
            

        }

   
         
    
 // TODO add your handling code here:
    }//GEN-LAST:event_btnIniciarActionPerformed

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel pnlInicio;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JPasswordField txtPcontra;
    // End of variables declaration//GEN-END:variables
}
