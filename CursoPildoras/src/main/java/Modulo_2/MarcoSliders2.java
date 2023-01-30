/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_2;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MarcoSliders2 {
	public static void main(String[] args) {
		FrameSliders2 Label = new FrameSliders2();
		Label.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class FrameSliders2 extends JFrame{
	public FrameSliders2() {
		setVisible(true);
		setBounds(550,400,550,350);
		LabelSlider2 Label = new LabelSlider2();
		add(Label);
	}
}

class LabelSlider2 extends JPanel{
	public LabelSlider2() {
		setLayout(new BorderLayout());
		rotulo = new JLabel("En un lugar de la mancha de cuyo nombre...");
		add(rotulo, BorderLayout.CENTER);
		control = new JSlider(0,50,12);
		control.setMajorTickSpacing(25);
		control.setMinorTickSpacing(5);
		control.setPaintTicks(true);
		control.setPaintLabels(true);
		control.setSnapToTicks(true);
		control.setFont(new Font("Serif",Font.ITALIC,10));
		control.addChangeListener(new EventoSlider());
		JPanel LabelSlider = new JPanel();
		LabelSlider.add(control);
		add(LabelSlider, BorderLayout.NORTH);
	}
	
	private class EventoSlider implements ChangeListener{

		public void stateChanged(ChangeEvent e) {
			rotulo.setFont(new Font("Serif",Font.PLAIN, control.getValue()));
		}
	}

	private JLabel rotulo;
	private JSlider control;
}