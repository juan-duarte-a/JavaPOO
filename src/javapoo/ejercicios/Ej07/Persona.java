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
    
    public int calcularIMC() {
        double imc = peso / (altura * altura);
        
        if (imc < 20)
            return -1;
        else if (imc <= 25)
            return 0;
        else
            return 1;
    }
    
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
}
