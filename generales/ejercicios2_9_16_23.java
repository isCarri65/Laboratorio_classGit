import java.util.Scanner;

public class ejercicios2_9_16_23 {
    public static void main(String[] args) {
        //Ejercicio 2
        System.out.println("Ingrese un número, se contara la cantidad de digitos que tiene");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();

        int cifras = 0;

        do{

            num = num / 10;

            cifras++;

        }while(num != 0);

        System.out.println("La cantidad de dígitos es: " + cifras);

        //Ejercicio 9
        System.out.println("Ingresa el numero que quieres convertir a binario: ");
        int numero;
        numero = leer.nextInt();
        StringBuilder binary = new StringBuilder();

        while (numero != 0) {
            binary.insert(0, (numero % 2));
            numero /= 2;
        }

        System.out.println("Numero binario: " + binary);

        //EJercicio 16
        int n, i;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduce un numero mayor a 0: ");
            n = sc.nextInt();
        } while (n <= 0);

        if (n == 1) {  //el 1 no es primo
            System.out.println("No es primo");
        } else {
            i = 2;    //i es el divisor
            while (n % i != 0) {
                i++;
            }
            if (i == n) {
                System.out.println("Es primo");
            } else {
                System.out.println("No es primo");
            }
        }

        //Ejercicio 23
        int num23, add, digit23;
        add=0;
        do {
            System.out.print("Ingrese un numero ");
            num23 = sc.nextInt();
            if (num23 <= 0) {
                System.out.println("Error");
            }
        } while (num23 <= 0);

        while (num23 != 0) {
            digit23 = num23 % 10;
            add += digit23;
            num23 = num23 / 10;
        }
        System.out.println("La suma de sus cifras da como resultado:"+add);

        System.out.println(" ");

    }
}