package claseString2809;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import javax.swing.JOptionPane;
public class Ejercicio10 {
    public static void main(String[] args) {
        ejercicio10();

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

        for (Entry<String, Integer> entry : mapWorlds.entrySet()) {
            if (entry.getValue() > maxConst) {
                maxConst = entry.getValue();
                wordConso = entry.getKey();
            }
        }
        JOptionPane.showMessageDialog(null,"La palabra con mayor cantidad de vocales es: "+ wordConso + " Con un total de consonantes: "+ maxConst);
    }
}
