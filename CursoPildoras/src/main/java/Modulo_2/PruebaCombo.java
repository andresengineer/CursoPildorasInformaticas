/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_2;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PruebaCombo {

	public static void main(String[] args) {
		MarcoCombo Marco = new MarcoCombo();
		Marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoCombo extends JFrame{
	public MarcoCombo() {
		setVisible(true);
		setBounds(550,300,550,400);
		LabelCombo Label = new LabelCombo();
		add(Label);
	}
}

class LabelCombo extends JPanel{
	public void LabelCombo() {
		
		setLayout(new BorderLayout());
		texto = new JLabel(" texto ...");
		texto.setFont(new Font("Serif",Font.PLAIN,18));
		add(texto,BorderLayout.CENTER);
		JPanel LabelN = new JPanel();
		Combo.setEditable(true);
		Combo.addItem("Serif");
		Combo.addItem("SansSerif");
		Combo.addItem("Monospaced");
		Combo.addItem("Dialog");
		EventoCombo miEvento = new EventoCombo();
		Combo.addActionListener(miEvento);
		LabelN.add(Combo);
		add(LabelN, BorderLayout.NORTH);
	}
	
	private class EventoCombo implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			texto.setFont(new Font((String)Combo.getSelectedItem(),Font.PLAIN,18));
		}
	}
	private JLabel texto;
	private JComboBox Combo;
}