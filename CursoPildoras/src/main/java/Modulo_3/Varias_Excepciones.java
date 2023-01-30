/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/		

package Modulo_3;
import javax.swing.JOptionPane;

public class Varias_Excepciones {
    public static void main(String[] args) {
        
        try{
            divicion();
        }catch(ArithmeticException e){
            System.out.println("No se permite la divición por 0");
        }catch(NumberFormatException e){
            System.out.println("No has introducido un numero");
            System.out.println(e.getMessage());
            System.out.println("Se ha generado un error de este tipo: " + e.getClass().getName());
        }
    } 
    
    static void divicion(){
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor "));
        
        System.out.println("El resultado es: "+num1/num2);
    }
    
}