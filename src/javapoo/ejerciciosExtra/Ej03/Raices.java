package javapoo.ejerciciosExtra.Ej03;

public class Raices {
    private double a;
    private double b;
    private double c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {
        return b*b - 4 * a * c;
    }
    
    public boolean tieneRaices() {
        return getDiscriminante() > 0;
    }
    
    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }
    
    private double[] obtenerRaices() {
        double[] raices = new double[2];
        raices[0] = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
        raices[1] = (-b - Math.sqrt(getDiscriminante())) / (2 * a);
        return raices;
    }
    
    private double obtenerRaiz() {
        return (-b + Math.sqrt(getDiscriminante())) / (2 * a);
    }
    
    public double[] calcular() {
        if (tieneRaices())
            return obtenerRaices();
        else if(tieneRaiz())
            return new double[] {obtenerRaiz()};
        return new double[0];
    }
    
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
}
