/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_1.POO;

import javax.swing.*;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;

public class PruebaTemporizador {

	public static void main(String[] args) {
		
		DameLaHora oyente = new DameLaHora();
	
		Timer miTemporizador = new Timer(5000,oyente);
		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null, "presiona aceptar para detener");
		
		System.exit(0);
	}
}

class DameLaHora implements ActionListener{
	
	
	public void actionPerformed(ActionEvent e) {
		
		Date ahora = new Date();
		System.out.println("Establezco la hora cada 5 segundos: "+ahora);
		Toolkit.getDefaultToolkit().beep();
	}
	
}