/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_1;

import javax.swing.JOptionPane;


public class Acceso_Aplicacion {
    
    public static void main(String[] args) {
        String clave="Admin";
        String pass="";
        while(clave.equals(pass)==false){
            pass=JOptionPane.showInputDialog("Digite la contrasenia");
            if(clave.equals(pass)==false){
                System.out.println("No es correcta");
            }
        }
        System.out.println("Contraseña correcta");
    }
            

}
