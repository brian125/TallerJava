package Ejercicio17;

public class Lavadora extends Electrodomestico {

    //Atributo
    private int carga;

    //Valor por defecto
    private final int cargaDefecto = 5;

    public Lavadora() {
        this.carga = cargaDefecto;
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = cargaDefecto;
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        double pagoExtra = super.precioFinal();
        if(carga > 30){
            pagoExtra += 50;
        }
        return getPrecioBase()+pagoExtra;
    }
}
