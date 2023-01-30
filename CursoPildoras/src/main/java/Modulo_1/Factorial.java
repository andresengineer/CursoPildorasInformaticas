/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_1;
import javax.swing.JOptionPane;

public class Factorial {
    public static void main(String[] args) {
        Long resultado = 1L;
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        
        for(int i = numero; i>0; i--){
            resultado = resultado*i;
        }
        System.out.println("El factorial de " + numero + " es " + resultado);
    }
}