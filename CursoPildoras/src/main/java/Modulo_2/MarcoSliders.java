/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_2;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class MarcoSliders {
	public static void main(String[] args) {
		FrameSliders Marco = new FrameSliders();
		Marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class FrameSliders extends JFrame{
	public FrameSliders() {
		setVisible(true);
		setBounds(550,400,550,350);
		LaminaSliders Label = new LaminaSliders();
		add(Label);
	}
}

class LaminaSliders extends JPanel{
	public LaminaSliders() {
		JSlider control = new JSlider(0,100,50);
		control.setMajorTickSpacing(50);
		control.setMinorTickSpacing(25);
		control.setPaintTicks(true);
		control.setFont(new Font("Serif",Font.ITALIC,12));
		control.setPaintLabels(true);
		control.setSnapToTicks(true);
		add(control);
	}
}