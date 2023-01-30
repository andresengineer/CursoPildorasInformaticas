/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/		

package Modulo_4;
import java.io.*;

public class Acceso_Ficheros {
    
    public static void main(String[] args) {
        
        File ruta =
            new File("C:" + File.separator + "Users" +File.separator +"pc" + File.separator +
            "Documents" + File.separator + "NetBeansProjects" + File.separator + "CursoPildoras" +
            File.separator + "src" + File.separator + "main" + File.separator + "java" + 
            File.separator + "Modulo_4" );
        
        System.out.println(ruta.getAbsolutePath());
        String[] archivos = ruta.list();
        for(int i=0;i<archivos.length;i++){
            System.out.println(archivos[i]);
            
            File f= new File(ruta.getAbsolutePath(),archivos[i]);
            if(f.isDirectory()){
                String[] carpetaSec=f.list();
                for(int j=0;j<carpetaSec.length;j++){
                    System.out.println(carpetaSec[j]);
                }
            }
        }
    }
    
}
