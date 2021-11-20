package Ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        System.out.println("****** GESTION CINEMATOGRAFICA ********");
        do {
            System.out.println("1-NUEVO ACTOR");
            System.out.println("2-BUSCAR ACTOR");
            System.out.println("3-ELIMINAR ACTOR");
            System.out.println("4-MODIFICAR ACTOR");
            System.out.println("5-VER TODOS LOS ACTORES");
            System.out.println("6- VER PELICULAS DE LOS ACTORES");
            System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
            System.out.println("8-SALIR");
            op = sc.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("Haz agregado un nuevo actor");
                        break;
                    case 2:
                        System.out.println("Haz buscado un actor");
                        break;
                    case 3:
                        System.out.println("Haz eliminado un actor");
                        break;
                    case 4:
                        System.out.println("Haz editado actor");
                        break;
                    case 5:
                        System.out.println("Haz visitado la lista de todos los actores");
                        break;
                    case 6:
                        System.out.println("Haz visto las peliculas de los actores");
                        break;
                    case 7:
                        System.out.println("Haz visto la categoria de las peliculas de los actores");
                        break;
                    case 8:
                        System.out.println("Cerranco sistema... !!Vuelve Pronto¡¡");
                        break;
                }
            }while (op != 8);
    }

}
