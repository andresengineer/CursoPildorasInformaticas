/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;

public class Layouts {
	
	public static void main(String[] args) {
		MarcoLayout marco = new MarcoLayout();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		marco.setVisible(true);
	}
}

class MarcoLayout extends JFrame{
	public MarcoLayout(){
		setTitle("Probar Acciones");
		setBounds(600,350,600,300);
		PanelLayout Label = new PanelLayout();
		PanelLayout2 Label2 = new PanelLayout2();
		add(Label,BorderLayout.NORTH);
		add(Label2,BorderLayout.SOUTH);
		
	}
}

class PanelLayout extends JPanel{
	public PanelLayout() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JButton("Amarillo"));
		add(new JButton("Rojo"));
	}
}

class PanelLayout2 extends JPanel{
	public PanelLayout2() {
		setLayout(new BorderLayout());
		add(new JButton("Azul"),BorderLayout.WEST);
		add(new JButton("Verde"),BorderLayout.EAST);
		add(new JButton("Negro"),BorderLayout.CENTER);
	}
}