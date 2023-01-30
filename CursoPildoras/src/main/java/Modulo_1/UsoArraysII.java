/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_1;

public class UsoArraysII {
    public static void main(String[] args) {
        int[] matriz_aleatorios = new int [150];
        for(int i =0; i<matriz_aleatorios.length; i++){
            matriz_aleatorios[i] = (int)Math.round(Math.random()*100);
            
        }
        for(int numeros:matriz_aleatorios){
            System.out.println(numeros + " ");
        }
    }
}
