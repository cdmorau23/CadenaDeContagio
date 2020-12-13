/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import ClasesPaciente.PacienteNE;
import ClasesPaciente.PacienteP;
import utils.ArbolBinario;
import utils.DoubleLinkedList;
import utils.Myqueue;
import utils.Node;

/**
 *
 * @author ASUS
 */
public class Test {
 
    public static void main(String[] args) throws InterruptedException {
         
        DoubleLinkedList<PacienteNE> LISTA = new DoubleLinkedList<PacienteNE>();
        
        int casos = 1000;

        int Id = casos-1;

        long inicioInsert = System.currentTimeMillis();       
        
        for (int i = 0; i < casos ;i++){
        int CedulaRandom = (int) Math.floor(Math.random()*casos);
        PacienteNE juanito = new PacienteNE ((i),"Juancho",CedulaRandom,"165519606","calle de juancho","200-03-12",1,1,1);
        LISTA.insert(juanito);       
        }
        
        long finInsert = System.currentTimeMillis();
        double tiempoB = (double) ((finInsert - inicioInsert));
        System.out.println(tiempoB +" milisegundos");
        Myqueue nn=new Myqueue();
        ArbolBinario bb=new ArbolBinario();
        for(int i=0; i<LISTA.length()-1;i++){
            bb.insertar(LISTA.getAtIndex(i));
        }
        bb.imprimirPre(nn);
        finInsert = System.currentTimeMillis();
        tiempoB = (double) ((finInsert - inicioInsert));
        System.out.println(tiempoB +" milisegundos");
        
         
    }
    
     static  PacienteNE busqueda(int id, DoubleLinkedList<PacienteNE> LISTA){
    
        Node<PacienteNE> busqueda = LISTA.first;
        
        while(busqueda != null){
            if (busqueda.value.getId()==id){
                return busqueda.value;
            }
            busqueda = busqueda.next;  
        }
        return null;
    }
     
      
     
     
}
