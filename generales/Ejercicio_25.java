import java.util.Scanner;

public class Ejercicio_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numD, num_list;
        char[] list_abc = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        System.out.println("Ingrese su número de DNI");
        numD = sc.nextInt();
        num_list = numD%23;
        System.out.println("Tu letra correspondiente a tu número de DNI es "+list_abc[num_list]);
    }
}
