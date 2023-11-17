package colecionesEnJava;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio2 {
    public static void main(String[] args){
        Ej2();
    }
    public static void Ej2(){
        ArrayList<Integer> arrayOfNumbers = new ArrayList<>();
        //Agregando los numeros
        for(int i = 0; i < 20; i++){
            int number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            arrayOfNumbers.add(number);
        }
        //Ordeno la lista
        arrayOfNumbers.sort(Collections.reverseOrder());
        //Guardo el indice del numero mas chico
        int last = arrayOfNumbers.size()-1;
        //Imprimo el numero mas grande del arreglo
        System.out.println("El mayor numero del arreglo es: "+ arrayOfNumbers.get(0));
        //Imprimo el numero mas chico del arreglo
        System.out.println("El menor numero del arreglo es: "+ arrayOfNumbers.get(last));
        //Guardo el rango
        int range = arrayOfNumbers.get(0) - arrayOfNumbers.get(last);
        //Mustro el rango
        System.out.println("El rango es de: " + range);
    }
}
