import java.util.Scanner;

public class Ejercicio_18 {
    private static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        String num;
        StringBuilder num2 = new StringBuilder();
        do {
           num = sc.next();
           if (isNumeric(num)) {
               break;
           } else {
               System.out.println("valor incorrecto, tiene que ingresar un número");
           }
        } while (!(isNumeric(num)));
        int largo = num.length();
        for (int i = 0; i < largo; i++) {
            num2.append(num.charAt(largo - 1 - i));

        }
        System.out.println("invertido: "+num2);
    }

}
