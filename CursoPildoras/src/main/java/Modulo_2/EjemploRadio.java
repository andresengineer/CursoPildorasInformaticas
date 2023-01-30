/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_2;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class EjemploRadio {
	public static void main(String[] args) {
		MarcoRadio Marco = new MarcoRadio();
		Marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoRadio extends JFrame{
	public MarcoRadio() {
		setVisible(true);
		setBounds(550,300,500,300);
		LabelRadio Label = new LabelRadio();
		add(Label);
	}
}

class LabelRadio extends JPanel{
	public LabelRadio() {
		
		setLayout(new BorderLayout());
		texto = new JLabel(" txt ...");
		
		texto.setFont(new Font("Serif",Font.PLAIN,20));
		
		add(texto, BorderLayout.CENTER);
		
		Labelboton = new JPanel();
		miGrupo = new ButtonGroup();
		
		colocarBotones("Pequeño",false,7);
		colocarBotones("Mediano",true,12);
		colocarBotones("Grande",false,18);
		colocarBotones("Muy GRANDE",false,24);
		
		add(Labelboton,BorderLayout.SOUTH);
	}
	
	public void colocarBotones(String nombre, Boolean seleccionado, final int tamanio) {
		
		JRadioButton boton = new JRadioButton(nombre,seleccionado);
		
		miGrupo.add(boton);
		
		Labelboton.add(boton);
		
		ActionListener miEvento = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				texto.setFont(new Font("Serif",Font.PLAIN,tamanio));
			
			}
		};
		
		boton.addActionListener(miEvento);
	}
	private JLabel texto;
	private ButtonGroup miGrupo;
	private JPanel Labelboton;
}