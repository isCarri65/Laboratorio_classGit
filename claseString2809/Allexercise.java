package claseString2809;

import javax.swing.*;
import java.util.*;

public class Allexercise {
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        // ejercicio5(); no esta en el trabajo
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10();
        ejercicio11();
        ejercicio12();
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
    public static void  ejercicio2(){
        List<Integer> miArrayList = new ArrayList<>();
        int negativos ;
        float positivo, suma;
        for (int i = 0; i != -1 ; i++){
            String number_string = JOptionPane.showInputDialog(null, "Ingrese un numero(Click en cancelar para salir): ");
            try{
                if (number_string == null){
                    break;
                }else {
                    int number = Integer.parseInt(number_string);
                    miArrayList.add(number);
                }
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Ah introducido una subcadena, en vez de una frase, porfavor vuelva a intentarlo");
            }

        }
        negativos = 0;
        positivo = 0;
        suma = 0;
        for (int i = 0; i < miArrayList.size(); i++){
            int a;
            a = miArrayList.get(i);
            if (a < negativos){
                negativos = a;
            } else if (a > 0) {
                positivo += a;
                suma++;
            }
        }
        JOptionPane.showMessageDialog(null, "El negativo mas alto es: " + negativos + " Y el promedio de los positivos es: "+ positivo/suma);
    }
    public static void ejercicio3(){
        List<Integer> miArrayList = new ArrayList<>();

        for (int i = 0; i != -1 ; i++){
            String number_string = JOptionPane.showInputDialog(null, "Ingrese un numero(Click en cancelar para salir): ");
            try{
                if (number_string == null){
                    break;
                }else {
                    int number = Integer.parseInt(number_string);
                    miArrayList.add(number);
                }
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Ah introducido una subcadena, en vez de una frase, porfavor vuelva a intentarlo");
            }
        }
        int auxPar, auxImpar;
        auxPar = 0;
        auxImpar = 0;
        for (int i = 0; i < miArrayList.size(); i++){
            int a;
            a = miArrayList.get(i);
            if (a < 0){
                auxImpar++;
            } else if (miArrayList.get(0) == a && a > 0) {
                auxPar = a;
            } else if (a < auxPar && a%2 == 0 && a > 0) {
                auxPar = a;
            }
        }
        JOptionPane.showMessageDialog(null, "El menor numero par introducido es: "+ auxPar + " Y La cantidad de impares es de: " + auxImpar);
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
    public static void ejercicio6(){
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
    public static void ejercicio7() {


        String texto = JOptionPane.showInputDialog("Ingresa un texto terminado en punto:");

        if (texto.endsWith(".")) {
            texto = texto.substring(0, texto.length() - 1);
        }

        String[] palabras = texto.split(" ");

        int cantidadPalabras = palabras.length;

        JOptionPane.showMessageDialog(null, "LA CANTIDAD DE PALABRAS EN EL TEXTO ES " + cantidadPalabras);

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
    public static void ejercicio10(){
        // string.lenght - 1
        Map<String, Integer> mapWorlds = new HashMap<>();
        String[] vocalsText = {"a", "e", "i", "o", "u"};
        String textoPunto = JOptionPane.showInputDialog(null, "Ingrese un texto terminado en punto");
        int indexChar = textoPunto.length() - 1;
        char lastChar = textoPunto.charAt(indexChar);
        String verificateChar = String.valueOf(lastChar);
        if (verificateChar.equals(".")){
            String[] wordsText = textoPunto.split("\\s+");
            int consNumber = 0;
            for (String wordOnly : wordsText) {
                String[] letterText = wordOnly.split("");
                for (String letterOnly : letterText) {
                    for (int i = 0; i < vocalsText.length; i++) {

                    }

                }
                mapWorlds.put(wordOnly, consNumber);
                System.out.println(consNumber);
            }
        }else {
            JOptionPane.showMessageDialog(null, "Ingrese un texto terminado en punto, porfavor.");
        }
        String wordConso = null;
        int maxConst = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : mapWorlds.entrySet()) {
            if (entry.getValue() > maxConst) {
                maxConst = entry.getValue();
                wordConso = entry.getKey();
            }
        }
        JOptionPane.showMessageDialog(null,"La palabra con mayor cantidad de vocales es: "+ wordConso + " Con un total de consonantes: "+ maxConst);
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
