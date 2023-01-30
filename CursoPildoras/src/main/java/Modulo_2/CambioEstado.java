/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_2;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class CambioEstado {

	public static void main(String[] args) {

		MarcoEstado miMarco = new MarcoEstado();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}

class MarcoEstado extends JFrame{

	public MarcoEstado(){
		setVisible(true);
		setBounds(300,300,500,350);	
		CambiaEstado nuevoEstado = new CambiaEstado();
		addWindowStateListener(nuevoEstado);
	}
}

class CambiaEstado implements WindowStateListener{
	public void windowStateChanged(WindowEvent e) {
		
		if(e.getNewState()==Frame.MAXIMIZED_BOTH) {
			System.out.println("La Ventana esta a pantalla completa");
		}else if(e.getNewState()==Frame.NORMAL) {
			System.out.println("La Ventana está normal");
		}else if(e.getNewState()==Frame.ICONIFIED) {
			System.out.println("La Ventana está minimizada");
		}
	}
}