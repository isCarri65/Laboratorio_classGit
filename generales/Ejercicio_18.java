import java.util.Scanner;

public class Ejercicio_18 {
    private static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        String num;
        String num2 = "";
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
            num2 = num2.concat(num.substring(largo - 1 - i, largo-i));

        }
        System.out.println("invertido: "+num2);
    }

}
