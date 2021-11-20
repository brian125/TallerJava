package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String radio;
        System.out.print("Ingrese el radio del círculo: ");
        radio = sc.nextLine();
        radio = radio.replaceAll("\\s", "");
        System.out.println("El área del circulo es: " + (Math.PI * Math.pow(Double.parseDouble(radio),2)) + " m2");
    }

}
