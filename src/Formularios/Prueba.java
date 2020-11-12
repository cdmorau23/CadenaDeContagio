package Formularios;

import javax.swing.*;
import java.util.Random;

public class Prueba extends JFrame{
    private JPanel Fondo;
    private JLabel Resultado;
    public Prueba(Integer cc){
        String p="";
        Random r = new Random();
        int valorDado = r.nextInt(1);
        if(valorDado==1){
            p="Positiva";
        }
        else{
            p="Negativa";
        }
        Resultado.setText("Usuario "+cc+" su prueba es:"+p);
    }
}
