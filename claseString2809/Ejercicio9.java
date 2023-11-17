package claseString2809;

import javax.swing.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        ejercicio9();
    }
    public static void ejercicio9(){
        String texto = JOptionPane.showInputDialog("Ingresa un texto terminado en punto:");

        if (texto != null && !texto.isEmpty()) {
            // Dividir el texto en palabras
            String[] palabras = texto.split(" ");

            // Inicializar variables para la palabra más larga
            String palabraMasLarga = "";
            int longitudMaxima = 0;

            // Iterar a través de las palabras para encontrar la más larga
            for (String palabra : palabras) {
                // Eliminar cualquier signo de puntuación al final de la palabra
                palabra = palabra.replaceAll("[^a-zA-Z0-9]+$", "");

                if (palabra.length() > longitudMaxima) {
                    longitudMaxima = palabra.length();
                    palabraMasLarga = palabra;
                }
            }

            if (!palabraMasLarga.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La palabra más larga es: " + palabraMasLarga);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron palabras en el texto.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No ingresaste un texto válido.");
        }
    }
}