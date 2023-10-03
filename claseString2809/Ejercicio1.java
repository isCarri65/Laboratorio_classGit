package claseString2809;

import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        ejercicio1();

    }
    public static void  ejercicio1(){
        int longitdud;
        String texto = JOptionPane.showInputDialog("Introduzca una frase: ");
        longitdud = texto.length();
        JOptionPane.showMessageDialog(null, "La longitud del texto es de: " + longitdud);


        String indice_string = JOptionPane.showInputDialog("Ingrese un indice entre (0 y " + longitdud + ")");
        int indice = Integer.parseInt(indice_string);
        char caracter = texto.charAt(indice);
        JOptionPane.showMessageDialog(null, "La letra con indice: "+indice+" Es: "+ caracter);


        String subcadena = JOptionPane.showInputDialog("Introduzca una subadena(palabra o frase): ");
        int indice_inicio = texto.indexOf(subcadena);
        int indice_final = texto.lastIndexOf(subcadena);
        if (indice != -1 || indice_final != -1) {
            JOptionPane.showMessageDialog(null, "La subcadena: " + subcadena + "' se encuentra en la posición inicial " + indice_inicio + " y la posicion final: "+ indice_final);
        } else {
            JOptionPane.showMessageDialog(null, "La subcadena: " + subcadena + "' no se encuentra en la frase: "+ texto);
        }


        String caracterString = JOptionPane.showInputDialog("Introduzca un caracter: ");
        int indiceCaracter = texto.indexOf(caracterString);
        if (indice != -1) {
            JOptionPane.showMessageDialog(null, "La caracter: " + caracterString + "' se encuentra en la posición" + indiceCaracter);
        }


        JOptionPane.showMessageDialog(null, texto.toUpperCase());
    }
}
