/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_2;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Acciones {
	public static void main(String[] args) {
		MarcoAccion marco = new MarcoAccion();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		marco.setVisible(true);
	}
}

class MarcoAccion extends JFrame{
	public MarcoAccion(){
		setVisible(true);
		setBounds(600,500,600,400);
		PanelAccion Label = new PanelAccion();
		add(Label);
	}
}

class PanelAccion extends JPanel{
	
	public PanelAccion() {
		InputMap Mapa = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		Mapa.put(KeyStroke.getKeyStroke("ctrl A"), "fondoAmarillo");
		Mapa.put(KeyStroke.getKeyStroke("ctrl B"), "fondoAzul");
		Mapa.put(KeyStroke.getKeyStroke("ctrl R"), "fondoRojo");
		ActionMap mapaAccion = getActionMap();
	}
	
	private class AccionColor extends AbstractAction{
		public AccionColor(String nombre, Icon icono, Color colorBoton) {
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Poner Label"
                                + " de color "+nombre);
			putValue("ColorDeFondo", colorBoton);
		}
		
	public void actionPerformed(ActionEvent e) {
		Color c = (Color)getValue("ColorDeFondo");
		setBackground(c);
		System.out.println("Nombre: "+getValue(Action.NAME)+" Descripcion: "+getValue(Action.SHORT_DESCRIPTION));
	}
    }
}

