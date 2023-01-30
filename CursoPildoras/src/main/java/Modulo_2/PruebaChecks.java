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

import javax.swing.*;

public class PruebaChecks {
	public static void main(String[] args) {
		MarcoCheck miMarco = new MarcoCheck();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoCheck extends JFrame{
	public MarcoCheck() {
		setBounds(550,300,550,350);
		setVisible(true);
		LaminaCheck Label = new LaminaCheck();
		add(Label);
	}
}

class LaminaCheck extends JPanel{
	
	public LaminaCheck() {
		
		setLayout(new BorderLayout());
		Font miLetra = new Font("Serif",Font.PLAIN,24);
		texto = new JLabel(" texto ...");
		texto.setFont(miLetra);
		JPanel Labeltxt = new JPanel();
		Labeltxt.add(texto);
		add(Labeltxt, BorderLayout.CENTER);
		check1 = new JCheckBox("Negrita");
		check2 = new JCheckBox("Cursiva");
		check1.addActionListener(new ManejaChecks());
		check2.addActionListener(new ManejaChecks());
		JPanel LabelCheck = new JPanel();
		LabelCheck.add(check1);
		LabelCheck.add(check2);
		add(LabelCheck, BorderLayout.SOUTH);
	}
	
	private class ManejaChecks implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			int tipo = 0;
			if(check1.isSelected()) tipo +=Font.BOLD;
			if(check2.isSelected()) tipo +=Font.ITALIC;
			texto.setFont(new Font("Serif",tipo,24));
		}
	}
	private JLabel texto; 
	private JCheckBox check1,check2;
}