/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class EjemploArea {

	public static void main(String[] args) {
		MarcoArea miMarco = new MarcoArea();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoArea extends JFrame{
	public MarcoArea() {
		setBounds(500,300,500,350);
		LaminaArea miLamina = new LaminaArea();
		add(miLamina);
		setVisible(true);
	}
}

class LaminaArea extends JPanel{
	public LaminaArea() {
		Area = new JTextArea(8,20);
		JScrollPane laminaBarras = new JScrollPane(Area);
		Area.setLineWrap(true);
		add(laminaBarras);
		JButton boton = new JButton("Go!");
		boton.addActionListener(new GestionaArea());
		add(boton);
	}
	
	private class GestionaArea implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			System.out.println(Area.getText());
		}
	}
	
	private JTextArea Area; 
}