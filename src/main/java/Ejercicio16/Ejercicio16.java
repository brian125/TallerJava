package Ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese su sexo: ");
        char sexo = sc.next().charAt(0);
        System.out.println("Ingrese su peso en kg: ");
        double peso = sc.nextDouble();
        System.out.println("Ingrese su altura en metros(Utiliza la coma(,) ejemplo 1,87): ");
        double altura = sc.nextDouble();

        Persona persona1 = new Persona(nombre,edad,sexo,peso,altura);
        Persona persona2 = new Persona(nombre,edad,sexo);
        Persona persona3 = new Persona();

        persona3.setNombre("Camilo");
        persona3.setEdad(15);
        persona3.setSexo('H');
        persona3.setPeso(60);
        persona3.setAltura(1.60);

        System.out.println("Persona1");
        MuestraMensajePeso(persona1);
        MuestraMayorDeEdad(persona1);
        System.out.println(persona1.toString());


        System.out.println("Persona2");
        MuestraMensajePeso(persona2);
        MuestraMayorDeEdad(persona2);
        System.out.println(persona2.toString());

        System.out.println("Persona3");
        MuestraMensajePeso(persona3);
        MuestraMayorDeEdad(persona3);
        System.out.println(persona3.toString());

    }

    public static void MuestraMensajePeso(Persona persona) {
        if(persona.calcularIMC() == -1){
            System.out.println("La persona esta en el peso ideal");
        }else if(persona.calcularIMC() == 0){
            System.out.println("La persona esta por debajo del peso ideal");
        }else if (persona.calcularIMC() == 1){
            System.out.println("La persona esta por encima del peso ideal");
        }
    }

    public static void MuestraMayorDeEdad(Persona persona){
        if(persona.MayorDeEdad()){
            System.out.println("La persona es mayor de edad");
        }else {
            System.out.println("La persona es menor de edad");
        }
    }

}
