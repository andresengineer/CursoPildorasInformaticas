/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/		

package Modulo_3;
import java.io.IOException;
import java.util.*;

public class Entrada_datos {

    public static void main(String[] args) {
        System.out.println("Qué deseas hacer?");
        System.out.println("1= Introducir datos");
        System.out.println("2= Salir del programa");
        Scanner entrada = new Scanner (System.in);
        int decision = entrada.nextInt();
        if (decision == 1){
            try{
                pedirDatos();
            } catch (Exception e){
                System.out.println("Inroduce los datos correctos");
            }
        } else {
            System.out.println("Adios");
            System.exit(0);
        }
        entrada.close();
    }
    
    static void pedirDatos() throws IOException{
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce tu nombre, por favor");
        String nombre_usuario = entrada.nextLine();
        System.out.println("Introduce edad, por favor");
        int edad = entrada.nextInt();
        System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + (edad + 1) + " años.");
        entrada.close();
        System.out.println("Fin del programa");
    }
    
}
