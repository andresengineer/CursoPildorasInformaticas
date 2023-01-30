/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_2;

import javax.swing.*;
public class Radio {

	public static void main(String[] args) {
		MarcoRadioSintaxis Marco = new MarcoRadioSintaxis();
		Marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoRadioSintaxis extends JFrame{
	public MarcoRadioSintaxis() {
            setVisible(true);
            setBounds(550,300,500,300);
            LabelRadio miLamina = new LabelRadio();
            add(miLamina);
	}
}

class LabelRadio extends JPanel{
	public LabelRadio() {
		
            ButtonGroup Grupo1 = new ButtonGroup();
            ButtonGroup Grupo2 = new ButtonGroup();
            JRadioButton boton1 = new JRadioButton("Azul",false);
            JRadioButton boton2 = new JRadioButton("Rojo",true);
            JRadioButton boton3 = new JRadioButton("Verde",false);
            JRadioButton boton4 = new JRadioButton("Masculino",false);
            JRadioButton boton5 = new JRadioButton("Femenino",false);
            Grupo1.add(boton1);
            Grupo1.add(boton2);
            Grupo1.add(boton3);
            Grupo2.add(boton4);
            Grupo2.add(boton5);
            add(boton1);
            add(boton2);
            add(boton3);
            add(boton4);
            add(boton5);
	}
}