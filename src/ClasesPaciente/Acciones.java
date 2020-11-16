/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesPaciente;

/**
 *
 * @author ASUS
 */


import utils.MyStack;

public class Acciones {
    
    public String AccionOriginal;
    public String Inversa;

    public Acciones(String AccionOriginal, String Inversa) {
        this.AccionOriginal = AccionOriginal;
        this.Inversa = Inversa;
    }

    public String getAccionOriginal() {
        return AccionOriginal;
    }

    public void setAccionOriginal(String AccionOriginal) {
        this.AccionOriginal = AccionOriginal;
    }

    public String getInversa() {
        return Inversa;
    }

    public void setInversa(String Inversa) {
        this.Inversa = Inversa;
    }
    
    
    
    
}
