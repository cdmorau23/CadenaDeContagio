package utils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import ClasesPaciente.PacienteNE;
import Formularios.TablaPacienteNE;
import static Formularios.TablaPacienteNE.ListaPacientesNE;
import static Formularios.TablaPacienteNE.con;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author sordo
 */
public class ArbolBinario {
    class Nodo
    {   
        DoubleLinkedList<PacienteNE> PacientesNE = ListaPacientesNE;
        PacienteNE nn;
        Nodo izq, der;
        public Nodo(PacienteNE nn){
            this.nn=nn;
            this.izq=null;
            this.der=null;
        }
        
    }
    Nodo raiz;

    public ArbolBinario() {
        raiz=null;
    }
            
    public void insertar (PacienteNE nne) {
            Nodo nuevo;
            nuevo = new Nodo (nne);
            if (raiz == null)
                raiz = nuevo;
            else {
                Nodo anterior = null, reco;
                reco = raiz;
                while (reco != null)  {
                    anterior = reco;
                    if (pacienteseleccion(nne, reco.nn))
                        reco = reco.izq;
                    else
                        reco = reco.der;
                }
                if (pacienteseleccion(nne, anterior.nn))
                    anterior.izq = nuevo;
                else
                    anterior.der = nuevo;
            }   
    }

    public void mayorValorl() {
        if (raiz!=null) {
            Nodo reco=raiz;
            while (reco.der!=null)
                reco=reco.der;
            System.out.println("Mayor valor del árbol:"+reco.nn.Nombre);
        }
    }
    
    public void borrarMenor() {
        if (raiz!=null) {
            if (raiz.izq==null)
                raiz=raiz.der;
            else {
                Nodo atras=raiz;
                Nodo reco=raiz.izq;
                while (reco.izq!=null) {
                    atras=reco;
                    reco=reco.izq;
                }
                atras.izq=reco.der;
            }                  
        }
    }
    
    
    

      private void imprimirPre (Nodo reco)
      {
          if (reco != null)
          {
              System.out.print(reco.nn.Nombre + " ");
              imprimirPre (reco.izq);
              imprimirPre (reco.der);
          }
      }

      public void imprimirPre ()
      {
          imprimirPre (raiz);
          System.out.println();
      }
      
      public void LlenarArbol() throws SQLException{
          this.LlenarLista();
          while(ListaPacientesNE.size>0){
              this.insertar(ListaPacientesNE.getFirst());
              ListaPacientesNE.deleteFirst();
          }
          this.LlenarLista();
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
         
    public boolean pacienteseleccion(PacienteNE n1,PacienteNE n2){
        
        if(n1.R_Biologico>n2.R_Biologico){
            return false;
        }
        else if(n1.R_Biologico<n2.R_Biologico){
            return true;
        }
        else if(n1.R_Biologico==n2.R_Biologico && n1.N_Arboles>n2.N_Arboles){
            return false;
        }
        else if(n1.R_Biologico==n2.R_Biologico && n1.N_Arboles<n2.N_Arboles){
            return true;
        }
        else if(n1.R_Biologico==n2.R_Biologico && n1.N_Arboles==n2.N_Arboles && n1.id<n2.id){
            return false;
        }
        else if(n1.R_Biologico==n2.R_Biologico && n1.N_Arboles==n2.N_Arboles && n1.id>n2.id){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main (String [] ar) throws SQLException
    {
        ArbolBinario a = new ArbolBinario();
        a.LlenarArbol();
        a.imprimirPre();
        
    }      
}
    

 