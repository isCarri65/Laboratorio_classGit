import java.util.Scanner;

public class prueba_classGit {
    public static void main(String[] args) {
        System.out.println("Archivo_prueba");
        //Operacion suma
        Scanner sc = new Scanner(System.in);
        int num1, num2, suma;
        System.out.println("Operacion suma");
        System.out.println("Ingrese primer número: ");
        num1 = sc.nextInt();
        System.out.println("Ingresa el segundo número");
        num2 = sc.nextInt();
        suma = num1 + num2;
        System.out.println("El resultado de la suma es: "+suma);
    }
}
