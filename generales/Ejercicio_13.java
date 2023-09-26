package generales;

import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args){
        int number, assistant, figure;
        int reverse = 0;
        Scanner reader= new Scanner(System.in);

        do{
            System.out.println("Ingrese un número que contenga dos dígitos:");
            number= reader.nextInt();
        }while(number < 10);

        assistant= number;
        while (assistant != 0){
            figure= assistant % 10;
            reverse= reverse * 10 + figure;
            assistant /= 10;
        }

        if (number ==  reverse){
            System.out.println("El número ingresado es capicúa.");
        }else{
            System.out.println("El número ingresado no es capicúa.");
        }
    }
}
