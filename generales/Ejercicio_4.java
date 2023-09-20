import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número para mostrar su tabla de multiplicar");
        num = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(num+" x "+i+" = "+num*i);
        }
    }
}
