package Ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
        int n1 = 1,
            n2 = 9999;

        System.out.println("Número 1= "+n1);
        System.out.println("Número 2= "+n2);

        if (n1 == n2) {
            System.out.println("Son iguales ");
        }else if (n1 > n2){
            System.out.println(n1 + " Es mayor");
        }else if(n2 > n1) {
            System.out.println(n2 + " Es mayor");
        }

    }

}
