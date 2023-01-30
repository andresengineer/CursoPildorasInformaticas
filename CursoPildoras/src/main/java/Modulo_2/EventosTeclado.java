/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_2;

import java.awt.event.*;
import javax.swing.JFrame;

public class EventosTeclado {
	public static void main(String[] args) {
		MarcoConTeclas Marco = new MarcoConTeclas();
		Marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}

class MarcoConTeclas extends JFrame{
	public MarcoConTeclas(){
		setVisible(true);
		setBounds(700,300,600,450);
		EventoDeTeclado tecla = new EventoDeTeclado();
		addKeyListener(tecla);
	}
}

class EventoDeTeclado implements KeyListener{
	public void keyTyped(KeyEvent e) {
		char letra = e.getKeyChar();
		System.out.println(letra);
	}
	public void keyPressed(KeyEvent e) {
		int codigo = e.getKeyCode();
		System.out.println(codigo);
	}
	public void keyReleased(KeyEvent e) {
		
	}	
}