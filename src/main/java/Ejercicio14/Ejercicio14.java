package Ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int numero = sc.nextInt();
        for (int i = numero; i <= 1000 ; i+=2) {
            System.out.println(i);
        }
    }

}
