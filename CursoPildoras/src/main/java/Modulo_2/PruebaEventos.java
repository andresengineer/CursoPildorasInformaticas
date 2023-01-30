/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PruebaEventos {
	public static void main(String[] args) {
		MarcoBotones Marco = new MarcoBotones();
		Marco.setVisible(true);
		Marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}

}

class MarcoBotones extends JFrame{
	
	public MarcoBotones(){
		setTitle("Botones y Eventos");
		setBounds(700,300,500,300);
		LabelBoton Label = new LabelBoton();
		add(Label);
	}
}

class LabelBoton extends JPanel {
	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");
	public LabelBoton() {
	add(botonAzul);
	add(botonAmarillo);
	add(botonRojo);
	ColorFondo Amarillo = new ColorFondo(Color.YELLOW);
	ColorFondo Azul = new ColorFondo(Color.BLUE);
	ColorFondo Rojo = new ColorFondo(Color.RED);
	botonAzul.addActionListener(Azul);
	botonAmarillo.addActionListener(Amarillo);
	botonRojo.addActionListener(Rojo);
	}
	
	private class ColorFondo implements ActionListener{
		
		public ColorFondo(Color c) {
			colorDeFondo = c;
		}
		public void actionPerformed (ActionEvent e) {
			setBackground(colorDeFondo);
		}
		private Color colorDeFondo;
	}
}

