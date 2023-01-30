/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/		

package Modulo_4;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Serializando {
    
     public static void main(String[] args) {
         
         Administrador jefe = new Administrador("Andres", 80000, 2005, 12, 15);
         jefe.setIncentivo(5000);
         Empleado[] personal = new Empleado[3];
         personal[0] = jefe;
         personal[1] = new Empleado ("Wilson", 25000, 2008, 10, 1);
         personal[2] = new Empleado("Luis", 18000, 2012, 9, 15);
         try{
             ObjectOutputStream escribiendo_fichero = new ObjectOutputStream(new FileOutputStream
        ("C:/Users/pc/Documents/NetBeansProjects/CursoPildoras/src/main/java/Modulo_4/empleado.dat"));
             escribiendo_fichero.writeObject(personal);
             escribiendo_fichero.close();
             ObjectInputStream recuperando_fichero=new ObjectInputStream(new FileInputStream 
             ("C:/Users/pc/Documents/NetBeansProjects/CursoPildoras/src/main/java/Modulo_4/empleado.dat"));
             
             Empleado[] personalback = (Empleado[]) recuperando_fichero.readObject();
             recuperando_fichero.close();
             
             for(Empleado e: personalback){
                 System.out.println(e);
             }
         }catch(IOException e){
             
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Serializando.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
}

class Empleado implements Serializable{
    
    public Empleado(String n, double s, int agno, int mes, int dia){
        nombre = n;
        sueldo = s;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        fechaContrato=calendario.getTime();
    }
    
    public String getNombre(){
        return nombre;
    }
    public double getSueldo(){
        return sueldo;
    }
    public Date getFechaContrato(){
        return fechaContrato;
    }
    public void subirSueldo(double porcentaje){
        double aumento = sueldo*porcentaje/100;
        
        sueldo+=aumento;
    }
    public String toString(){
        return "El nombre es:" + nombre + ", y su sueldo es:" + sueldo + ", fecha de contrato:" + fechaContrato;
    }
    private String nombre;
    private double sueldo;
    private Date fechaContrato;
}

class Administrador extends Empleado{
    
    public Administrador(String n, double s, int agno, int mes, int dia){
        super(n,s,agno,mes,dia);
        incentivo=0;
    }
    public double getSueldo(){
        double sueldoBase = super.getSueldo();
        return sueldoBase + incentivo;
    }
    public void setIncentivo(double b){
        incentivo=b;
    }
    public String toString(){
        return super.toString() + "incentivo" + incentivo;
    }
    private double incentivo;   
}
