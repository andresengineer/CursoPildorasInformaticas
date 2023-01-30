/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/
package Modulo_2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaArea {
	public static void main(String[] args) {
		MarcoPrueba2 Marco = new MarcoPrueba2();
		Marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Marco.setVisible(true);
	}
}

class MarcoPrueba2 extends JFrame{
	public MarcoPrueba2() {
		setTitle("Area de texto");
		setBounds(500,300,500,350);
		setLayout(new BorderLayout());	
		LabelBoton = new JPanel();
		botonInsertar = new JButton("Insertar");
		botonInsertar.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				areaTexto.append(" texto ...");
			}
		});
		
		LabelBoton.add(botonInsertar);
		
		botonSaltoLinea = new JButton("Salto Linea");
		botonSaltoLinea.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				boolean saltar =! areaTexto.getLineWrap();
				areaTexto.setLineWrap(saltar);
			botonSaltoLinea.setText(saltar ? "Quitar Salto" : "Poner Salto Linea");
			}});	
		LabelBoton.add(botonSaltoLinea);
		add(LabelBoton,BorderLayout.SOUTH);
		areaTexto = new JTextArea(8,20);
		Labelbarras = new JScrollPane(areaTexto);
		add(Labelbarras,BorderLayout.CENTER);
	}
	private JPanel LabelBoton;
	private JButton botonInsertar, botonSaltoLinea;
	private JTextArea areaTexto;
	private JScrollPane Labelbarras;
}

