package javapoo.ActividadExtra1.Ej2;

public class Pentagono implements Figura {
    
    private final double lado;

    public Pentagono(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 5;
    }
    
    @Override
    public double calcularArea() {
        return Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * lado / 4;
    }
    
    public double getLado() {
        return lado;
    }
    
}
