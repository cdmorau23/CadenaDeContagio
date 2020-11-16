package ClasesPaciente;

import static Formularios.TablaPacienteNE.ListaPacientesNE;
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
    private int IdP;
    private int Idne;
    public static DoubleLinkedList<Arbol>aa;


    public Arbol(int idP, int idne,conexionSQL cc, Connection con,DoubleLinkedList<Arbol>aa) {
        this.cc=cc;
        this.con = con;
        IdP = idP;
        Idne = idne;
    }

    Arbol() {
    }

    public int getIdP() {
        return IdP;
    }

    public void setIdP(int idP) {
        IdP = idP;
    }

    public int getIdne() {
        return Idne;
    }

    public void setIdne(int idne) {
        Idne = idne;
    }
    public void insertar() {
        
        if(this.buscarPareja()){}
        else{
        String inser="INSERT INTO `arbol`(`Paciente+_Id+`, `Paciente_NE_IdN`) VALUES ("+this.getIdP()+","+this.getIdne()+");";
        try {
            PreparedStatement pst =(PreparedStatement) con.prepareStatement(inser);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro en arbol No Exitoso"+e.getMessage());
        }
        }
    }
    public void delete(){
        String del="DELETE FROM `arbol` WHERE `Paciente+_Id+`="+this.getIdP()+" AND `Paciente_NE_IdN`="+this.getIdne()+";";
        try {
            PreparedStatement pst =(PreparedStatement) con.prepareStatement(del);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "R No Exitoso"+e.getMessage());
        }
    }
    public DoubleLinkedList<Arbol> llenarar(){
        String SQL="SELECT * FROM `arbol`;";
        try{
            Statement st = (Statement) con.createStatement();
            ResultSet rs = (ResultSet) st.executeQuery(SQL);
            while(rs.next()){
                Arbol arr=new Arbol(Integer.parseInt(rs.getString("Paciente+_Id+")),
                        Integer.parseInt(rs.getString("Paciente_NE_IdN")),this.cc,this.con,this.aa);
                    aa.insert(arr);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return aa;
    }
    
    public boolean buscarPareja(){
        
        if (aa.isEmpty()){return false;}
        
        Node<Arbol> busqueda = aa.first;
        
        for(int i =0;i<aa.length();i++){
            if ((busqueda.value.getIdP()==IdP) && ((busqueda.value.getIdne()==Idne))){
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
        PacienteNE nn=new PacienteNE();
        int i=nn.nAr(3);
        System.out.println(i);
    }
}