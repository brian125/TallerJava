package Ejercicio18;

public class VideoJuego implements Entregable{

    //Atributos
    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compania;

    //Valores por defecto
    private final int horasEstimadasDefecto = 10;
    private final boolean entregadoDefecto = false;

    public VideoJuego() {
        this.titulo = " ";
        this.horasEstimadas = horasEstimadasDefecto;
        this.entregado = entregadoDefecto;
        this.genero = " ";
        this.compania = " ";
    }

    public VideoJuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = entregadoDefecto;
        this.genero = " ";
        this.compania = " ";
    }

    public VideoJuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compañia='" + compania + '\'' +
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
        VideoJuego ref = (VideoJuego) a;
        if (horasEstimadas > ref.getHorasEstimadas()){
            return "Mayor";
        }else if (horasEstimadas == ref.getHorasEstimadas()){
            return "Igual";
        }
        return "Menor";
    }
}
