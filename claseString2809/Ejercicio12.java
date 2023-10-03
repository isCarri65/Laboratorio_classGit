package claseString2809;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        ejercicio12();
    }
    public static void ejercicio12(){
        String text12;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdusca una frase: ");
        text12 = sc.nextLine();
        int indexChar12 = text12.length() - 1;
        char lastChar12 = text12.charAt(indexChar12);
        String verificateChar12 = String.valueOf(lastChar12);
        if (verificateChar12.equals(".")){
            String[] sentence12 = text12.split("[.;]");
            String sentenceLarge12 = "";
            for (String oracion : sentence12) {
                if (oracion.trim().length() > sentenceLarge12.trim().length()) {
                    sentenceLarge12 = oracion.trim();
                }
            }
            String[] words12 = sentenceLarge12.split("\\s+");

            String wordShort12 = words12[0];
            for (String palabra : words12) {
                if (palabra.length() < wordShort12.length()) {
                    wordShort12 = palabra;
                }
            }
            System.out.println("la oracion mas larga es:" + sentenceLarge12 + " y la palabra más corta de la oracion es: " + wordShort12);

            sc.close();
        }else {
            System.out.println("Ingrese un texto terminado en punto");
        }
    }
}
