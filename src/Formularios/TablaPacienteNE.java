/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import ClasesPaciente.Acciones;
import ClasesPaciente.PacienteNE;
import ClasesPaciente.PacienteP;
import conexionSQL.conexionSQL;
import utils.DoubleLinkedList;
import utils.MyStack;
import utils.Node;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.ArbolBinario;


/**
 *
 * @author ASUS
 */
public class TablaPacienteNE extends javax.swing.JFrame {

    /**
     * Creates new form sistema
     */
    public static DoubleLinkedList<PacienteNE> ListaPacientesNE ;
    public static MyStack<Acciones> AtrasNE;
    public static MyStack<Acciones> AdelanteNE;
    public static conexionSQL cc;
    public static Connection con;
    public static int contacto;
    public static Main Origen;

    
    public TablaPacienteNE(int IDContacto, Main Origen) throws SQLException {
        
        TablaPacienteNE.contacto = IDContacto;
        TablaPacienteNE.ListaPacientesNE = Main.ListaPacientesNE;
        TablaPacienteNE.AtrasNE= Main.RespaldoNE;
        TablaPacienteNE.cc = Main.cc;
        TablaPacienteNE.con = Main.con;
        TablaPacienteNE.Origen = Origen;
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(getBackground());
        mostrarDatos();
        try {
        LlenarLista();
        } catch (SQLException ex) {
            Logger.getLogger(TablaPacienteNE.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

        
        

    }

    public TablaPacienteNE() {
        //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btNuevo = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        btActualizar = new javax.swing.JButton();
        txtCedula = new javax.swing.JTextField();
        Nombre1 = new javax.swing.JLabel();
        Nombre2 = new javax.swing.JLabel();
        txtRB1 = new javax.swing.JComboBox<>();
        btnRestaurar = new javax.swing.JButton();
        btnAfter = new javax.swing.JButton();
        scroll = new javax.swing.JScrollPane();
        tablaPersona = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jTextField6.setText("jTextField6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Nombre.setText("Nombre");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel1.setText("Dirección");

        jLabel2.setText("Telefono");

        btNuevo.setText("Nuevo");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        btActualizar.setText("Actualizar");
        btActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarActionPerformed(evt);
            }
        });

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        Nombre1.setText("Cedula");

        Nombre2.setText("Riesgo Biologico");

        txtRB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "True", "False" }));
        txtRB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRB1ActionPerformed(evt);
            }
        });

        btnRestaurar.setText("Before");
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });

        btnAfter.setText("After");
        btnAfter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(Nombre)
                    .addComponent(jLabel1)
                    .addComponent(Nombre1)
                    .addComponent(Nombre2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRB1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btGuardar)
                .addGap(44, 44, 44)
                .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btActualizar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRestaurar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAfter, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre1)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre2)
                    .addComponent(txtRB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRestaurar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAfter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        tablaPersona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPersonaMouseClicked(evt);
            }
        });
        scroll.setViewportView(tablaPersona);

        jLabel6.setText("Busqueda");

        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
        });

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btBuscar)
                .addGap(705, 705, 705))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(226, 226, 226))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(18, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar))
                .addGap(18, 18, 18)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        // TODO add your handling code here:
        limpiarCeldas();
    }//GEN-LAST:event_btNuevoActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        insertarDatos();
        limpiarCeldas();
        try {
            mostrarDatos();        // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(TablaPacienteNE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btGuardarActionPerformed
                                                

    private void tablaPersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPersonaMouseClicked
        // TODO add your handling code here:
        int filaSeleccionada = tablaPersona.rowAtPoint(evt.getPoint());
        txtNombre.setText(tablaPersona.getValueAt(filaSeleccionada,1).toString());
        txtCedula.setText(tablaPersona.getValueAt(filaSeleccionada,2).toString());
        txtTelefono.setText(tablaPersona.getValueAt(filaSeleccionada,3).toString());
        txtDireccion.setText(tablaPersona.getValueAt(filaSeleccionada,4).toString());

    }//GEN-LAST:event_tablaPersonaMouseClicked

    private void btActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarActionPerformed
        // TODO add your handling code here:
        ActualizarDatos();
        limpiarCeldas();
        try {
            mostrarDatos();
        } catch (SQLException ex) {
            Logger.getLogger(TablaPacienteNE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btActualizarActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        // TODO add your handling code here:
        eliminarRegistros();
        try {
            mostrarDatos();
        } catch (SQLException ex) {
            Logger.getLogger(TablaPacienteNE.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpiarCeldas();
    }//GEN-LAST:event_btEliminarActionPerformed

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        // TODO add your handling code here:
        filtrar(txtBusqueda.getText());
    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btBuscarActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        Respaldo();
        try {
            mostrarDatos();
        } catch (SQLException ex) {
            Logger.getLogger(TablaPacienteNE.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpiarCeldas();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRestaurarActionPerformed

    private void txtRB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRB1ActionPerformed

    private void btnAfterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfterActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnAfterActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Main mn=new Main();
        mn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void Respaldo(){
        if(AtrasNE.length!=0){
        try {           
            String SQL = AtrasNE.top().getInversa();
            AdelanteNE.push(AtrasNE.pop());
            PreparedStatement pst =(PreparedStatement) con.prepareStatement(SQL);
            pst.execute();
            SQL= AtrasNE.pop().Inversa;
            AdelanteNE.push(AtrasNE.pop());
            PreparedStatement st =(PreparedStatement) con.prepareStatement(SQL);
            st.execute();
            LlenarLista();
        } catch (SQLException ex) {
            Logger.getLogger(TablaPacienteNE.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    } 
    public void Adelante(){
        if(!AdelanteNE.isEmpty()){
        try {           
            String SQL = AdelanteNE.top().getAccionOriginal();
            AtrasNE.push(AtrasNE.pop());
            PreparedStatement pst =(PreparedStatement) con.prepareStatement(SQL);
            pst.execute();
            SQL = AdelanteNE.top().getAccionOriginal();
            AtrasNE.push(AtrasNE.pop());
            PreparedStatement st =(PreparedStatement) con.prepareStatement(SQL);
            st.execute();
            LlenarLista();
        } catch (SQLException ex) {
            Logger.getLogger(TablaPacienteNE.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
    
    
    
    
    public void LlenarLista() throws SQLException{
        
        DoubleLinkedList<PacienteNE> ListaN = new DoubleLinkedList<>();
        ListaPacientesNE = ListaN;
        SimpleDateFormat formatoFecha = new SimpleDateFormat("YYYY-MM-dd");
        String fecha;

        String SQL = "SELECT * FROM `paciente_ne`;";
        
        try{
            Statement st = (Statement) con.createStatement();
            ResultSet rs = (ResultSet) st.executeQuery(SQL);
            while(rs.next()){

                
                fecha = formatoFecha.format(rs.getDate("FechaIngreso"));

                PacienteNE Juanito = new PacienteNE(
                        Integer.parseInt(rs.getString("IdN")),
                        rs.getString("Nombre"),
                        Integer.parseInt(rs.getString("Cedula")),
                        rs.getString("Telefono"),
                        rs.getString("Direccion"),
                        fecha,
                        Integer.parseInt(rs.getString("N_Arboles")),
                        Integer.parseInt(rs.getString("R_Biologico")),
                        Integer.parseInt(rs.getString("Contactado"))                       
                        );
                ListaPacientesNE.insert(Juanito);
            }

        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "No se pudo añadir a la lista" +e.getMessage());

            
        }
        
    }
    public DoubleLinkedList<PacienteNE> LlenarListall() throws SQLException{
        
        DoubleLinkedList<PacienteNE> ListaN = new DoubleLinkedList<>();
        ListaPacientesNE = ListaN;
        SimpleDateFormat formatoFecha = new SimpleDateFormat("YYYY-MM-dd");
        String fecha;

        String SQL = "SELECT * FROM `paciente_ne`;";
        
        try{
            Statement st = (Statement) con.createStatement();
            ResultSet rs = (ResultSet) st.executeQuery(SQL);
            while(rs.next()){

                
                fecha = formatoFecha.format(rs.getDate("FechaIngreso"));

                PacienteNE Juanito = new PacienteNE(
                        Integer.parseInt(rs.getString("IdN")),
                        rs.getString("Nombre"),
                        Integer.parseInt(rs.getString("Cedula")),
                        rs.getString("Telefono"),
                        rs.getString("Direccion"),
                        fecha,
                        Integer.parseInt(rs.getString("N_Arboles")),
                        Integer.parseInt(rs.getString("R_Biologico")),
                        Integer.parseInt(rs.getString("Contactado"))                       
                        );
                ListaPacientesNE.insert(Juanito);
            }

        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "No se pudo añadir a la lista" +e.getMessage());

            
        }
        return ListaPacientesNE;
    }
    public PacienteNE busqueda(int id){
        if(ListaPacientesNE.isEmpty()){return null;}
        Node<PacienteNE> busqueda = ListaPacientesNE.first;
        
        while(busqueda.value != null){
            if (busqueda.value.getId()==id){
                break;
            }
            busqueda = busqueda.next;  
        }
        if(busqueda == null){
            return null;
        }
    return busqueda.value;
    }
    
    public PacienteNE busquedaCC(int CC){
        if (this.ListaPacientesNE.isEmpty()){return null;}
        Node<PacienteNE> busqueda = this.ListaPacientesNE.first;

        while(busqueda.value != null){
            if (busqueda.value.getCedula()==CC){
                break;
            }
            busqueda = busqueda.next;  
        }
        if(busqueda == null){
            return null;
        }
    return busqueda.value;
    }
    
    public void ImprimirLista(){
    if(!ListaPacientesNE.isEmpty()){
    Node<PacienteNE> busqueda = this.ListaPacientesNE.first;
    for (int i = 0; i<ListaPacientesNE.length();i++){
                JOptionPane.showMessageDialog(null, busqueda.value.getNombre());
                busqueda= busqueda.next;
        }
    }
    }
    
    
    public void insertarDatos(){
        
        int seleccionado = txtRB1.getSelectedIndex();
        String valor = txtRB1.getItemAt(seleccionado);
        if(valor == "True"){
            seleccionado = 1;
        }
        else if (valor == "False"){
            seleccionado = 0;
        }
        
        PacienteNE juanito = new PacienteNE(null,txtNombre.getText(),Integer.parseInt(txtCedula.getText()),txtTelefono.getText(),txtDireccion.getText(),"",1,seleccionado,0);
        
        
        try{
        String SQL= juanito.getInsertInicial();
        PreparedStatement pst =(PreparedStatement) con.prepareStatement(SQL);
        pst.execute();
                ImprimirLista();

        LlenarLista();
        PacienteNE juanito2 = busquedaCC(juanito.getCedula());
        String SQL2= juanito2.getInsertArbol(contacto);
        PreparedStatement pst2 =(PreparedStatement) con.prepareStatement(SQL2); 
        pst2.execute();
        
        AtrasNE.push(new Acciones(juanito2.getInsertInicial(),juanito2.getDeleteInicial()));
        AtrasNE.push(new Acciones(juanito2.getDeleteArbol(),juanito2.getInsertArbol(contacto)));
        
        JOptionPane.showMessageDialog(null, "RegistroExitoso");   
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, "Registro No Exitoso"+e.getMessage());

        }
        
        
    }
    
    public void ActualizarDatos(){
        
        int filaSeleccionada = tablaPersona.getSelectedRow();
        int Id = Integer.parseInt((String)tablaPersona.getValueAt(filaSeleccionada, 0));
        PacienteNE paciente = busqueda(Id);
        String antiUpdate = paciente.getUpdate();
        
        try{              
        
        paciente.setNombre(txtNombre.getText());
        paciente.setCedula(Integer.parseInt(txtCedula.getText()));
        paciente.setTelefono(txtTelefono.getText());
        paciente.setDireccion(txtDireccion.getText());
        
        int seleccionado = txtRB1.getSelectedIndex();
        String valor = txtRB1.getItemAt(seleccionado);
        if(valor == "True"){
            seleccionado = 1;
        }
        else if (valor == "False"){
            seleccionado = 0;
        }
        paciente.setR_Biologico(seleccionado);

       
        
        String SQL = paciente.getUpdate();
        System.out.println(SQL);
        PreparedStatement pst =(PreparedStatement) con.prepareStatement(SQL);
        pst.execute();
        AtrasNE.push(new Acciones(SQL,antiUpdate));
        AtrasNE.push(new Acciones(SQL,antiUpdate));
        
        
        JOptionPane.showMessageDialog(null, "Registro Editado Exitosamente");   
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, "Registro No editado de manera Exitosa"+e.getMessage());


        }
    }
    
    public void eliminarRegistros(){
        int filaSeleccionada = tablaPersona.getSelectedRow();
        int Id = Integer.parseInt((String)tablaPersona.getValueAt(filaSeleccionada, 0));
        PacienteNE paciente = busqueda(Id);
        try{
            
            Statement st= (Statement) con.createStatement();
            String SQL1 = paciente.getDeleteArbol();
            st.execute(SQL1);
            String SQL = paciente.getDeleteInicial();
            st.execute(SQL);

            AtrasNE.push(new Acciones(SQL,paciente.getInsertInicial()));
            AtrasNE.push(new Acciones(SQL1,paciente.getInsertArbol(contacto)));
            ListaPacientesNE.delete(paciente);

            
            JOptionPane.showMessageDialog(null, "Registro eliminado");
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al eliminar registro"+ e.getMessage());

        }
    }
    
    public void limpiarCeldas(){
        txtCedula.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtRB1.setSelectedIndex(0);
        
    }
    
    public void mostrarDatos() throws SQLException{
              
        String[] titulos = {"IdN","Nombre","Cedula","Telefono","Direccion","FechaIngreso","N_Arboles","R_Biologico"};
        String[] registros = new String[10];
        SimpleDateFormat formatoFecha = new SimpleDateFormat("YYYY-MM-dd");
        String fecha;

        
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        String SQL = "SELECT * FROM `paciente_ne`;";
        
        try{
            Statement st = (Statement) con.createStatement();
            ResultSet rs = (ResultSet) st.executeQuery(SQL);
            while(rs.next()){
                
                registros[0] = rs.getString("IdN");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Cedula");
                registros[3] = rs.getString("Telefono");
                registros[4] = rs.getString("Direccion");
                fecha = formatoFecha.format(rs.getDate("FechaIngreso"));
                registros[5] = fecha;
                registros[6] = rs.getString("N_Arboles");
                
                if(Integer.parseInt(rs.getString("R_Biologico"))==1){
                  registros[7] = "TRUE";  
                
                }else{
                  registros[7] = "FALSE";  

                }

                

                
                modelo.addRow(registros);
                
            }
            tablaPersona.setModel(modelo);

        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "No se pudo mostrar la lista" +e.getMessage());

            
        }
        
        
    }
    public void filtrar(String valor){
        String[] titulos = {"IdN","Nombre","Cedula","Telefono","Direccion","FechaIngreso"};
        String[] registros = new String[6];
        SimpleDateFormat formatoFecha = new SimpleDateFormat("YYYY-MM-dd");

        
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        String SQL = "SELECT * FROM `paciente_ne` WHERE `IdN` LIKE '%"+valor+"%' OR `Nombre` LIKE '%"+valor+"%' OR `Cedula` LIKE '%"+valor+"%' OR `Telefono` LIKE '%"+valor+"%' OR `Direccion` LIKE '%"+valor+"%' OR `FechaIngreso` LIKE '%"+valor+"%'";
        String fecha;
        
        try{
            Statement st = (Statement) con.createStatement();
            ResultSet rs = (ResultSet) st.executeQuery(SQL);
            while(rs.next()){
                
                registros[0] = rs.getString("IdN");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Cedula");
                registros[3] = rs.getString("Telefono");
                registros[4] = rs.getString("Direccion");
                fecha = formatoFecha.format(rs.getDate("FechaIngreso"));
                registros[5] = fecha;
                
                modelo.addRow(registros);
                                
            }
            tablaPersona.setModel(modelo);

        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "No se pudo filtrar la lista" +e.getMessage());

            
        }
        
        
    }
    

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
            java.util.logging.Logger.getLogger(TablaPacienteNE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaPacienteNE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaPacienteNE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaPacienteNE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TablaPacienteNE(contacto,Origen).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TablaPacienteNE.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Nombre1;
    private javax.swing.JLabel Nombre2;
    private javax.swing.JButton btActualizar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JButton btnAfter;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tablaPersona;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JComboBox<String> txtRB1;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
