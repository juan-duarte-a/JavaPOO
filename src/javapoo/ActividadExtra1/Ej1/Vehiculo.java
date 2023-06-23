package javapoo.ActividadExtra1.Ej1;

public class Vehiculo {
    
    private final String marca;
    private final String modelo;
    private final int año;
    private final Tipo tipo;

    public static enum Tipo {
        Automóvil (3, 2), 
        Motocicleta (2, 2), 
        Bicicleta (1, 0);
        
        private final int velocidad;
        private final int distanciaDeFrenado;

        private Tipo(int velocidad, int distanciaDeFrenado) {
            this.velocidad = velocidad;
            this.distanciaDeFrenado = distanciaDeFrenado;
        }
    };
    
    public Vehiculo(String marca, String modelo, int año, Tipo tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tipo = tipo;
    }
    
    public int moverse(int tiempo) {
        return tiempo * tipo.velocidad;
    }
    
    public int frenar() {
        return tipo.distanciaDeFrenado;
    }
    
    @Override
    public String toString() {
        return tipo + ". " + marca + " " + modelo + ", " + año;
    }
    
}
