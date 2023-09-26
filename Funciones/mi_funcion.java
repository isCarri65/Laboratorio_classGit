package Funciones;

public class mi_funcion {

    public static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
    }

    public static int invertir(int num){
        String num_s = Integer.toString(num);
        int largo = num_s.length();
        String num2 = "";
        for (int i = 0; i < largo; i++) {
            num2 = num2.concat(num_s.substring(largo - 1 - i, largo-i));
        }
        return Integer.parseInt(num2);
    }

    public static void imprimir_tabla(int num) {
        System.out.println("Tabla del " + num);
        for (int i = 1; i < 11; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}
