package javapoo.ejercicios.Ej03;

import java.util.Scanner;

public class Ej03 {
    
    private static Scanner sc;
    private static Operacion operacion;
    
    public static void main(String[] args) {
        sc = new Scanner(System.in).useDelimiter("\n");
        crearOperación();
        
        System.out.println("Suma: " + operacion.sumar());
        System.out.println("Resta: " + operacion.restar());
        System.out.println("Multiplicación: " + operacion.multiplicar());
        System.out.println("División: " + (operacion.dividir() == null ? 
                "Error. División por cero no permitida" : operacion.dividir()));
    }
    
    public static void crearOperación() {
        System.out.println("Ingresar número 1:");
        double num1 = sc.nextDouble();
        System.out.println("Ingresar número 2:");
        double num2 = sc.nextDouble();
        
        operacion = new Operacion(num1, num2);
    }
    
}
