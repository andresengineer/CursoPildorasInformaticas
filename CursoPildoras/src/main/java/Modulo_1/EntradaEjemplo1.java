/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_1;
import java.util.Scanner;

public class EntradaEjemplo1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		String nombreUsuario = entrada.nextLine();
		
		System.out.println("Introduce tu edad: ");
		int edad = entrada.nextInt();
		
		System.out.println("Hola "+nombreUsuario+" tú tienes "+edad+" años");
		
		
	}

}
