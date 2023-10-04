package Arrays_Matrices;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array_imp = new int[20];
        int j = 1;
        for (int i = 0; i < 20; i++) {
            j += 1;
            while (!es_primo(j)) {
                j += 1;
            }
            array_imp[i]=j;
        }
        System.out.println("Imprimiendo los primeros 20 número impares");
        for (int i = 0; i < 20; i++) {
            System.out.println("["+array_imp[i]+"] ");

        }
    }


    public static boolean es_primo(int num){
        if (num <= 1){
            return false;
        } else if (num <= 3) {
            return true;
        } else if (num%2 == 0 || num % 3 == 0){
            return false;
        }
        int i = 5;
        while (i * i <= num) {
            if (num%i == 0 || num%(i + 2) == 0){
                return false;
            }
            i += 6;
        }
        return true;
    }
}
