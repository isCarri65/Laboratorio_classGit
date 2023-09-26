package Funciones;

import java.util.Scanner;

public class Ejercicio_25_funcion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numD;
        System.out.println("Ingrese su número de DNI");
        numD = sc.nextInt();
        System.out.println("Tu letra correspondiente a tu número de DNI es "+letra_dni(numD));
    }
    public static char letra_dni(int num){
        char[] list_abc = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int num_list = num%23;
        return list_abc[num_list];
    }
}
