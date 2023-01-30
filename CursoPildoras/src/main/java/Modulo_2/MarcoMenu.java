/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_2;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MarcoMenu {

	public static void main(String[] args) {
		MenuFrame Marco = new MenuFrame();
		Marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MenuFrame extends JFrame{
	public MenuFrame() {
		setVisible(true);
		setBounds(500,300,550,400);
		add(new MenuLabel());	
	}
}

class MenuLabel extends JPanel{
	public MenuLabel() {
		JMenuBar miBarra = new JMenuBar();
		JMenu archivo = new JMenu("Archivo");
		JMenu edicion = new JMenu("Edicion");
		JMenu herramientas = new JMenu("Herramientas");
		JMenu opciones = new JMenu("Ocpiones");
		JMenuItem guardar = new JMenuItem("Guardar");
		JMenuItem guardarComo= new JMenuItem("Guardar Como ");		
		JMenuItem generales = new JMenuItem("Generales");
		JMenuItem opcion1 = new JMenuItem("Opcion 1");
		JMenuItem opcion2 = new JMenuItem("Opcion 2");
		opciones.add(opcion1);
		opciones.add(opcion2);
		archivo.add(guardar);
		archivo.add(guardarComo);
		edicion.addSeparator();
		edicion.add(opciones);
		herramientas.add(generales);
		miBarra.add(archivo);
		miBarra.add(edicion);
		miBarra.add(herramientas);
		add(miBarra);
	}
}