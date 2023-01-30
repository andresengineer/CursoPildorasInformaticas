/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/		

package Modulo_4;
import java.io.*;

public class Eliminar {
    
    public static void main(String[] args) {
        
        File ruta =
            new File("C:" + File.separator + "Users" +File.separator +"pc" + File.separator +
            "Documents" + File.separator + "NetBeansProjects" + File.separator + "CursoPildoras" +
            File.separator + "src" + File.separator + "main" + File.separator + "java" + 
            File.separator + "Modulo_4" + File.separator + "ejemplo.txt" );
        
        ruta.delete();
    }
}
