import java.util.Scanner;

public class Ej_14_Func {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nota media, mayor y menor de una clase");
        System.out.println("--------------------------------------");

        int n;
        do {
            System.out.print("Introduce número de alumnos: ");
            n = sc.nextInt();
        } while (n <= 0);

        double[] notas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nota del alumno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        double[] resultados = calcularEstadisticas(notas);

        // Mostrar resultados
        System.out.printf("Nota media: %.2f %n", resultados[0]);
        System.out.println("La mayor nota ha sido un " + resultados[1]);
        System.out.println("La menor nota ha sido un " + resultados[2]);
    }

    public static double[] calcularEstadisticas(double[] notas) {
        double suma = 0;
        double mayor = notas[0];
        double menor = notas[0];

        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];

            if (notas[i] > mayor) {
                mayor = notas[i];
            }

            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        double media = suma / notas.length;

        double[] resultados = { media, mayor, menor };

        return resultados;
    }
}
