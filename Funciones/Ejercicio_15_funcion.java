package Funciones;

import java.util.Scanner;

public class Ejercicio_15_funcion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número para mostrar su factorial: ");
        num = sc.nextInt();
        System.out.print(factorial(num));
    }
    public static int factorial(int num) {
       if (num == 0) {
           return 1;
       } else if (num == 1) {
           return 1;
       }
       else {
        return num * factorial(num - 1);
       }
    }
}
