package Arrays_Matrices;

import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz_1 = {
                {1,2,3,4},
                {5,6,7,8}};

        for (int i = 0; i < matriz_1.length ; i++) {
            for (int j = 0; j < matriz_1[0].length; j++) {
                System.out.print(matriz_1[i][j]+" ");
            }
            System.out.println(" ");
        }

        int[][] matriz_t = transponer_matriz(matriz_1);
        System.out.println("Mostrando matriz transpuesta  ");

        for (int i = 0; i < matriz_t.length ; i++) {
            for (int j = 0; j < matriz_t[0].length; j++) {
                System.out.print(matriz_t[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
    public static int[][] transponer_matriz(int[][] matriz){
        int count_fila = matriz.length;
        int count_col = matriz[0].length;
        int[][] new_matriz = new int[count_col][count_fila];
        for (int i = 0; i < count_col; i++) {
            for (int j = 0; j < count_fila; j++) {
                new_matriz[i][j] = matriz[j][i];
            }
        }
        return new_matriz;
    }
}
