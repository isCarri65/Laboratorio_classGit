package generales;

import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero, aux;
        double aux2;
        System.out.print("Introduce numero mayor que 1: ");
        numero = sc.nextInt();
        aux2 = numero;
        aux = 1;
        do {
            if (numero == 0){
                System.out.println("El factorial de 0 es 1");
                break;
            }
            if (numero == 1){
                System.out.println("El factorial de 1 es 1");
            }
            if(aux == numero){
                break;
            }
            aux2 = aux2 * aux;
            aux++;
        }while(aux <= numero);
        System.out.printf("%d! = %.0f %n", numero, aux2);
    }
}
