package javapoo.ejercicios.Ej09;

public class Matematica {
        private double numero1;
    private double numero2;

    public Matematica() { }

    public Matematica(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public double devolverMayor() {
        return Double.max(numero1, numero2);
    }
    
    public double devolverMenor() {
        return Double.min(numero1, numero2);
    }
    
    public double calcularPotencia() {
        return Math.pow(Math.rint(devolverMayor()), Math.rint(devolverMenor()));
    }
    
    public double calcularRaiz() {
        return Math.sqrt(Math.abs(devolverMenor()));
    }

}
