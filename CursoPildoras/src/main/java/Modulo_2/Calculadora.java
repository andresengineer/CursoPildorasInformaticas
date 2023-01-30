/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculadora {

	public static void main(String[] args) {

		MarcoCalculadora miMarco = new MarcoCalculadora();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}
}

class MarcoCalculadora extends JFrame{
	public MarcoCalculadora() {
		setTitle("Calculadora");
		setBounds(500,300,450,300);
		LaminaCalculadora miLamina = new LaminaCalculadora();
		add(miLamina);
	}
}

class LaminaCalculadora extends JPanel{
	public LaminaCalculadora() {
		
		principio = true;
		setLayout(new BorderLayout());
		pantalla = new JButton("0");
		pantalla.setEnabled(false);
		
		add(pantalla,BorderLayout.NORTH);
		
		Panel = new JPanel();
		Panel.setLayout(new GridLayout(4,4));
		
		ActionListener insertar = new InsertaNumero();
		ActionListener orden = new AccionOrden();
		
		ponerBoton("7",insertar);ponerBoton("8",insertar);ponerBoton("9",insertar);ponerBoton("/",orden);
		ponerBoton("4",insertar);ponerBoton("5",insertar);ponerBoton("6",insertar);ponerBoton("*",orden);
		ponerBoton("1",insertar);ponerBoton("2",insertar);ponerBoton("3",insertar);ponerBoton("-",orden);
		ponerBoton("0",insertar);ponerBoton(",",insertar);ponerBoton("=",orden);ponerBoton("+",orden);
		
		add(Panel,BorderLayout.CENTER);
		ultimaOperacion = "=";
	}
	
	private void ponerBoton(String rotulo,ActionListener oyente) {
		
		JButton boton = new JButton(rotulo);
		boton.addActionListener(oyente);
		Panel.add(boton);	
	}
	
	private class InsertaNumero implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			String entrada = e.getActionCommand();
			
			if(principio) {
				pantalla.setText("");
				principio = false;
			}
			pantalla.setText(pantalla.getText()+entrada);
		}
	}
	
	private class AccionOrden implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			String operacion = e.getActionCommand();
			calcular(Double.parseDouble(pantalla.getText()));
			ultimaOperacion = operacion;
			
			principio = true;
		}
		
		public void calcular(double x) {
			
			if(ultimaOperacion.equals("+")) {
				resultado += x;
				System.out.println(resultado);
				
			}else if(ultimaOperacion.equals("-")){
				resultado -= x;
				System.out.println(resultado);
				
			}else if(ultimaOperacion.equals("*")){
				resultado *= x;
				System.out.println(resultado);
				
			}else if(ultimaOperacion.equals("/")){
				resultado /= x;
				System.out.println(resultado);
				
			}else if(ultimaOperacion.equals("=")){
				resultado = x;
				System.out.println(resultado);
			}
			pantalla.setText(" "+resultado);
		}
	}
	
	private JPanel Panel;
	private JButton pantalla;
	private boolean principio;
	private double resultado;
	private String ultimaOperacion;
	
}