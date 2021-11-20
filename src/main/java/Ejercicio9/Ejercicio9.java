package Ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String textoInicial = "La sonrisa sera la mejor arma contra la tristeza";
        textoInicial = textoInicial.replaceAll("a","e");
        System.out.println(textoInicial);
        System.out.println("Ingrese el texto a concatenar: ");
        String textoAdicional = sc.nextLine();
        System.out.println(textoInicial.concat(textoAdicional));
    }

}
