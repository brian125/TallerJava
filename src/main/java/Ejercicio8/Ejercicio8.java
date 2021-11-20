package Ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String diaSemana;
        System.out.print("Ingresa un día de la semana: ");
        diaSemana = sc.nextLine();
        diaSemana = diaSemana.replaceAll("\\s", "");
        diaSemana = diaSemana.toLowerCase();

        switch (diaSemana){
            case "lunes":
                System.out.println("Día Laboral");
                break;
            case "martes":
                System.out.println("Día Laboral");
                break;
            case "miercoles":
                System.out.println("Día Laboral");
                break;
            case "jueves":
                System.out.println("Día Laboral");
                break;
            case "viernes":
                System.out.println("Día Laboral");
                break;
            case "sabado":
                System.out.println("No es día laboral");
                break;
            case "domingo":
                System.out.println("No es día laboral");
                break;
            default:
                System.out.println("Ups!! ese no es un día de la semana, intentalo de nuevo");
                break;
        }

    }

}
