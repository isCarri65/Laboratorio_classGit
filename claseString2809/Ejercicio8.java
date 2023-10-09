package claseString2809;

import javax.swing.*;

public class Ejercicio8 {
    public static void main(String[] args) {

        ejercicio8();
    }
    public static void ejercicio8(){
        String[] vocalesAll = {"a", "e", "i", "o", "u"};
        String texto = JOptionPane.showInputDialog("Ingresa un texto terminado en punto:");

        if (texto != null && !texto.isEmpty()) {
            // Dividir el texto en palabras
            String[] palabras = texto.split(" ");

            int cantidadPTV = 0;

            for (String palabra : palabras) {
                // Eliminar cualquier signo de puntuación al final de la palabra
                palabra = palabra.replaceAll("[^a-zA-Z0-9]+$", "");
                for(String vocal : vocalesAll){
                    int longitud = palabra.length();
                    if (longitud > 0){
                        char lastLetter_char = palabra.charAt(longitud-1);
                        String lastletter = "" + lastLetter_char;

                        if (lastletter.toLowerCase().equals(vocal)){
                            cantidadPTV = ++cantidadPTV;
                        }
                    }else{
                        System.out.println("");
                    }
                }
            }

            if (cantidadPTV > 0) {
                JOptionPane.showMessageDialog(null, "La cantidad de palabras con vocales es de: " + cantidadPTV);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron palabras terminadas en vocales, en el texto.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No ingresaste un texto válido.");
        }
    }
}
