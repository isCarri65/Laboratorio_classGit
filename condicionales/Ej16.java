import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        int num1, num2, mayor, menor;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero:");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero:");
        num2 = sc.nextInt();

        if (num1 != num2){
            if (num1>num2){
                mayor = num1;
                menor = num2;
            } else {
                mayor = num2;
                menor = num1;
            }
            if (menor!=0){
                System.out.println("La división de "+mayor+" entre "+menor+" es de "+(mayor/menor));
            } else {
                System.out.println("Error. No se puede dividir entre 0.");
            }
        } else {
            System.out.println("Ambos números son iguales, la división entre ambos da 1.");
        }
    }
}
