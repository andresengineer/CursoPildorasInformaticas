/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_1;
import javax.swing.*;

public class EntradaNumeros {

	public static void main(String[] args) {

		String num1 = JOptionPane.showInputDialog("Introduzca un numero");
		double num2 = Double.parseDouble(num1);
		
		System.out.print("La raiz de "+num2+" es ");
		System.out.printf("%1.4",Math.sqrt(num2));
	}

}
