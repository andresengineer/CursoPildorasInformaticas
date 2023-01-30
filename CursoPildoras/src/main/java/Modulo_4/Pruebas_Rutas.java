/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/		

package Modulo_4;
import java.io.*;

public class Pruebas_Rutas {
    
    public static void main(String[] args) {
        
        File archivo = new File("bin");
        System.out.println(archivo.getAbsolutePath());
        System.out.println(archivo.exists());
    }
    
}
