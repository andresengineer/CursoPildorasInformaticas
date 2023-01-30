/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/		

package Modulo_4;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Escribir_Fichero {
    
    public static void main(String[] args) {
        Escribiendo acceder = new Escribiendo();
        acceder.escribir();
    }
}

class Escribiendo{
    public void escribir(){
        String frase = "Ejemplo2";
        
        try {
            FileWriter escritura = new FileWriter("src/main/java/Modulo_4/ejemplo.txt");
            
            for(int i=0;i<frase.length();i++){
                escritura.write(frase.charAt(i));
            }
            escritura.close();
        } catch (IOException ex) {
            Logger.getLogger(Escribiendo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}