package Ejercicio17;

import java.util.Arrays;

public class Electrodomestico {

    //Atributos
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;

    //Valores por defecto
    private final double precioBaseDefecto = 100;
    private final String colorDefecto = "Blanco";
    private final char consumoEnergeticoDefecto = 'F';
    private final double pesoDefecto = 5;

    public Electrodomestico() {
        this.precioBase = precioBaseDefecto;
        this.color = colorDefecto;
        this.consumoEnergetico = consumoEnergeticoDefecto;
        this.peso = pesoDefecto;
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.color = colorDefecto;
        this.consumoEnergetico = consumoEnergeticoDefecto;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        consumoEnergetico = Character.toUpperCase(consumoEnergetico);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    private char comprobarConsumoEnergetico(char letra) {
        char consumo[] = {'A', 'B', 'C', 'D','E','F'};
        for (int i = 0; i < consumo.length; i++) {
            if(letra == consumo[i]){
                return letra;
            }
        }
        return consumoEnergeticoDefecto;
    }

    private String comprobarColor(String color){
        String colores[] = {"Blanco","Negro","Rojo", "Azul", "Gris"};
        for (int i = 0; i < colores.length; i++) {
            if (colores[i].equalsIgnoreCase(color)){
                return colores[i];
            }
        }
        return colorDefecto;
    }

    public double precioFinal() {
        double pagoExtra = 0;
        switch (consumoEnergetico){
            case 'A':
                pagoExtra += 100;
                break;
            case 'B':
                pagoExtra += 80;
                break;
            case 'C':
                pagoExtra += 60;
                break;
            case 'D':
                pagoExtra += 50;
                break;
            case 'E':
                pagoExtra += 30;
                break;
            case 'F':
                pagoExtra += 10;
                break;
        }

        if (peso >= 0 && peso <= 19){
            pagoExtra += 10;
        }else if (peso >= 20 && peso <= 49) {
            pagoExtra += 50;
        }else if(peso >= 50 && peso <= 79){
            pagoExtra += 80;
        }else{
            pagoExtra += 100;
        }

        return precioBase + pagoExtra;
    }
}
