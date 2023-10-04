import javax.swing.*;
import java.util.Arrays;

public class Practica_array_string_11 {
    public static void main(String[] args) {
        String longest_phrase= "";
        String[] count_phrase;
        int count_word= 0;


        String phrase = JOptionPane.showInputDialog("Ingresa una frase");
        if (phrase.substring(phrase.length()-1).equals(".")){
            count_phrase = phrase.split(";");
            for (String element: count_phrase) {
                if (element.split(" ").length>count_word){
                    longest_phrase = element;
                    count_word = element.split(" ").length;
                }

            }
            System.out.println("La frase con mas palabras es '"+longest_phrase+"'");
        }
    }
}
