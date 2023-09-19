import java.util.Scanner;

public class Ej19 {
    public static void main(String[] args) {
        int mes;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de un mes:");
        mes = sc.nextInt();

        if (mes>=1 && mes<=12){
            switch (mes) {
                case 1:
                    System.out.print("Enero");
                    break;
                case 2:
                    System.out.print("Febrero");
                    break;
                case 3:
                    System.out.print("Marzo");
                    break;
                case 4:
                    System.out.print("Abril");
                    break;
                case 5:
                    System.out.print("Mayo");
                    break;
                case 6:
                    System.out.print("Junio");
                    break;
                case 7:
                    System.out.print("Julio");
                    break;
                case 8:
                    System.out.print("Agosto");
                    break;
                case 9:
                    System.out.print("Septiembre");
                    break;
                case 10:
                    System.out.print("Octubre");
                    break;
                case 11:
                    System.out.print("Noviembre");
                    break;
                case 12:
                    System.out.print("Diciembre");
                    break;
            }
            if (mes==4 || mes==6 || mes==9 || mes==11){
                System.out.println(" tiene 30 días");
            } else if (mes == 2) {
                System.out.println(" tiene 28 días");
            } else {
                System.out.println(" tiene 31 días");
            }
        } else {
            System.out.println("El mes ingresado es incorrecto");
        }
    }
}
