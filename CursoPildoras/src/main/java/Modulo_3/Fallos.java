/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/		

package Modulo_3;
import javax.swing.*;

public class Fallos {
    public static void main(String[] args) {
        int [] Matriz=new int [5];
        
        Matriz[0]=5;
        Matriz[1]=38;
        Matriz[2]=15;
        Matriz[3]=92;
        Matriz[4]=71;
        Matriz[5]=81;

        for (int i = 0; i < 5; i++){
            
            System.out.println("Posición " + i + " = " + Matriz[i]);
        }
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad: "));
        System.out.println("Hola " + nombre + " tienes " + edad + " años. " + "El programa terminó su ejecución");
    }
}
