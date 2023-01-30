/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_2;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextPane;

public class MarcoEmergente2 {
	public static void main(String[] args) {
		MarcoEmergenteM Marco = new MarcoEmergenteM();
		Marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoEmergenteM extends JFrame{
	public MarcoEmergenteM() {
		setVisible(true);
		setBounds(100,100,300,250);
		add(new LaminaEmergenteM());
	}
}

class LaminaEmergenteM extends JPanel{
	public LaminaEmergenteM() {
		setLayout(new BorderLayout());
		JPanel laminaMenu = new JPanel();
		JMenuBar Barra = new JMenuBar();
		JMenu fuente = new JMenu("Fuente");
		JMenu estilo = new JMenu("Estilo");
		JMenu tamanio = new JMenu("Tamaño");
		Barra.add(fuente);
		Barra.add(estilo);
		Barra.add(tamanio);
		laminaMenu.add(Barra);
		add(laminaMenu, BorderLayout.NORTH);
		JTextPane Area = new JTextPane();
		add(Area, BorderLayout.CENTER);
		JPopupMenu emergente = new JPopupMenu();
		JMenuItem opcion1 = new JMenuItem("opcion 1");
		JMenuItem opcion2 = new JMenuItem("opcion 2");
		JMenuItem opcion3 = new JMenuItem("opcion 3");
		emergente.add(opcion1);
		emergente.add(opcion2);
		emergente.add(opcion3);
		Area.setComponentPopupMenu(emergente);
	}
}