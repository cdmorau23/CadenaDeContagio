package Formularios;

import ClasesPaciente.PacienteNE;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import conexionSQL.conexionSQL;
import java.sql.ResultSet;

import javax.swing.*;
import java.sql.SQLException;
import utils.DoubleLinkedList;
import utils.Node;

public class Arbol{
    public static conexionSQL cc;
    public static Connection con ;
    public static DoubleLinkedList<ClaseArbol>aa;


    public Arbol() {
        Arbol.cc=Main.cc;
        Arbol.con = Main.con;
        Arbol.aa = Main.aa;
    }

    public void insertar(ClaseArbol a) {
        
        if(buscarPareja(a)){       }
        else{
        String inser="INSERT INTO `arbol`(`Paciente+_Id+`, `Paciente_NE_IdN`) VALUES ("+a.IdP+","+a.IdNE+");";
        try {
            PreparedStatement pst =(PreparedStatement) con.prepareStatement(inser);
            pst.execute();
            aa.insert(a);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro en arbol No Exitoso"+e.getMessage());
        }
        }
    }
    public void delete(ClaseArbol a){
        String del="DELETE FROM `arbol` WHERE `Paciente+_Id+`="+a.IdP+" AND `Paciente_NE_IdN`="+a.IdNE+";";
        try {
            PreparedStatement pst =(PreparedStatement) con.prepareStatement(del);
            pst.execute();
            aa.delete(a);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "R No Exitoso"+e.getMessage());
        }
    }
    public void llenarar(){
        String SQL="SELECT * FROM `arbol`;";
        try{
            Statement st = (Statement) con.createStatement();
            ResultSet rs = (ResultSet) st.executeQuery(SQL);
            while(rs.next()){
                ClaseArbol arr=new ClaseArbol(Integer.parseInt(rs.getString("Paciente+_Id+")),
                        Integer.parseInt(rs.getString("Paciente_NE_IdN")));
                 aa.insert(arr);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    
    public boolean buscarPareja(ClaseArbol a){
        
        if (aa.isEmpty()){return false;}
        
        Node<ClaseArbol> busqueda = aa.first;
        
        for(int i =0;i<aa.length();i++){
            if ((busqueda.value.IdP==a.IdP) && ((busqueda.value.IdNE==a.IdNE))){
                return true;
            }
            busqueda = busqueda.next;  
        }
        if(busqueda == null){
            return false;
        }
        return false;
    }
    
    public static void main(String args[]){
        
    }
}