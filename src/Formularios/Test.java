/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import ClasesPaciente.PacienteP;
import Formularios.TablaPacienteP.ListaPacientesP;
import utils.DoubleLinkedList;
import utils.Node;

/**
 *
 * @author ASUS
 */
public class Test {
 
    public static void main(String[] args) throws InterruptedException {
         
        DoubleLinkedList<PacienteP> LISTA = new DoubleLinkedList<PacienteP>();
        
        int casos = 100000000;

        int Id = casos-1;

        long inicioInsert = System.currentTimeMillis();       
        
        for (int i = 0; i < casos ;i++){
        int CedulaRandom = (int) Math.floor(Math.random()*casos);
        PacienteP juanito = new PacienteP ((i),"Juancho",CedulaRandom,"165519606","calle de juancho","200-03-12");
        LISTA.insert(juanito);       
        }
        
        long finInsert = System.currentTimeMillis();
        double tiempoB = (double) ((finInsert - inicioInsert));
        System.out.println(tiempoB +" milisegundos");

        
               
        long inicio = System.currentTimeMillis();       
        
        busqueda(Id,LISTA);
         
        long fin = System.currentTimeMillis();
         
        double tiempo = (double) ((fin - inicio));
         
        System.out.println(tiempo +" milisegundos");
         
    }
    
     static  PacienteP busqueda(int id, DoubleLinkedList<PacienteP> LISTA){
    
        Node<PacienteP> busqueda = LISTA.first;
        
        while(busqueda != null){
            if (busqueda.value.getId()==id){
                return busqueda.value;
            }
            busqueda = busqueda.next;  
        }
        return null;
    }
     
      
     
     
}
