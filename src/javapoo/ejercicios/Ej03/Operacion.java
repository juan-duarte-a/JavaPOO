package javapoo.ejercicios.Ej03;

import java.util.function.BiFunction;

public class Operacion {
    private Double numero1;
    private Double numero2;

    public Operacion() { }

    public Operacion(Double numero1, Double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Double getNumero1() {
        return numero1;
    }

    public void setNumero1(Double numero1) {
        this.numero1 = numero1;
    }

    public Double getNumero2() {
        return numero2;
    }

    public void setNumero2(Double numero2) {
        this.numero2 = numero2;
    }
    
    private Double calcular(BiFunction<Double, Double, Double> funcion) {
        return funcion == null ? null : funcion.apply(numero1, numero2);
    }
    
    public double sumar() {
        return calcular((n1, n2) -> n1 + n2);
    }

    public double restar() {
        return calcular((n1, n2) -> n1 - n2);
    }

    public double multiplicar() {
        return calcular((n1, n2) -> n1 * n2);
    }

    public Double dividir() {
        return calcular((n1, n2) -> n2 == 0 ? null : n1 / n2);
    }
}
