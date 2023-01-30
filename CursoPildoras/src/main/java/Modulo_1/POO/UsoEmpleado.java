/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_1.POO;

import java.util.*;

public class UsoEmpleado {

	public static void main(String[] args) {
	
		Jefatura jefeRRHH = new Jefatura("Luis",55000,2006,9,25);
		jefeRRHH.setIncentivo(2570);
		
		Empleado misEmpleados[] = new Empleado[6];
		misEmpleados[0] = new Empleado("Andres",85000,1990,12,17);
		misEmpleados[1] = new Empleado("Wilson",95000,1995,06,02);
		misEmpleados[2] = new Empleado("Felipe",105000,2002,03,15);
		misEmpleados[3] = new Empleado("Camila");
		misEmpleados[4] = jefeRRHH;  
		misEmpleados[5] = new Jefatura("luisa",95000,1999,5,26);
		Jefatura jefaFinanzas = (Jefatura)misEmpleados[5];
		jefaFinanzas.setAumentoSueldo(55000);
		
		
		Empleado directorComercial = new Jefatura ("Carlos",85000,2012,05,05);
		Comparable ejemplo = new Empleado ("Maria",95000,2011,06,07);
		
		
		if (directorComercial instanceof Empleado) {
			System.out.println("Es de tipo Jefatura");
		}
		if (ejemplo instanceof Comparable) {
			System.out.println("Implementa la interfaz Comparable");
		}
		
		System.out.println(jefaFinanzas.setTomarDecisiones("dar mas dias de vacaciones a los empleados"));
		System.out.println("El jefe "+jefaFinanzas.getNombre()+" tiene un bonus de "+jefaFinanzas.setBonus(500));
		
		System.out.println(misEmpleados[3].getNombre()+" tiene un bonus de "+misEmpleados[3].setBonus(500));
		
		for (Empleado e: misEmpleados) {
			e.setAumentoSueldo(5);
		}
		Arrays.sort(misEmpleados);
		
		for (Empleado e: misEmpleados) {
			System.out.println("Nombre : "+e.getNombre()+" / Sueldo : "+e.getSueldo()+" / Fecha Alta : "+e.getFechaAltaContrato());
		}	
	}
}



class Empleado implements Comparable,Trabajadores{
	
	public Empleado(String nombre, double sueldo, int anio, int mes, int dia) {
		
		this.nombre = nombre;
		this.sueldo = sueldo;
		Id = IdSiguiente;
		IdSiguiente ++;
		GregorianCalendar calendario = new GregorianCalendar (anio, mes-1,dia);
		altaContrato = calendario.getTime();
	}
	
	public Empleado(String nombre){
		this(nombre,30000,2000,01,01);	
	}
	
	
	public String getNombre(){
		return nombre+" ID : "+Id;
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
	
	public double setBonus(double gratificacion) {
		return Trabajadores.bonusBase+gratificacion;
	}
	
	public int compareTo(Object miObjeto){
		Empleado otroEmpleado = (Empleado)miObjeto;	
		
		if (this.Id < otroEmpleado.Id) {
			return -1;
		}
		if (this.Id > otroEmpleado.Id) {
			return 1;
		}
		
		return 0;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente = 1;
	private int Id;
}




class Jefatura extends Empleado implements Jefes {

	private double incentivo;
	
	public Jefatura( String nombre, double sueldo, int anio, int mes, int dia){
		super( nombre, sueldo, anio, mes, dia);	
	}
	
	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	
	public double getSueldo(){
		double sueldoJefe = super.getSueldo();
		return sueldoJefe + incentivo;
	}
	
	public String setTomarDecisiones(String decision){
		return "Un miembro de la direccion ha tomado la decision de "+decision;
	}
	
	//Sobreescritura metodo heredado setBonus
	public double setBonus (double gratificacion) {//SETTER
		double prima = 2000;
		return Trabajadores.bonusBase+gratificacion+prima;
	}

    @Override
    public String Tomar_Decisiones(String decision) {
            return null;
    }
}


