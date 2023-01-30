/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_2;

import java.awt.event.*;
import javax.swing.JFrame;
public class EventosRaton {

	public static void main(String[] args) {
		MarcoRaton Marco = new MarcoRaton();
		Marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}

class MarcoRaton extends JFrame{
	public MarcoRaton(){
		setVisible(true);
		setBounds(700,300,600,450);
		EventosDeRaton EventoRaton = new EventosDeRaton();
		addMouseListener(EventoRaton);
		EventosDeRaton2 EventoRaton2 = new EventosDeRaton2();
		addMouseMotionListener(EventoRaton2);
	}
}

class EventosDeRaton extends MouseAdapter{

	public void mouseClicked(MouseEvent e) {
		System.out.println("Has hecho click ---> \nCoordenada X: "+e.getX()+"\nCoordenada Y: "+e.getY());
		System.out.println(e.getClickCount());
	}
	
	public void mousePressed(MouseEvent e) {
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) {
			System.out.println("Has presionado el boton izquierdo");
		}else if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK) {
			System.out.println("Has presionado la rueda");
		}else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) {
			System.out.println("Has presionado el boton derecho");
		}
	}
}

class EventosDeRaton2 implements MouseMotionListener{

	public void mouseDragged(MouseEvent e) {
		System.out.println("Estas arrastrando");
	}

	public void mouseMoved(MouseEvent e) {
		System.out.println("Estas Moviendo");
	}
}