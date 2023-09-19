import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
        int num1, num2, num3, mayor;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero:");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero:");
        num2 = sc.nextInt();
        System.out.println("Ingrese el tercer numero:");
        num3 = sc.nextInt();

        if (num1>num2){
            if (num1>num3){
                mayor = num1;
            } else {
                mayor = num3;
            }
        } else {
            if (num2>num3){
                mayor = num2;
            } else {
                mayor = num3;
            }
        }
        System.out.println("El mayor es "+mayor);
    }
}
