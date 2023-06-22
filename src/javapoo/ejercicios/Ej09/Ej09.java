package javapoo.ejercicios.Ej09;

public class Ej09 {
    
    public static void main(String[] args) {
        Matematica matematica = new Matematica(Math.random() * 10, Math.random() * 10);
        
        System.out.println("Número 1: " + matematica.getNumero1());
        System.out.println("Número 2: " + matematica.getNumero2());
        System.out.println("Devolver mayor: " + matematica.devolverMayor());
        System.out.println("Calcular potencia: " + matematica.calcularPotencia());
        System.out.println("Calcular raiz: " + matematica.calcularRaiz());
    }
    
}
