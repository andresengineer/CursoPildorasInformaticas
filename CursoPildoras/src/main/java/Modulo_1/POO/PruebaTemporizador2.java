/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_1.POO;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;


public class PruebaTemporizador2 {

	public static void main(String[] args) {

		Reloj miReloj = new Reloj();
		miReloj.enMarcha(3000,true);
		JOptionPane.showMessageDialog(null,"Presiona aceptar para terminar");
		System.exit(0);
	}
}


class Reloj{
	
	public void enMarcha(int intervalo, final boolean sonido) {
		
		class DameLaHora2 implements ActionListener{
			
			public void actionPerformed(ActionEvent e) {
				Date ahora = new Date();
				System.out.println("Establezco la hora cada 2 segundos "+ahora);
				
				if(sonido) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
		}
		
		ActionListener oyente = new DameLaHora2();
		Timer miTemporizador = new Timer (intervalo,oyente);
		miTemporizador.start();
	}
	
	private int intervalo;
	private boolean sonido;
	
	
}