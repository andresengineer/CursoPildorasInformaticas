/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_2;

import javax.swing.*;
import java.awt.event.*;

public class EventosVentana {
	public static void main(String[] args) {
		MarcoVentana Marco1 = new MarcoVentana();
		Marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		Marco1.setTitle("Ventana 1");
		Marco1.setBounds(100,300,500,350);
		MarcoVentana Marco2 = new MarcoVentana();
		Marco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
		Marco2.setTitle("Ventana 2");
		Marco2.setBounds(700,300,500,350);
	}
}

class MarcoVentana extends JFrame{
	public MarcoVentana(){
		setVisible(true);
		addWindowListener(new MVentana());
	}
}

class MVentana extends WindowAdapter{
	public void windowIconified(WindowEvent e) {
		System.out.println("Ventana Minimizada");
	}
}
