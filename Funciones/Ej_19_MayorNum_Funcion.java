import java.util.Scanner;

public class Ej_19_MayorNum_Funcion {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int countNumbers = 0;
            int highestNumber = Integer.MIN_VALUE;

            while (true) {
                System.out.print("Ingresa un número (0 para finalizar): ");
                int currentNumber = sc.nextInt();

                if (currentNumber == 0) {
                    break;
                }

                countNumbers++;
                highestNumber = getMax(highestNumber, currentNumber);
            }

            displayResults(countNumbers, highestNumber);
        }

        public static int getMax(int a, int b) {
            return (a > b) ? a : b;
        }

        public static void displayResults(int countNumbers, int highestNumber) {
            if (countNumbers == 0) {
                System.out.println("--- No se ingresaron valores ---");
            } else {
                System.out.println("Cantidad de números ingresados: " + countNumbers);
                System.out.println("El número mayor es: " + highestNumber);
            }
        }
    }

