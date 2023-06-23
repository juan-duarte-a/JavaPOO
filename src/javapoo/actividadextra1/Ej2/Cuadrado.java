package javapoo.actividadextra1.Ej2;

public class Cuadrado implements Figura {
    
    private final double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }
    
    @Override
    public double calcularArea() {
        return lado * lado;
    }

    public double getLado() {
        return lado;
    }
    
}
