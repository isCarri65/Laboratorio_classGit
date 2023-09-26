import java.util.Scanner;

public class Ej_22 {

    public static void main(String[] args) {
        int num, i, aux, cont, cifra;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce numero entero positivo: ");
            num = sc.nextInt();
            if (num <= 0) {
                System.out.println("Número no válido");
            }
        } while (num <= 0);
        aux = num;
        cont = 0;
        while (aux != 0) {
            aux = aux / 10;
            cont++;
        }

        for (i = cont-1; i >= 0; i--) {

            cifra = num / (int) Math.pow(10, i);

            switch (cifra) {
                case 0:
                    System.out.print("cero ");
                    break;
                case 1:
                    System.out.print("uno ");
                    break;
                case 2:
                    System.out.print("dos ");
                    break;
                case 3:
                    System.out.print("tres ");
                    break;
                case 4:
                    System.out.print("cuatro ");
                    break;
                case 5:
                    System.out.print("cinco ");
                    break;
                case 6:
                    System.out.print("seis ");
                    break;
                case 7:
                    System.out.print("siete ");
                    break;
                case 8:
                    System.out.print("ocho ");
                    break;
                case 9:
                    System.out.print("nueve ");
                    break;
            }
            if (i != 0) {
                System.out.print(" - ");
                num = num % (int) Math.pow(10, i);
            }
            System.out.println();
        }
        System.out.println("Fin de programa");
    }
}