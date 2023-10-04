import java.util.*;

public class Ej_7 {

    public static void main(String[] args) {

        int i,suma=0, n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce primer número: ");
        n1 = sc.nextInt();
        System.out.print("Introduce segundo número: ");
        n2 = sc.nextInt();

        for(i = 1;i < n1;i++){  // for para sumar todos los divisores propios de n1                                   
            if(n1%i==0){
                suma=suma+i;
            }
        }

        if(suma==n2){
            suma=0;
            for(i = 1;i < n2;i++){
                if(n2%i==0){
                    suma=suma+i;
                }
            }
            if(suma==n1){
                System.out.println("Son Amigos");
            }else{
                System.out.println("No son amigos");
            }
        }
        else{
            System.out.println("No son amigos");
        }
    }
}