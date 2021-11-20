package Ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un texto por consola, se indicara la longitud y el número de vocales");
        String texto = sc.nextLine();
        System.out.println("Longitud del texto: "+texto.length()+" letras" );
        int vocalesTotales = 0;
        char temp;
        for (int i = 0; i < texto.length(); i++) {
            temp = texto.charAt(i);
            temp = Character.toLowerCase(temp);
            if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u'){
                vocalesTotales++;
            }
        }
        System.out.println("a,e,i,o,u esta " + vocalesTotales + " veces en el texto");
    }
}
