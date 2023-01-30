/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_1.POO;

public class Pruebas {

	public static void main(String[] args) {

		Empleados empleado1 = new Empleados ("Andres");
		Empleados empleado2 = new Empleados ("Wilson");
		Empleados empleado3 = new Empleados ("Felipe");
		Empleados empleado4 = new Empleados ("Camila");

		empleado1.setSeccion("RRHH");

		System.out.println(empleado1.getDatos());
		System.out.println(empleado2.getDatos());
		System.out.println(empleado3.getDatos());
		System.out.println(empleado4.getDatos());
	}
}

class Empleados{
	
	final private String nombre;
	private String seccion;
	private int Id;
	private static int IdSiguiente = 1;
	
	public Empleados (String nombre){
		
		this.nombre = nombre;
		seccion = "Administracion";
		Id = IdSiguiente;
		IdSiguiente++;
		
	}
	
	public void setSeccion (String seccion) {
		this.seccion = seccion;
	}
	
	public String getDatos() {
		return "El nombre del empleado es - "+nombre+" - su seccion es - "+seccion+" - su ID es : "+Id;
	}
		
}
