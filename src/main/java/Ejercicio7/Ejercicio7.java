package Ejercicio7;

import java.util.Scanner;

    public class Ejercicio7 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int numero;
            do {
                System.out.println("Ingrese el valor del numero: ");
                numero = sc.nextInt();
            }while (numero < 0);
            System.out.println("Su numero es: "+ numero + " y es mayor o igual que cero");
        }

    }
