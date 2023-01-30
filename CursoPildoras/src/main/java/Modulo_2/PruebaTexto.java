/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_2;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PruebaTexto {
	public static void main(String[] args) {
		MarcoTexto marco = new MarcoTexto();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}

}

class MarcoTexto extends JFrame{
	public MarcoTexto() {
		setBounds(500,300,450,300);
		Labeltxt Label = new Labeltxt();
		add(Label);
		setVisible(true);
	}
}

class Labeltxt extends JPanel{
	public Labeltxt() {
		
		setLayout(new BorderLayout());
		JPanel Label2 = new JPanel();
		Label2.setLayout(new FlowLayout());;
		JLabel texto1 = new JLabel("Email: ");
		Label2.add(texto1);
		campo1 = new JTextField(20);
		Label2.add(campo1);
		resultado = new JLabel("",JLabel.CENTER);
		add(resultado,BorderLayout.CENTER);
		JButton Boton = new JButton("Comprobar");
		DameTexto Evento = new DameTexto();
		Boton.addActionListener(Evento);
		Label2.add(Boton);
		add(Label2,BorderLayout.NORTH);
	}
	
	private class DameTexto implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			int correcto = 0;
			String email = campo1.getText().trim();
			for(int i = 0; i < email.length(); i++) {
				if(email.charAt(i)=='@') {
					correcto ++;
				}
			}
			if(correcto != 1) {
				resultado.setText("Incorrecto");
			}else {
				resultado.setText("Correcto");
			}
		}
	}
	
	private JTextField campo1;
	private JLabel resultado;
}
