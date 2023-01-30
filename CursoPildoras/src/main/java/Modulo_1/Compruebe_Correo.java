/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_1;
import javax.swing.JOptionPane;


public class Compruebe_Correo {
    public static void main(String[] args) {
        int arroba = 0;
        boolean punto = false;
        
        String correo = JOptionPane.showInputDialog("Introduce tu correo");
        for(int i=0; i<correo.length();i++){
            if(correo.charAt(i)=='@'){
                arroba ++;
            }
            if (correo.charAt(i)=='.'){
                punto = true;
            }
        }
        if(arroba == 1 && punto == true){
            System.out.println("El correo es correcto");
        } else{
            System.out.println("El correo no es correcto");
        }
    }
}

