package javapoo.ejercicios.Ej04;

import java.util.Scanner;

public class Ej04 {
    private static Scanner sc;
    
    public static void main(String[] args) {
         sc = new Scanner(System.in).useDelimiter("\n");
         
         System.out.println("Ingresar base del rectángulo:");
         double base = sc.nextDouble();
         System.out.println("Ingresar altura del rectángulo:");
         double altura = sc.nextDouble();
         
         Rectangulo rectangulo = new Rectangulo(base, altura);
         System.out.println("Superficie: " + rectangulo.calcularSuperficie());
         System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
    }
    
}
