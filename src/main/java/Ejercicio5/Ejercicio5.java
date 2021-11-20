package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (i <= 100){
            if( i % 2 == 0 ){
                System.out.println(i + " PAR");
            }else {
                System.out.println(i + " IMPAR");
            }
            i++;
        }
    }

}
