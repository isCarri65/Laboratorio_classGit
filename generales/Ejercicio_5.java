package generales;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args){
        Scanner reader= new Scanner(System.in);
        int num;
        int counter = 0;

        System.out.println("Ingrese un número entero:");
        num= reader.nextInt();

        while (num >= 0){
            if(num % 10 ==2){
                counter++;
            }
            System.out.println("Ingrese otro número entero (ingrese uno negativo para finalizar el programa):");
            num= reader.nextInt();
        }
        System.out.println("Se han ingresado " + counter + " números terminados en 2.");
    }
}
