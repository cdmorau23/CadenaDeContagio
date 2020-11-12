/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesPaciente;




import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class PacienteP {
    public Integer id;
    public String Nombre;
    public Integer Cedula;
    public String Telefono;
    public String Direccion;
    public Date FechaIngreso;
    public String FechaFormato;
    public String Insert="";
    public String Update="";
    public String Delete="";
    
    
    public static void main(String[] args) {
        PacienteP juanito = new PacienteP (0,"Juancho",1234,"165519606","calle de juancho","12-23");
        System.out.println(juanito.getInsert());
        
    }


    public PacienteP() {
    }

    public PacienteP(Integer id, String Nombre, Integer Cedula, String Telefono, String Direccion, String FechaFormato) {
        this.id = id;
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        SimpleDateFormat formatoFecha = new SimpleDateFormat("YYYY-MM-dd");
        
        if (FechaFormato==""){
            this.FechaIngreso= new Date();
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
        setInsert("INSERT INTO `paciente+`(`Id+`, `Nombre`, `Cedula`, `Telefono`, `Direccion`, `FechaIngreso`) VALUES ("+this.getId()+",'"+this.getNombre()+"',"+this.getCedula()+",'"+this.getTelefono()+"','"+this.getDireccion()+"','"+FechaFormato+"');");
        return Insert;
    }

    public void setInsert(String insert) {
        Insert = insert;
    }

    public String getUpdate() {
        this.setUpdate("UPDATE `paciente+` SET `Id+`="+this.getId()+",`Nombre`='"+this.getNombre()+"',`Cedula`="+this.getCedula()+",`Telefono`='"+this.getTelefono()+"',`Direccion`='"+this.getDireccion()+"',`FechaIngreso`= '"+FechaFormato+"' WHERE `paciente+`.`Id+` ="+this.getId()+";");

        return Update;
    }

    public void setUpdate(String update) {
        Update = update;
    }

    public String getDelete() {
        this.setDelete("DELETE FROM `paciente+` WHERE `paciente+`.`Id+` = "+this.getId()+";");

        return Delete;
    }

    public void setDelete(String delete) {
        Delete = delete;
    }
    

}