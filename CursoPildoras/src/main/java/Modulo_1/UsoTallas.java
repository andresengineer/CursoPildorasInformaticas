/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_1;
import java.util.Scanner;

public class UsoTallas {

	public static void main(String[] args) {
	//enum Talla{MINI,MEDIANO,GRANDE,MUY GRANDE};
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escriba una talla: MINI, MEDIANA, GRANDE, MUY GRANDE");
		String entradaDatos = entrada.next().toUpperCase();
		
		Talla laTalla = Enum.valueOf(Talla.class, entradaDatos);	
		
		System.out.println("Talla : "+laTalla);
		System.out.println("Abreviatura : "+laTalla.getAbreviatura());
	}
		
		enum Talla{
			MINI ("S"),MEDIANO("M"),GRANDE("L"),MUYGRANDE("XL");
			
;			private String abreviatura;

			private Talla(String abreviatura){
				this.abreviatura = abreviatura;
			}
		
			public String getAbreviatura() {
				return abreviatura;
			}
		}
}
