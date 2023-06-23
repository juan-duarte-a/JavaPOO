package javapoo.actividadextra1.Ej2;

public class Circulo implements Figura {
    
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double getRadio() {
        return radio;
    }
    
}
