import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        String num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero de 3 cifras:");
        num = sc.next();

        if (num.length()==3){
            if ((num.substring(0,1)).equals(num.substring(2,3))){
                System.out.println("El numero ingresado es capicúa");
            }else {
                System.out.println("El numero ingresado NO es capicúa");
            }
        }else {
            System.out.println("El numero ingresado no tiene 3 cifras");
        }
    }
}
