/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_2;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class PruebaDibujo {

	public static void main(String[] args) {
		MarcoConDibujos Marco = new MarcoConDibujos();
		Marco.setVisible(true);
		Marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
}

class MarcoConDibujos extends JFrame{
	
	public MarcoConDibujos(){
		setTitle("Prueba de dibujo");
		setSize(400,400);
		LaminaConFiguras Label = new LaminaConFiguras();
		add(Label);
	}
}

class LaminaConFiguras extends JPanel{
	public void paintComponent(Graphics g) {
            
                //Graficos
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
                
		//Rectangulo
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		g2.draw(rectangulo);
		
		//Elipse
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.draw(elipse);
		
		//Linea en elipse
		g2.draw(new Line2D.Double(100,100,300,250));
		
		//Circulo
		double centroEnX = rectangulo.getCenterX();
		double centroEnY = rectangulo.getCenterY();
		double radio = 150;
		Ellipse2D circulo = new Ellipse2D.Double();
		circulo.setFrameFromCenter(centroEnX, centroEnY, centroEnX+radio,centroEnY+radio);
		g2.draw(circulo);
	}
}
