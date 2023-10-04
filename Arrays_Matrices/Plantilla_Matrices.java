package Arrays_Matrices;

import java.util.Scanner;

public class Plantilla_Matrices {
    public static void main(String[] args) {
        final int FILAS=5, COLUMNAS=4;
        Scanner sc = new Scanner(System.in);
        int filaMayor, filaMenor, colMayor, colMenor;
        int [][] A = new int[FILAS][COLUMNAS]; //Se crea una matriz de 5 filas y 4 columnas

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.println("Lugar a ocupar: A[" + i + "][" + j + "] = ");
                A[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.println(A[i][j]+"");
                }

        }
    }
}
