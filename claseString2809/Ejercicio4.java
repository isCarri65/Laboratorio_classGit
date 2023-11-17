package claseString2809;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        ejercicio4();

    }

    public static void ejercicio4() {

            Scanner sc = new Scanner(System.in);
            int count = 0;
            String text = JOptionPane.showInputDialog("Ingresa una frase");
            if (text.substring(text.length()-1).equals(".")){
                for (int i = 0; i < text.length(); i++) {
                    if ((text.charAt(i))=='a') {
                        count += 1;
                    }
                }
                System.out.println("la cantidad de letras 'a' es de: "+ count);
            }

    }
}
