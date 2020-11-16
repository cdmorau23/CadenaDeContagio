/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesPaciente;




import Formularios.TablaPacienteNE;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import utils.DoubleLinkedList;

/**
 *
 * @author ASUS
 */
public class PacienteNE {
    public Integer id;
    public String Nombre;
    public Integer Cedula;
    public String Telefono;
    public String Direccion;
    public Date FechaIngreso;
    public String FechaFormato;
    public Integer R_Biologico;
    public Integer N_Arboles;    
    public String Insert="";
    public String Update="";
    public String Delete="";
    
    
    public static void main(String[] args) {
        PacienteNE juanito = new PacienteNE (0,"Juancho",1234,"165519606","calle de juancho","2001-12-10",1,1);
        System.out.println(juanito.getInsert());
        
    }


    public PacienteNE() {
    }

    public PacienteNE(Integer id, String Nombre, Integer Cedula, String Telefono, String Direccion, String FechaFormato,Integer N_Arboles, Integer R_Biologico) {
        this.id = id;
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.R_Biologico = R_Biologico;
        this.N_Arboles = N_Arboles;
        
        SimpleDateFormat formatoFecha = new SimpleDateFormat("YYYY-MM-dd");
        
        if (FechaFormato==""){
            this.FechaIngreso = new Date();
            this.FechaFormato = formatoFecha.format(this.getFechaIngreso());
        }
        else{
            this.FechaFormato = FechaFormato;
            try {
                this.FechaIngreso = formatoFecha.parse(FechaFormato);
            } 
            catch (ParseException ex) 
            {
                JOptionPane.showMessageDialog(null, "Error Con El Formato De La Fecha");   
                this.FechaIngreso= new Date();
                this.FechaFormato = "0";

            }
        
        }

    }

    public void setFechaFormato(String FechaFormato) {
        this.FechaFormato = FechaFormato;
    }

    public void setR_Biologico(Integer R_Biologico) {
        this.R_Biologico = R_Biologico;
    }

    public void setN_Arboles(Integer N_Arboles) {
        this.N_Arboles = N_Arboles;
    }

    public String getFechaFormato() {
        return FechaFormato;
    }

    public Integer getR_Biologico() {
        return R_Biologico;
    }

    public Integer getN_Arboles() {
        return N_Arboles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Integer getCedula() {
        return Cedula;
    }

    public void setCedula(Integer cedula) {
        Cedula = cedula;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public Date getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        FechaIngreso = fechaIngreso;
    }

    public String getInsert() {
        String Insert="INSERT INTO `paciente_ne`(`IdN`, `Nombre`, `Cedula`, `Telefono`, `Direccion`, `Fechaingreso`, `N_Arboles`, `R_Biologico`) VALUES ("+this.getId()+",'"+this.getNombre()+"',"+this.getCedula()+",'"+this.getTelefono()+"','"+this.getDireccion()+"','"+this.FechaFormato+"',"+this.getN_Arboles()+","+this.getR_Biologico()+");";
        return Insert;
    }

    public void setInsert(String insert) {
        Insert = insert;
    }

    public String getUpdate() {
        this.setUpdate("UPDATE `paciente_ne` SET `IdN`="+this.getId()+",`Nombre`='"+this.getNombre()+"',`Cedula`="+this.getCedula()+",`Telefono`='"+this.getTelefono()+"',`Direccion`='"+this.getDireccion()+"',`FechaIngreso`= '"+this.getFechaFormato()+"',`R_Biologico`= '"+this.getR_Biologico()+"',`N_Arboles`= '"+this.getN_Arboles()+"' WHERE `paciente_ne`.`IdN` ="+this.getId()+";");

        return Update;
    }

    public void setUpdate(String update) {
        Update = update;
    }

    public String getDelete() {
        this.setDelete("DELETE FROM `paciente_ne` WHERE `paciente_ne`.`IdN` = "+this.getId()+";");
        return Delete;
    }

    public void setDelete(String delete) {
        Delete = delete;
    }
    public int nAr(int cc){
        int count=0;
        Arbol ap=new Arbol();
        DoubleLinkedList<Arbol>ar=ap.llenarar();
        for(int i=0; i<ar.length();i++){
            if(cc==ar.getAtIndex(i).getIdne()){
                count++;
            }
        }
        return count;
    }

}
