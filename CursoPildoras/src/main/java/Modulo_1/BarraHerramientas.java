import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class BarraHerramientas {

	public static void main(String[] args) {
		MarcoBarra miMarco = new MarcoBarra();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoBarra extends JFrame{
	public MarcoBarra() {
		setVisible(true);
		setTitle("Marco con barra");
		setBounds(500,300,600,450);
		lamina = new JPanel();
		add(lamina);
		
		//Configuracion acciones
		Action accionAzul = new AccionColor("Azul",new ImageIcon("src/graficos/circulo.gif"),Color.BLUE);
		Action accionAmarillo = new AccionColor("Amarillo",new ImageIcon("src/graficos/circulo.gif"),Color.YELLOW);
		Action accionRojo = new AccionColor("Rojo",new ImageIcon("src/graficos/circulo.gif"),Color.RED);
		Action accionSalir = new AbstractAction("Salir", new ImageIcon("src/graficos/circulo.gif")){

			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		};
		
		JMenu menu = new JMenu("Color");
		menu.add(accionAzul);
		menu.add(accionAmarillo);
		menu.add(accionRojo);
		
		JMenuBar barraMenus = new JMenuBar();
		barraMenus.add(menu);
		
		setJMenuBar(barraMenus);
		
		//Construccion de la barra de herramientas
		
		JToolBar barra = new JToolBar();
		
		barra.add(accionAzul);
		barra.add(accionAmarillo);
		barra.add(accionRojo);
		
		barra.addSeparator();
		barra.add(accionSalir);
		
		add(barra, BorderLayout.NORTH);
		
				
	}
	
	private class AccionColor extends AbstractAction{
		public AccionColor(String nombre, Icon icono, Color c) {
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Color de fondo"+nombre);
			putValue("Color",c);

		}

		public void actionPerformed(ActionEvent e) {
			Color c = (Color)getValue("Color");
			lamina.setBackground(c);
		}
		
	}
	
	private JPanel lamina;
}