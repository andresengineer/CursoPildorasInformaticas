/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_1;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Areas {

	public static void main(String[] args) {
		
		//Escoger opcion
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe una opcion:   1.Cuadrado  2.Rectangulo  3.Triangulo  4.Circulo  " );
		int opcion = entrada.nextInt();
		
		switch(opcion) {
		
		case 1:
			int ladoCuadrado = Integer.parseInt(JOptionPane.showInputDialog("introduzca el lado del cuadrado"));		
			System.out.println("El area del cuadrado es : "+ladoCuadrado*ladoCuadrado);break;
		
		case 2:
			int baseRectangulo = Integer.parseInt(JOptionPane.showInputDialog("introduzca la base del cuadrado"));		
			int alturaRectangulo = Integer.parseInt(JOptionPane.showInputDialog("introduzca la altura del cuadrado"));		
			System.out.println("El area del rectangulo es : "+baseRectangulo*alturaRectangulo);break;
			
		case 3:
			int baseTriangulo = Integer.parseInt(JOptionPane.showInputDialog("introduzca la base del triangulo"));		
			int alturaTriangulo = Integer.parseInt(JOptionPane.showInputDialog("introduzca la altura del triangulo"));		
			System.out.println("El area del rectangulo es : "+(baseTriangulo*alturaTriangulo)/2);break;
		
		case 4:
			int radioCirculo = Integer.parseInt(JOptionPane.showInputDialog("introduzca el radio del circulo"));		
			System.out.print("El area del circulo es : ");
			System.out.printf("%1.3f",(Math.PI)*(Math.pow(radioCirculo,2)));break;
		default:
			System.out.println("Seleccione una opción correcta");
		}
	}
}
