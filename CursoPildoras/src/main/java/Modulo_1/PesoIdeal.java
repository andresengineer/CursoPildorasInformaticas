/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_1;
import javax.swing.JOptionPane;

public class PesoIdeal {

	public static void main(String[] args) {
		String genero = " ";
		
		do {
			genero = JOptionPane.showInputDialog("Introduce tu genero (H/M)");

		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su altura en cm"));
		int pesoIdeal = 0;
		
		if (genero.equalsIgnoreCase("H")==true) {
			pesoIdeal = altura-110;
		}
		
		else if(genero.equalsIgnoreCase("M")==true){
			pesoIdeal = altura-120;
			
		}
		
		System.out.println("Su peso ideal es : "+pesoIdeal+" Kg");
	}

}
