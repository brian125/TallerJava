package Ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //El ejercicio pide 10 electrodomesticos pero por fines practicos solo tendremos 3
        Electrodomestico[] listaElectrodomesticos = new Electrodomestico[3];
        int opcion;

        for (int i = 0; i < listaElectrodomesticos.length;) {
            System.out.println("\n Ingrese una opción");
            System.out.println("1. Agregar Electrodomestico");
            System.out.println("2. Agregar lavadora");
            System.out.println("3. Agregar Television");
            opcion = sc.nextInt();

            if (opcion == 1 || opcion == 2 || opcion == 3){
                switch (opcion){
                    case 1:
                        String colorElectrodomestico;
                        char consumoEnergeticoElectrodomestico;
                        double precioBaseElectrodomestico, pesoElectrodomestico;

                        System.out.println("\nIngrese un color: ");
                        colorElectrodomestico = sc.next();

                        System.out.println("Ingrese el consumo energetico: ");
                        consumoEnergeticoElectrodomestico = sc.next().charAt(0);

                        System.out.println("Ingrese el precio base: ");
                        precioBaseElectrodomestico = sc.nextDouble();

                        System.out.println("Ingrece el peso: ");
                        pesoElectrodomestico = sc.nextDouble();

                        listaElectrodomesticos[i] = new Electrodomestico(precioBaseElectrodomestico,colorElectrodomestico,consumoEnergeticoElectrodomestico,pesoElectrodomestico);
                        System.out.println("\nElectrodomestico agregado");
                        i++;
                        break;
                    case 2:
                        String colorLavadora;
                        char consumoEnergeticoLavadora;
                        double precioBaseLavadora, pesoLavadora;
                        int carga;

                        System.out.println("\nIngrese un color: ");
                        colorLavadora = sc.next();

                        System.out.println("Ingrese el consumo energetico: ");
                        consumoEnergeticoLavadora = sc.next().charAt(0);

                        System.out.println("Ingrese el precio base: ");
                        precioBaseLavadora = sc.nextDouble();

                        System.out.println("Ingrese el peso: ");
                        pesoLavadora = sc.nextDouble();

                        System.out.println("Ingrese la carga de la lavadora");
                        carga = sc.nextInt();

                        listaElectrodomesticos[i] = new Lavadora(precioBaseLavadora,colorLavadora,consumoEnergeticoLavadora,pesoLavadora,carga);
                        System.out.println("\nLavadora agregada");
                        i++;
                        break;
                    case 3:
                        String colorTelevision;
                        char consumoEnergeticoTelevision;
                        double precioBaseTelevision, pesoTelevision;
                        int resolucion;
                        boolean sincronizadorTDT;

                        System.out.println("\nIngrese un color: ");
                        colorTelevision = sc.next();

                        System.out.println("Ingrese el consumo energetico: ");
                        consumoEnergeticoTelevision = sc.next().charAt(0);

                        System.out.println("Ingrese el precio base: ");
                        precioBaseTelevision = sc.nextDouble();

                        System.out.println("Ingrese el peso: ");
                        pesoTelevision = sc.nextDouble();

                        System.out.println("Ingrese la resolucion: ");
                        resolucion = sc.nextInt();

                        System.out.println("Ingrese el sincronisador TDT: (true/false) ");
                        sincronizadorTDT = sc.nextBoolean();

                        listaElectrodomesticos[i] = new Television(precioBaseTelevision,colorTelevision,consumoEnergeticoTelevision,pesoTelevision,resolucion,sincronizadorTDT);
                        System.out.println("\nTelevision agregada");
                        i++;
                        break;
                    default:
                        System.out.println("\nOpción inválida, intentalo de nuevo.");
                        break;
                }
            }
        }

        double sumaElectrodomesticos = 0;
        double sumaTelevisiones = 0;
        double sumaLavadoras = 0;

        for (int i = 0; i < listaElectrodomesticos.length; i++) {
            if(listaElectrodomesticos[i] instanceof  Electrodomestico){
                sumaElectrodomesticos += listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof  Lavadora){
                sumaLavadoras += listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Television){
                sumaTelevisiones += listaElectrodomesticos[i].precioFinal();
            }
        }

        System.out.println("\nEl precio de los electrodomesticos es de: "+sumaElectrodomesticos);
        System.out.println("El precio de las lavadoras es de: "+sumaLavadoras);
        System.out.println("El precio de las televisiones es de: "+sumaTelevisiones);

        System.out.println("\nSuma total del listado de electrodomesticos: "+ (sumaElectrodomesticos+sumaLavadoras+sumaTelevisiones));

    }

}
