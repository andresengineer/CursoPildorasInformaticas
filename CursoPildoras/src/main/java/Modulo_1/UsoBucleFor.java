/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_1;
import java.util.Scanner;

public class UsoBucleFor {

	public static void main(String[] args) {

		 Scanner entrada = new Scanner(System.in);
		 System.out.println("Introduzca su nombre: ");
		 String nombre = entrada.nextLine();
		 
		 for(int i = 1;i <= 10; i++) {
			 System.out.println(nombre);
			 
		 }
	}
}
