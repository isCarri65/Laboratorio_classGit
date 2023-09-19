import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {
        int h, m, s;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la hora:");
        h = sc.nextInt();
        System.out.println("Ingrese los minutos:");
        m = sc.nextInt();
        System.out.println("Ingrese los segundos:");
        s = sc.nextInt();

        if ((h>=0 && h<24) && (m>=0 && m<=59) && (s>=0 && s<=59)){
            System.out.println("La hora ingresada es correcta");
        } else {
            System.out.println("La hora ingresada es incorrecta");
        }
    }
}
