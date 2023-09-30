import java.util.Scanner;

public class ejercicio2_funciones {
    public static void main(String[] args) {
        System.out.println("Ingrese un número, se contara la cantidad de digitos que tiene:");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        int cifras = contarDigitos(num);
        System.out.println("La cantidad de dígitos es: "+ cifras);
    }

    public static int contarDigitos(int numero) {
        int cifras = 0;
        do {
            numero = numero / 10;
            cifras++;
        } while (numero != 0);
        return cifras;
    }
}
