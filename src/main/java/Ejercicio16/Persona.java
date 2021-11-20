package Ejercicio16;

public class Persona {

    //Atributos
    private String nombre = "";
    private int edad = 0;
    private String  DNI;
    private char sexo;
    private double peso = 0;
    private double altura = 0;

    //Constantes
    private final char sexoDefecto = 'H';
    public final int pesoIdeal = -1;
    public final int debajoPesoIdeal = 0;
    public final int sobrePeso = 1;

    public Persona(){

    }

    public Persona(String nombre,int edad, char sexo){
        this(nombre, edad, sexo,0,0);
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        generarDNI();
        this.sexo = sexo;
        comprobarSexo();
    }

    //Para prevenir que el usuario ponga un sexo incorrecto ejemplo: sexo = 'F' o sexo = 'M'
    private void comprobarSexo() {
        if (sexo != 'H' && sexo != 'M'){
            this.sexo = sexoDefecto;
        }
    }

    private void generarDNI(){
        final int divisor = 23;

        //Para generar un número aleatorio de 8 cifras
        int randomDNI = ((int) Math.floor(Math.random()*(100000000 - 10000000)+10000000));
        int calcLetraDNI = randomDNI % 23;

        //Para calcular la letra del DNI
        char letraDNI = generarLetraDNI(calcLetraDNI);
        DNI = Integer.toString(randomDNI)+letraDNI;
    }

    private char generarLetraDNI(int calcLetraDNI) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M' , 'Y' , 'F', 'P', 'D', 'X',
            'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
        return letras[calcLetraDNI];
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIMC(){
        double pesoActual = peso / (Math.pow(altura,2));
        if (pesoActual < 20){
            return pesoIdeal;
        }else if (pesoActual >= 20 && pesoActual <= 25) {
            return debajoPesoIdeal;
        }else {
            return sobrePeso;
        }
    }

    public boolean MayorDeEdad() {
        boolean mayor = false;
        if (edad >= 18){
            mayor = true;
        }
        return mayor;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }


}
