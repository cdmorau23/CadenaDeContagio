package ClasesPaciente;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import conexionSQL.conexionSQL;
import java.sql.ResultSet;

import javax.swing.*;
import java.sql.SQLException;
import utils.DoubleLinkedList;

public class Arbol{
    conexionSQL cc = new conexionSQL();
    Connection con = (Connection) cc.conexion();
    private int IdP;
    private int Idne;

    public Arbol(int idP, int idne) {
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
        String inser="INSERT INTO `arbol`(`Paciente+_Id+`, `Paciente_NE_IdN`) VALUES ("+this.getIdP()+","+this.getIdne()+");";
        try {
            PreparedStatement pst =(PreparedStatement) con.prepareStatement(inser);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "R No Exitoso"+e.getMessage());
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
        DoubleLinkedList<Arbol>aa=new DoubleLinkedList<>();
        String SQL="SELECT * FROM `arbol`;";
        try{
            Statement st = (Statement) con.createStatement();
            ResultSet rs = (ResultSet) st.executeQuery(SQL);
            while(rs.next()){
                Arbol arr=new Arbol(Integer.parseInt(rs.getString("Paciente+_Id+")),
                        Integer.parseInt(rs.getString("Paciente_NE_IdN")));
                    aa.insert(arr);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return aa;
    }
    public static void main(String args[]){
        PacienteNE nn=new PacienteNE();
        int i=nn.nAr(3);
        System.out.println(i);
    }
}