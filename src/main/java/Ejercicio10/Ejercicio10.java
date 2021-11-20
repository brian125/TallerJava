package Ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un texto, al ingresarlo se eliminarán todos sus espacios: ");
        String texto = sc.nextLine();
        texto = texto.replaceAll("\\s", "");
        System.out.println(texto);
    }

}
