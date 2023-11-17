package claseString2809;

import javax.swing.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        ejercicio7();

    }
    public static void ejercicio7() {


            String texto = JOptionPane.showInputDialog("Ingresa un texto terminado en punto:");

            if (texto.endsWith(".")) {
                texto = texto.substring(0, texto.length() - 1);
            }

            String[] palabras = texto.split(" ");

            int cantidadPalabras = palabras.length;

            JOptionPane.showMessageDialog(null, "LA CANTIDAD DE PALABRAS EN EL TEXTO ES " + cantidadPalabras);

    }
}
