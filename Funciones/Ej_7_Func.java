import java.util.Scanner;

public class Ej_7_Func {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce primer número: ");
        int n1 = sc.nextInt();
        System.out.print("Introduce segundo número: ");
        int n2 = sc.nextInt();

        if (sonAmigos(n1, n2)) {
            System.out.println("Son Amigos");
        } else {
            System.out.println("No son amigos");
        }
    }

    public static boolean sonAmigos(int n1, int n2) {
        int suma1 = 0;
        int suma2 = 0;

        for (int i = 1; i < n1; i++) {
            if (n1 % i == 0) {
                suma1 += i;
            }
        }

        for (int i = 1; i < n2; i++) {
            if (n2 % i == 0) {
                suma2 += i;
            }
        }

        return (suma1 == n2) && (suma2 == n1);
    }
}
