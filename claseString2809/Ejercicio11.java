package claseString2809;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        ejercicio11();
    }
    public static void ejercicio11(){
        String text;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdusca una frase: ");
        text = sc.nextLine();
        int indexChar = text.length() - 1;
        char lastChar = text.charAt(indexChar);
        String verificateChar = String.valueOf(lastChar);
        if (verificateChar.equals(".")){
            String[] sentence = text.split("[.;]");
            String sentenceLarge = "";
            for (String oracion : sentence) {
                if (oracion.trim().length() > sentenceLarge.trim().length()) {
                    sentenceLarge = oracion.trim();
                }
            }
            System.out.println("La frase mas larga del texto es: "+sentenceLarge);
        }
    }
}
