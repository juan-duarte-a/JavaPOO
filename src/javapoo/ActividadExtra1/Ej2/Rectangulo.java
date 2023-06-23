package javapoo.ActividadExtra1.Ej2;

public class Rectangulo implements Figura {

    private final double alto;
    private final double ancho;

    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }
    
    @Override
    public double calcularPerimetro() {
        return alto * 2 + ancho * 2;
    }
    
    @Override
    public double calcularArea() {
        return alto * ancho;
    }

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }
    
}
