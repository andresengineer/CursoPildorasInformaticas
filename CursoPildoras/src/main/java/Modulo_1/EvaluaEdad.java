/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_1;
import java.util.Scanner;

public class EvaluaEdad {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu edad, por favor");
        
        int edad = entrada.nextInt();
        
         if(edad <18){
             System.out.println("Eres un adolecente");
         }
         
         else if(edad<40){
             System.out.println("Eres un joven");
         }
         else if(edad<65){
             System.out.println("Eres maduro");
         }
         else{
             System.out.println("Ingresa una edad valida");
         }
    }
}
