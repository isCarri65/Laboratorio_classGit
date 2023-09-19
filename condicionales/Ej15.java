import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        float num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el dividendo");
        num1 = sc.nextFloat();
        System.out.println("Ingrese el divisor");
        num2 = sc.nextFloat();

        if (num2!=0){
            System.out.println("La división entre los números da como resultado "+(num1/num2));
        }else {
            System.out.println("Error. El divisor no puede ser 0");
        }
    }
}
