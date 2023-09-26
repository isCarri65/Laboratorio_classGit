package generales;

import java.util.Scanner;

public class Ejercicio_20 {
    public static void main(String[] args){
        int num, cipher = 0, higher = 0, positionHigher = 0, position = 0;
        Scanner reader= new Scanner(System.in);

        do{
            System.out.println("Ingrese un número entero mayor a 0:");
            num= reader.nextInt();
        }while (num <= 0);

        while (num != 0){
            position++;
            cipher= num % 10;
            if(cipher >= higher){
                higher= cipher;
                positionHigher= position;
            }
            num /= 10;
        }

        System.out.println("Cifra mayor: " + higher);
        System.out.println("Posición: " + positionHigher);
    }
}
