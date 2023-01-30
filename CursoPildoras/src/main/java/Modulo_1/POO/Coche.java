/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_1.POO;

public class Coche {

	private int ruedas,largo,ancho,motor,pesoPlataforma,pesoTotal;
	private String color;
	private boolean asientosCuero,climatizador;
	
	public Coche (){
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		pesoPlataforma = 500;
		
	}
	
	public String getDatosGenerales() {
		return "La plataforma del vehiculo tiene "+ruedas+" ruedas. mide "+largo/1000+" metros de largo, un ancho de "+ancho+" cm y un peso de "+pesoPlataforma+" kg";			
	}

	public void setColor(String colorCoche){
		color = colorCoche;
	}
	
	public String getColor(){
		return "El color del coche es "+color;
	}
	
	public void setAsientos (String asientosCuero) {
		if(asientosCuero.equalsIgnoreCase("si")) {
			this.asientosCuero = true;
		}
		else {
			this.asientosCuero = false;
		}
	}
	
	public String getAsientos(){
		if (asientosCuero == true) {
			return "el coche tiene asientos de cuero";
		}
		else {
			return "el coche tiene asientos de serie";
		}
	}
	
	public void setClimatizador (String climatizador) {
		if(climatizador.equalsIgnoreCase("si")) {	
			this.climatizador = true;
		}
		else {
			this.climatizador = false;
		}
	}
	
	public String getClimatizador() {
		if(climatizador == true) {
			return "El coche tiene climatizador";
		}
		else {
			return "el coche tiene aire acondicionado";
		}
	}
	
	public String getPesoCoche () {
		int pesoCarroceria = 500;
		pesoTotal = pesoPlataforma + pesoCarroceria; 
		
		if(asientosCuero == true){
			pesoTotal = pesoTotal + 50;
		}
		
		if(climatizador == true){
			pesoTotal = pesoTotal + 20;
		}
		
		return "El peso del coche es "+pesoTotal;
	}
	
	
	public int getPrecioCoche() {
		int precioFinalCoche = 10000;
		
		if(asientosCuero == true) {
			precioFinalCoche += 2000;
		}
		if (climatizador == true) {
			precioFinalCoche += 1500;
		}
		return precioFinalCoche;
			
	}
}