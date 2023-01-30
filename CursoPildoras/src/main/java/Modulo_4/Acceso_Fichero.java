/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/		

package Modulo_4;
import java.io.*;

public class Acceso_Fichero {
    
    public static void main(String[] args) {
        Fichero_read accediendo = new Fichero_read();
        accediendo.lee();
    }
    
}

class Fichero_read{
    
    public void lee(){
        try {
            FileReader entrada = new FileReader("src/main/java/Modulo_4/ejemplo.txt");
            BufferedReader mibuffer = new BufferedReader(entrada);
            String linea = "";
            int c = 0;
            while(linea!=null){
                linea=mibuffer.readLine();
                if(linea!=null)
                System.out.println(linea);
            }
            entrada.close();
        } catch (IOException ex) {
           System.out.println("Archivo no encontrado");
        }
    }
}