/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_1;

public class Calculos_Con_Math {

	public static void main(String[] args) {
		
		double num1 = 5.85;
		int  resultado1 = (int)Math.round(num1);
		double raiz = Math.sqrt(9);
		
		double base = 5, exponente = 3;
		int resultado2 =(int)Math.pow(base,exponente);
		
		System.out.println("La raiz de 9 es: "+raiz);
		System.out.println("El valor aproximado de "+num1+" es: " + resultado1);
		System.out.println("El resultado de "+ base + " elevado a " + exponente + " es " +  resultado2);
	}
}
