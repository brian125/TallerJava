package Ejercicio18;

public class Serie implements Entregable {

    //Atributos
    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    //Valores por defecto
    private final int numeroTemporadasDefecto = 3;
    private boolean entregadoDefecto = false;

    public Serie() {
        this.titulo = " ";
        this.numeroTemporadas = numeroTemporadasDefecto;
        this.entregado = entregadoDefecto;
        this.genero = " ";
        this.creador = " ";
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadasDefecto;
        this.entregado = entregadoDefecto;
        this.genero = " ";
        this.creador = creador;
    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroTemporadas=" + numeroTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        entregado = true;
    }

    @Override
    public void devolver() {
        entregado = false;
    }

    @Override
    public boolean isEntregado() {
        if (entregado){
            return true;
        }
        return false;
    }

    @Override
    public String compareTo(Object a) {
        Serie ref = (Serie)a;
        if(numeroTemporadas > ref.getNumeroTemporadas()) {
            return "Mayor";
        }else if(numeroTemporadas == ref.getNumeroTemporadas()) {
            return "Igual";
        }
        return "Menor";
    }
}
