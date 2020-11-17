package utils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import ClasesPaciente.PacienteNE;
import Formularios.TablaPacienteNE;
import java.sql.SQLException;

/**
 *
 * @author sordo
 */
public class ArbolBinario {
    class Nodo
    {
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
              
          }
      }

      public void imprimirPre ()
      {
          imprimirPre (raiz);
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
        
    }      
}
    

 