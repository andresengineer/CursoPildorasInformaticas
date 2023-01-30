/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/		

package Modulo_3;
import javax.swing.JOptionPane;
public class Comprueba_mail {
    public static void main(String[] args) {
        String el_mail=JOptionPane.showInputDialog("Introduce mail");
        try{
            examina_mail(el_mail);
        }catch(Exception e){
            System.out.println("La dirección de email no es correcta");
            e.printStackTrace();
        }
    }
    
    static void examina_mail(String mail)throws Longitud_mail_erronea{
        int arroba=0;
        boolean punto=false;
        if (mail.length()<= 3){
            throw new Longitud_mail_erronea("El mail debe tener mas de 3 caracteres");
        } else {
        
            for(int i=0;i<mail.length();i++){
                if(mail.charAt(i)=='@'){
                arroba ++;
                }
                if(mail.charAt(i)=='.'){
                punto=true;
                }
            }
            if(arroba ==1 && punto == true){
                System.out.println("Es correcto");
            }else{
                System.out.println("Es correcto");
            }
        }
    }
}


class Longitud_mail_erronea extends Exception{
    public Longitud_mail_erronea (){}
    public Longitud_mail_erronea(String msj_error){
        super(msj_error);
    }
}