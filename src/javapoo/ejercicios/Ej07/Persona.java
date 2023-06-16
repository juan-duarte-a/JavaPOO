package javapoo.ejercicios.Ej07;

public class Persona {
    
    private String nombre;
    private int edad;
    private double peso;
    private double altura;
    public enum Sexo {HOMBRE, MUJER, OTRO};
    private Sexo sexo;

    public Persona(String nombre, int edad, double peso, double altura, Sexo sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    
    /**
    * Calcula si la persona está en su peso ideal de acuerdo 
    * al Índice de Masa Corporal.
    * 
    * @return <code>-1</code> si la persona está por debajo de su peso ideal.
    *          <code>0</code> si la persona está en su peso ideal.
    *          <code>1</code> si la persona está por encima de su peso ideal.
    */
    public int calcularIMC() {
        double imc = peso / (altura * altura);
        return imc < 20 ? -1 : imc <= 25 ? 0 : 1;
    }
    
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
    
    @Override
    public String toString() {
        return nombre + ", " + edad + ", " + sexo.toString().toLowerCase() + ".";
    }
}
