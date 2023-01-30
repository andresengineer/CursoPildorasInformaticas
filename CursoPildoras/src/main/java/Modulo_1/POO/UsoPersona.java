/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_1.POO;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoPersona {

	public static void main(String[] args) {

		Persona lasPersonas[] = new Persona[2];	
		
		lasPersonas[0] = new Empleado2("Andres",50000,2009,02,25);	
		lasPersonas[1] = new Alumno("Wilson ","ing");	

		
		for(Persona e: lasPersonas){
			System.out.println(e.getNombre()+" / "+e.getDescripcion());
		}
	}
}

abstract class Persona{
	
	private String nombre;
	
	public Persona(String nombre){
		this.nombre = nombre;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public abstract String getDescripcion();
}

class Empleado2 extends Persona{
	
	public Empleado2(String nombre, double sueldo, int anio, int mes, int dia) {
		
		super(nombre);
		this.sueldo = sueldo;
		Id = IdSiguiente;
		IdSiguiente ++;
		GregorianCalendar calendario = new GregorianCalendar (anio, mes-1,dia);
		altaContrato = calendario.getTime();
	}
	
	
	public String getDescripcion() {
		return "Este empleado tiene Id : "+Id+" y un sueldo de "+sueldo;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	
	public Date getFechaAltaContrato () {
		return altaContrato;
	}
	
	public void setAumentoSueldo(double porcentaje) {
		
		double aumento = sueldo*porcentaje/100;
		sueldo += aumento;	
	}
	
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente = 1;
	private int Id;
}


class Alumno extends Persona{
	
	private String carrera;
	
	public Alumno(String nombre, String carrera){
		super(nombre);
		this.carrera = carrera;
	}

        public String getDescripcion() {
		return "Este alumno esta estudiando la carrera de "+carrera;
	}
}