package Ejercicio17;

public class Television extends Electrodomestico {

    //Atributos
    private int resolucion;
    private boolean sintonizadorTDT;

    //Valores por defecto
    private final int redolucionDefecto = 20;
    private final boolean sintonizadorTDTDefecto = false;

    public Television(int resolucion, boolean sintonizadorTDT) {
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion = redolucionDefecto;
        this.sintonizadorTDT = sintonizadorTDTDefecto;
    }

    public Television(double precioBase, String color, char consumoEnergetico, double peso, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public double precioFinal() {
        double pagoExtra = super.precioFinal();
        if(resolucion > 40){
            pagoExtra += getPrecioBase() * 0.3;
        }
        if (sintonizadorTDT){
            pagoExtra += 50;
        }
        return getPrecioBase()+pagoExtra;
    }
}
