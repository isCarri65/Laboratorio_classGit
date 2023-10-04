package generales;

import java.util.Scanner;

public class Ejercicio_1 {
    // INTERCAMBIO DE VALORES ENTRE DOS VARIABLES UTILIZANDO UNA VARIABLE AUXILIAR.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, AUX;
        System.out.print("Introduzca valor de A: ");
        A = sc.nextInt();
        System.out.print("Introduzca Valor de B: ");
        B = sc.nextInt();
        System.out.println("Valores iniciales: A = " + A + "   B = " + B);
        // Explicacion sencilla, aux guarda la variable "A", se cambia la variable "A" a la B y B pasa a ser la aux, que si recordamos lo que guardamos fue A
        AUX = A;
        A = B;
        B = AUX;
        System.out.println("Valores intercambiados: A = " + A + "   B = " + B);
        main2();
    }
    //Para string simplemente cambiamos la declaracion de string y seria exactamente igual
    public static void main2() {
        Scanner sc = new Scanner(System.in);
        String A, B, AUX;
        System.out.println("Valores para string");
        System.out.print("Introduzca valor de A: ");
        A = sc.nextLine();
        System.out.print("Introduzca Valor de B: ");
        B = sc.nextLine();
        System.out.println("Valores iniciales: A = " + A + "   B = " + B);
        // Explicacion sencilla, aux guarda la variable "A", se cambia la variable "A" a la B y B pasa a ser la aux, que si recordamos lo que guardamos fue A
        AUX = A;
        A = B;
        B = AUX;
        System.out.println("Valores intercambiados: A = " + A + "   B = " + B);
    }

}