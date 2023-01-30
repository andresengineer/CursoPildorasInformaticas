/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_1;
import java.util.Scanner;


public class Adivina_Numero {
    
    public static void main(String[] args) {
      
        
        int aleatorio=(int)(Math.random()*100);
        Scanner entrada=new Scanner(System.in);
        int numero=0;
        int intentos=0;
        do{
            intentos++;
            System.out.println("Introduce un número");
            numero=entrada.nextInt();   
            if(aleatorio<numero){
                System.out.println("Mayor");
            } else if(aleatorio>numero){
                System.out.println("Menor");
            }
     
        }while(numero!=aleatorio);
        
        System.out.println("Correcto");
    }

}
