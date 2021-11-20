package Ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la palabra 1: ");
        String palabra1 = sc.nextLine();
        System.out.println("Ingrese la palabra 2: ");
        String palabra2 = sc.nextLine();

        if (palabra1.equalsIgnoreCase(palabra2)){
            System.out.println("Las palabras son iguales");
        }else {
            System.out.println("Las palabras son diferentes, sus diferencias son: ");
            int posicion = 0;
            for (int i = 0; i < palabra1.length() && i < palabra2.length(); i++) {
                if (palabra1.charAt(i) != palabra2.charAt(i)) {
                    System.out.println("La diferencia esta en la letra " + palabra1.charAt(i)
                            + " y " + palabra2.charAt(i) + " de la posición " + (i + 1));
                    break;
                }
                posicion = i;
            }
            if (palabra1.length() > palabra2.length()){
                System.out.println("La palabra " + palabra2 + " está incompleta en la posición "+ (posicion+1));
            }else {
                System.out.println("La palabra " + palabra1 + " está incompleta en la posición "+ (posicion+1));
            }
        }
    }

}
