/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_2;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FocoEvento {
	public static void main(String[] args) {
		MarcoFoco miMarco = new MarcoFoco();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}

class MarcoFoco extends JFrame{
	
	public MarcoFoco(){
		setVisible(true);
		setBounds(300,300,600,450);
		add(new LaminaFoco());
	}
}

class LaminaFoco extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setLayout(null);
		Cuadro1 = new JTextField();
		Cuadro1.setBounds(120,10,150,20);
		Cuadro2 = new JTextField();
		Cuadro2.setBounds(120,50,150,20);
		add(Cuadro1);
		add(Cuadro2);
		LanzaFocos elfoco = new LanzaFocos();
		Cuadro1.addFocusListener(elfoco);
	}
	
	private class LanzaFocos implements FocusListener{
		public void focusGained(FocusEvent e) {
			
		}
		public void focusLost(FocusEvent e) {
			String eMail = Cuadro1.getText();
			boolean comprobacion = false;
			for(int i = 0; i < eMail.length(); i++) {
				if(eMail.charAt(i)=='@') {
					comprobacion = true;
				}
			}
			
			if (comprobacion) {
				System.out.println("Es correcto");
			}else {
				System.out.println("Es inconrrecto");
			}
		}	
	}
	JTextField Cuadro1;
	JTextField Cuadro2;
}

