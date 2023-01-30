/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_1.POO;

public class Furgoneta extends Coche {

	private int CapacidadCarga;
	private int PlazasExtra;
	
	public Furgoneta(int PlazasExtra, int CapacidadCarga) {
		super();
		this.CapacidadCarga = CapacidadCarga;
		this.PlazasExtra = PlazasExtra;
	}
	
	public String getDatosFurgoneta() {
		return "La capacidad de carga de la furgoneta es: "+CapacidadCarga+ " kg y las plazas son: "+PlazasExtra;
	}
}
