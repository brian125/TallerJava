package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final float iva = 21;
        float precioProducto;
        System.out.print("Ingrese el precio del producto: " + "$");
        precioProducto = sc.nextFloat();
        System.out.println("El producto con el iva tiene un valor de = " + (((iva/100)+1)*precioProducto) + "$");
    }

}
