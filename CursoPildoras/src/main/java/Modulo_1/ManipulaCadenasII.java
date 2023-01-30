/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_1;
public class ManipulaCadenasII {
    public static void main(String[] args) {
        
        String frase = "Hoy es un excelente dia para aprender a programar";
        String frase_resumen = frase.substring(0,29)+ "Irnos a la playa" + "y" + frase.substring(29,57);
        
        System.out.println(frase_resumen);
    }
}
