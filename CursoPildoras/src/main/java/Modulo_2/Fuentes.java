/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_2;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fuentes {
	public static void main(String[] args) {
		MarcoConFuentes Marco = new MarcoConFuentes();
		Marco.setVisible(true);
		Marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}

class MarcoConFuentes extends JFrame{
	public MarcoConFuentes(){
		setTitle("Prueba con Fuentes");
		setSize(400,400);
		LaminaConFuentes Label = new LaminaConFuentes();
		add(Label);
		Label.setForeground(Color.BLUE);
	}
}

class LaminaConFuentes extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Font miFuente = new Font("Arial",Font.BOLD,26);
		g2.setFont(miFuente);
		g2.setColor(Color.BLUE);
		g2.drawString("Andres", 100, 100);
		g2.setFont(new Font("Courier",Font.ITALIC,24));
		g2.setColor(new Color(200,90,140));
		g2.drawString("JAVA",100,200);
	}
}