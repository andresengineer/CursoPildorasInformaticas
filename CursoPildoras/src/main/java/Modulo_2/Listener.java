/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Listener {
	public static void main(String[] args) {
		MarcoPrincipal Marco = new MarcoPrincipal();
		Marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		Marco.setVisible(true);
	}
}

class MarcoPrincipal extends JFrame{
	
	public MarcoPrincipal(){
		setTitle("Prueba");
		setBounds(700,100,300,200);
		LabelP Label = new LabelP();
		add(Label);
	}
}

class LabelP extends JPanel{
	public LabelP() {
		JButton botonNuevo = new JButton ("Nuevo");
		add(botonNuevo);
		botonCerrar = new JButton("Cerrar");
		add(botonCerrar);
		newLisener miOyente = new newLisener();
		botonNuevo.addActionListener(miOyente);
	}
	
	private class newLisener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			MarcoEmergente marco = new MarcoEmergente(botonCerrar);
			marco.setVisible(true);
		}
	}
	JButton botonCerrar;
}

class MarcoEmergente extends JFrame{
	public MarcoEmergente(JButton botonDePrincipal ) {
		contador++;
		setTitle("Ventana "+contador);
		setBounds(40*contador,40*contador,300,150);
		Cerrar closeListener = new Cerrar();
		botonDePrincipal.addActionListener(closeListener);
	}
	
	private class Cerrar implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}
	private static int contador = 0;
}