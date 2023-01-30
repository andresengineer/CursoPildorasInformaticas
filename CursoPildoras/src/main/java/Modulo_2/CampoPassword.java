/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class CampoPassword {

	public static void main(String[] args) {
		MarcoPassword miMarco = new MarcoPassword();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoPassword extends JFrame{
	public MarcoPassword() {
		setBounds(400,300,550,400);
		PanelPassword Panel = new PanelPassword();
		add(Panel);
		setVisible(true);
	}
}

class PanelPassword extends JPanel{
	
	public PanelPassword() {
		
		setLayout(new BorderLayout());
		JPanel PanelSup = new JPanel();
		PanelSup.setLayout(new GridLayout(2,2));
		add(PanelSup,BorderLayout.NORTH);
		JLabel Label1 = new JLabel("Usuario");
		JLabel Label2 = new JLabel("Contraseña");
		JTextField CUsuario = new JTextField(15);
		CompruebaPass miEvento = new CompruebaPass();
		CContra = new JPasswordField(15);
		CContra.getDocument().addDocumentListener(miEvento);
		PanelSup.add(Label1);
		PanelSup.add(CUsuario);
		PanelSup.add(Label2);
		PanelSup.add(CContra);
		JButton enviar = new JButton ("Enviar");
		add(enviar,BorderLayout.SOUTH);
	}
	
	private class CompruebaPass implements DocumentListener{

		public void insertUpdate(DocumentEvent e) {
			char contrasenia[];
			contrasenia =  CContra.getPassword();
			if(contrasenia.length < 8 || contrasenia.length > 12) {
				CContra.setBackground(Color.red);
			}else {
				CContra.setBackground(Color.white);
			}
		}

		public void removeUpdate(DocumentEvent e) {
			char contrasenia[];
			contrasenia =  CContra.getPassword();
			if(contrasenia.length < 8 || contrasenia.length > 12) {
				CContra.setBackground(Color.red);
			}else {
				CContra.setBackground(Color.white);
			}
		}
		public void changedUpdate(DocumentEvent e) {
		}		
	}
	JPasswordField CContra;
}