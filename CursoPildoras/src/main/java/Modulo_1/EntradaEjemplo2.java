/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_1;
import javax.swing.*;

public class EntradaEjemplo2 {
    public static void main(String[] args) {
        
       String nombre_Usuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
       String edad = JOptionPane.showInputDialog("Introduce tu edad, por favor");
       
       int edad_Usuario = Integer.parseInt(edad);
       edad_Usuario++;
       
        System.out.println("Hola" + nombre_Usuario + ". El año que viene tendras " + edad + " años");
       
    }
}
