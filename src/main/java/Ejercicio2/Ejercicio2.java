package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el número 1: ");
        int n1 = sc.nextInt();
        System.out.print("Ingresa el número 2: ");
        int n2 = sc.nextInt();

        System.out.println("Número 1: "+ n1);
        System.out.println("Número 2: "+ n2);

        if (n1 == n2){
            System.out.println("Son iguales");
        }else if(n1 > n2){
            System.out.println(n1 + " Es mayor");
            System.out.println(n2 + " Es menor");
        }else if(n2 > n1) {
            System.out.println(n2 + " Es mayor");
            System.out.println(n1 + " Es menor");
        }


    }

}
