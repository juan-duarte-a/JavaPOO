package javapoo.actividadextra1.Ej2;

public class Hexagono implements Figura{
    
    private final double lado;

    public Hexagono(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 6;
    }
    
    @Override
    public double calcularArea() {
        return 3 * Math.sqrt(3) * lado * lado / 2;
    }
    
    public double getLado() {
        return lado;
    }
    
}
