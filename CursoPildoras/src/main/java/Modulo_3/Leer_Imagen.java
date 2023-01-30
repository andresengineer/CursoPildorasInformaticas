/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/		

package Modulo_3;
import java.awt.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Leer_Imagen {
    public static void main(String[] args) {
        MarcoImagen Marco = new MarcoImagen();
        Marco.setVisible(true);
        Marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoImagen extends JFrame{
    public MarcoImagen(){
        setTitle("Prueba con imágen");
        setBounds(400,150,500,500);
        LabelImagen Label = new LabelImagen();
        add(Label);
    }
}

class LabelImagen extends JPanel{
    public LabelImagen(){
       try{
            imagen = ImageIO.read(new File("src/Leer_Imagen/circulo.png"));
        }
        catch(IOException e){
            System.out.println("Imagen no encontrada");
        } 
    }
    public void paintComponent(Graphics g)throws NullPointerException {
        super.paintComponent(g);
        
        try{
            int anchuraImagen = imagen.getWidth(this);
            int alturaImagen = imagen.getHeight(this);
            g.drawImage(imagen, 0, 0, null);
            for (int i=0; i<500; i++){
                for (int j=0; j<500; j++){
                    if(i+j>0){
                    g.copyArea(0, 0 , anchuraImagen, alturaImagen, anchuraImagen*i, alturaImagen*j);
                    }
                }
            }
        } catch (NullPointerException e){
            g.drawString("Fallo en la carga de la imagen", 10,10);
        }
    }
    private Image imagen;
}
