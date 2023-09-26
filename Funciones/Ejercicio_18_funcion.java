package Funciones;

import java.util.Scanner;

public class Ejercicio_18_funcion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        String num;
        int num_v = 0;
        do {
            num = sc.next();
            if (isNumeric(num)) {
                num_v = Integer.parseInt(num);
                break;
            } else {
                System.out.println("valor incorrecto, tiene que ingresar un número");
            }
        }while (!(isNumeric(num)));
        System.out.println("invertido: "+invertir(num_v));
    }

    public static int invertir(int num){
        String num_s = Integer.toString(num);
        int largo = num_s.length();
        String num2 = "";
        for (int i = 0; i < largo; i++) {
            num2 = num2.concat(num_s.substring(largo - 1 - i, largo-i));
        }
        return Integer.parseInt(num2);
    }

    public static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
    }
}
