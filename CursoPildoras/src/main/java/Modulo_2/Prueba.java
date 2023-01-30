/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class Prueba {
	public static void main(String[] args) {
		MarcoPrueba Marco = new MarcoPrueba();
		Marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoPrueba extends JFrame{
	public MarcoPrueba() {
		setBounds(500,300,500,350);
		LabelPrueba Label = new LabelPrueba();
		add(Label);
		setVisible(true);
	}
}

class LabelPrueba extends JPanel{
	public LabelPrueba() {
		
		JTextField Capo = new JTextField(20);
		EscuchaTexto Evento = new EscuchaTexto();
		Document miDoc = Capo.getDocument();
		miDoc.addDocumentListener(Evento);
		add(Capo);
	}
	
	private class EscuchaTexto implements DocumentListener{

		public void insertUpdate(DocumentEvent e) {
			System.out.println("Has introducido texto");
		}
		public void removeUpdate(DocumentEvent e) {
			System.out.println("Has eliminado texto");
		}
		public void changedUpdate(DocumentEvent e) {
		}	
	}
}