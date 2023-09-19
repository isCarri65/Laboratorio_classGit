import java.util.Scanner;

public class Ej20 {
    public static void main(String[] args) {
        int nota;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una nota entre 0 y 10");
        nota = sc.nextInt();

        if (nota<0 || nota>10){
            System.out.println("La nota ingresada es incorrecta.");
        } else if (nota<5) {
            System.out.println("Nota Insuficiente.");
        } else if (nota<6) {
            System.out.println("Nota Suficiente.");
        } else if (nota<7) {
            System.out.println("Nota Bien.");
        } else if (nota<9) {
            System.out.println("Nota Notable.");
        } else {
            System.out.println("Nota Sobresaliente.");
        }
    }
}
