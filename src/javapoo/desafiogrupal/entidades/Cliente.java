package javapoo.desafiogrupal.entidades;

public class Cliente {
    
    private int id;
    private String nombre;
    private int edad;
    private int altura;
    private double peso;
    private String objetivo;
    private static int idCount = 101;

    public Cliente(String nombre, int edad, int altura, double peso, String objetivo) {
        this.id = idCount++;
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.objetivo = objetivo;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
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

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
    
    @Override
    public String toString() {
        return "ID: " + id + ". " 
                + nombre + ". " 
                + edad + " años. "
                + "Altura: " + altura + " cm. "
                + "Peso: " + peso + " Kg.";
    }
}
