/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/		

package Modulo_3;
import javax.swing.JOptionPane;

public class Aleatorios {

    public static void main(String[] args) {
    
       int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce elementos para agregarlos a la matriz"));
       int num_aleat[] = new int [elementos];
       
       for (int i = 0; i < num_aleat.length; i++){
           num_aleat[i] = (int)(Math.random()*100);
       }
       
       for (int elem: num_aleat){
           System.out.println(elem);
       }
    }
}
    