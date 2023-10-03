package claseString2809;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        ejercicio3();

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
}
