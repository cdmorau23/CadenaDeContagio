/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import ClasesPaciente.PacienteNE;
import ClasesPaciente.PacienteP;
import static Formularios.TablaPacienteNE.*;
import static Formularios.TablaPacienteP.ListaPacientesP;
import static Formularios.TablaPacienteP.con;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utils.ArbolBinario;
import utils.DoubleLinkedList;
import utils.Myqueue;

/**
 *
 * @author sordo
 */
public class Contactar extends javax.swing.JFrame {
    Myqueue<PacienteNE> priori=new Myqueue<>();
    TablaPacienteNE tpne=new TablaPacienteNE();
    PacienteNE ne=new PacienteNE();
    String deletene;
    String deletearbol;
    String change;
    /**
     * Creates new form Contactar
     */
    public Contactar(DoubleLinkedList<PacienteNE>nne) throws SQLException {
        ArbolBinario abo = new ArbolBinario ();
        for(int i=0;i<nne.length();i++){
            abo.insertar(nne.getAtIndex(i));
        }
        abo.imprimirPre(priori);
        initComponents();
        btprueba.setVisible(false);
        mostrarDatos();
    }

    private Contactar() {
        
         //To change body of generated methods, choose Tools | Templates.
    }
    public void mostrarDatos() throws SQLException{
        SimpleDateFormat formatoFecha = new SimpleDateFormat("YYYY-MM-dd");
        String fecha;
        fecha = formatoFecha.format(priori.peek().FechaIngreso);
                jLabel8.setText(priori.peek().Nombre);
                jLabel9.setText(String.valueOf(priori.peek().Cedula));
                jLabel10.setText(priori.peek().Telefono);
                jLabel11.setText(priori.peek().Direccion);
                if(priori.peek().R_Biologico==1){
                  jLabel12.setText("TRUE");}else{
                  jLabel12.setText("FALSE");}
                jLabel13.setText(String.valueOf(priori.peek().N_Arboles));
                jLabel15.setText(fecha);
                    
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
        jLabel1 = new javax.swing.JLabel();
        txtContactar = new javax.swing.JLabel();
        btcontacto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btprueba = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Personas a contactar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));
        jPanel1.add(txtContactar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 250, -1));

        btcontacto.setText("Contactar");
        btcontacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcontactoActionPerformed(evt);
            }
        });
        jPanel1.add(btcontacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 60, -1));

        jLabel3.setText("Cedula");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 40, -1));

        jLabel4.setText("Telefono");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        jLabel5.setText("Dirección");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabel6.setText(" Riego Biologico");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 90, -1));

        jLabel7.setText("N arboles");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 60, 20));

        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        jLabel10.setText("jLabel10");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        jLabel11.setText("jLabel11");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        jLabel12.setText("jLabel12");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        jLabel13.setText("jLabel13");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, 20));

        jLabel14.setText("Fecha ingreso");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, 20));

        jLabel15.setText("jLabel15");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, 20));

        btprueba.setText("Realizar Prueba");
        btprueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpruebaActionPerformed(evt);
            }
        });
        jPanel1.add(btprueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 170, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/iconos/icons8_Back_64px.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 70, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btcontactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcontactoActionPerformed
        JOptionPane.showMessageDialog(null, "Contactado con exito");
        btprueba.setVisible(true);
        btcontacto.setVisible(false);
    // TODO add your handling code here:
    }//GEN-LAST:event_btcontactoActionPerformed

    private void btpruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpruebaActionPerformed
        // TODO add your handling code here
        Random rn=new Random();
        int result=rn.nextInt(2);
        if(result==1){
            JOptionPane.showMessageDialog(null, "Positiva");
            priori.dequeue();
            try {
                mostrarDatos();
            } catch (SQLException ex) {
                Logger.getLogger(Contactar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Negativa");
            priori.dequeue();
            try {
                mostrarDatos();
            } catch (SQLException ex) {
                Logger.getLogger(Contactar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        btprueba.setVisible(false);
        btcontacto.setVisible(true);
    }//GEN-LAST:event_btpruebaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Main mn=new Main();
        mn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Contactar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contactar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contactar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contactar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contactar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcontacto;
    private javax.swing.JButton btprueba;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtContactar;
    // End of variables declaration//GEN-END:variables
}
