import java.util.Scanner;

public class Ej_21 {

    public static void main(String[] args)  {

        int num, aux, posicionMayor, cifra, mayor, posicion, numCifras;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduce numero entero >0: ");
            num = sc.nextInt();
        } while (num <= 0);

        aux = num;
        numCifras = 0;
        while (aux != 0) {
            numCifras++;
            aux = aux / 10;
        }

        mayor = 0;
        posicionMayor = 0;
        posicion = 0;
        for(int i = numCifras-1; i >= 0; i--){
            posicion++;
            cifra = num / (int)Math.pow(10, i);
            if (cifra > mayor) {
                mayor = cifra;
                posicionMayor = posicion;
            }
            num = num % (int)Math.pow(10, i);
        }

        System.out.print("Cifra mayor: " + mayor);
        System.out.println(" Posición: " + posicionMayor);

    }
}