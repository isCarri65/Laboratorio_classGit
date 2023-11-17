package claseString2809;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        ejercicio2();

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
}
