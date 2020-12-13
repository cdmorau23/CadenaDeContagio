/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import ClasesPaciente.PacienteNE;
import java.lang.reflect.Array;
import java.util.Arrays;
import utils.DoubleLinkedList;

/**
 *
 * @author sordo
 */
public class Table_Hash {
    PacienteNE[] nn;
    int tamaño, contador;
    public Table_Hash(){
        tamaño=100000000;
        nn= new PacienteNE[tamaño];
        Arrays.fill(nn, "-1");
    }
    public void funcionHash(DoubleLinkedList ListaPacientesNE, PacienteNE[] nn){
        for(int i=0;i<ListaPacientesNE.length();i++){
            PacienteNE elem=new PacienteNE();
            elem=(PacienteNE) ListaPacientesNE.getAtIndex(i);
            int indice= elem.Cedula;
            nn[indice]=elem;
        }
    }
    public void mostrar(){
    
    }
}
