import java.util.Scanner;

public class Ej_19_MayorNum {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int currentNumber, highestNumber, countNumbers;

        System.out.print("Ingresa un numero (0 para finalizar): ");
        currentNumber = userInput.nextInt();

        highestNumber = currentNumber;
        countNumbers = (currentNumber != 0) ? 1 : 0;

        while (currentNumber != 0) {
            if (currentNumber > highestNumber) {
                highestNumber = currentNumber;
            }
            System.out.print("Ingresa otro numero (0 para finalizar): ");
            currentNumber = userInput.nextInt(); // Read next number
            if(currentNumber != 0) {
                countNumbers++;
            }
        }

        if (highestNumber == 0) {
            System.out.println("--- No se Ingresaron Valores ---");
        } else {
            System.out.println("Ingresaste " + countNumbers + " numeros");
            System.out.println("El mayor fue: " + highestNumber);
        }
    }
}
