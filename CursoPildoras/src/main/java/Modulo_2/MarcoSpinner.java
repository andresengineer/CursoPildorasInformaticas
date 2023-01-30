/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_2;
import java.awt.Dimension;
import javax.swing.*;

public class MarcoSpinner {

	public static void main(String[] args) {
		FrameSpinner Marco = new FrameSpinner();
		Marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class FrameSpinner extends JFrame{
	public FrameSpinner() {
		setVisible(true);
		setBounds(550,350,550,350);
		add(new LabelSpinner());
	}
}

class LabelSpinner extends JPanel{
	public LabelSpinner() {
		JSpinner control = new JSpinner(new SpinnerNumberModel(5,0,10,1) {
			public Object getNextValue() {
				return super.getPreviousValue();
			}
			public Object getPreviousValue() {
				return super.getNextValue();
			}});
		Dimension d = new Dimension(200,20);
		control.setPreferredSize(d);
		add(control);
	}
}