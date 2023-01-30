/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_2;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
            miMarco marco1 = new miMarco();
            marco1.setVisible(true);
            marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class miMarco extends JFrame {
	
	public miMarco() {
		setBounds(500,300,550,250);
		setTitle("Mi ventana");
	}
}