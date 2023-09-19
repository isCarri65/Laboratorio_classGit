import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        int num;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un año: ");
        num = lector.nextInt();

        if ((num%4==0 && num%100!=0) || num%400==0) {
            System.out.println("Es un año bisiesto");
        }else{
            System.out.println("No es un año bisiesto");
        }
    }
}