import java.util.Scanner;

public class Ej_12_CodigoCesar {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String mensaje;
        int desplazamiento;
        char opcion;

        System.out.print("Ingrese un mensaje: ");
        mensaje = inputScanner.nextLine();

        System.out.print("Ingrese el desplazamiento: ");
        desplazamiento = inputScanner.nextInt();

        System.out.print("Elija: (1) cifrar o (2) descifrar?: ");
        opcion = inputScanner.next().charAt(0);

        if (opcion == '1') {
            System.out.println("Mensaje codificado: " + codificarCesar(mensaje, desplazamiento));
        } else {
            System.out.println("Mensaje decodificado: " + decodificarCesar(mensaje, desplazamiento));
        }
    }

    public static String codificarCesar(String mensaje, int desplazamiento) {
        StringBuilder codificado = new StringBuilder();
        desplazamiento = desplazamiento % 26;

        for (int i = 0; i < mensaje.length(); i++) {
            char c = mensaje.charAt(i);
            if (c >= 'a' && c <= 'z') {
                codificado.append((char) ((c + desplazamiento - 'a' + 26) % 26 + 'a'));
            } else if (c >= 'A' && c <= 'Z') {
                codificado.append((char) ((c + desplazamiento - 'A' + 26) % 26 + 'A'));
            } else {
                codificado.append(c);
            }
        }

        return codificado.toString();
    }

    public static String decodificarCesar(String mensaje, int desplazamiento) {
        StringBuilder decodificado = new StringBuilder();
        desplazamiento = desplazamiento % 26;

        for (int i = 0; i < mensaje.length(); i++) {
            char c = mensaje.charAt(i);
            if (c >= 'a' && c <= 'z') {
                decodificado.append((char) ((c - desplazamiento - 'a' + 26) % 26 + 'a'));
            } else if (c >= 'A' && c <= 'Z') {
                decodificado.append((char) ((c - desplazamiento - 'A' + 26) % 26 + 'A'));
            } else {
                decodificado.append(c);
            }
        }

        return decodificado.toString();
    }
} // Fin CodificacionCesar
