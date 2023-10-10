package Strings;

import javax.swing.*;

public class Ej_6 {
    public static void main(String[] args){
        int counter= 0;
        String text= JOptionPane.showInputDialog("Ingrese una oración terminada en un punto:");
        if (!text.contains(".")){
            JOptionPane.showMessageDialog(null, "Por favor, reinicie el programa y asegurece de que la oración que ingrese termine en un punto");
        }else{
            for(int i=0; i<text.length(); i++){
                if((text.charAt(i) == 'a') || (text.charAt(i) == 'e') || (text.charAt(i) == 'o') || (text.charAt(i) == 'u')){
                    counter++;
                }
            }
            JOptionPane.showMessageDialog(null, "La oración ingresada contiene " + counter + " vocales");
        }
    }
}
