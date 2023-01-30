/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/		

package Modulo_4;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Creando {
    public static void main(String[] args) {
    File ruta =
            new File("C:" + File.separator + "Users" +File.separator +"pc" + File.separator +
            "Documents" + File.separator + "NetBeansProjects" + File.separator + "CursoPildoras" +
            File.separator + "src" + File.separator + "main" + File.separator + "java" + 
            File.separator + "Modulo_4" + File.separator + "ejemplo.txt" );
     
     String archivo_destino = ruta.getAbsolutePath();
        try {
            ruta.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Creando.class.getName()).log(Level.SEVERE, null, ex);
        }
        Escribiendo acceder = new Escribiendo();
        acceder.escribir(archivo_destino);
    }
    
}

class Escribiendo{
    public void escribir(String path){
        
        String frase = "Ejemplo";
        try{
            FileWriter escritura = new FileWriter(path);
            
            for(int i=0;i<frase.length();i++){
                escritura.write(frase.charAt(i));
            }
            escritura.close();
        }catch(IOException e){}
    }
}
