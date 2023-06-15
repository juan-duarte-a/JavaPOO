package javapoo.Ej02;

import java.util.Scanner;

public class Ej02 {

    private static Scanner sc;
    
    public static void main(String[] args) {
         sc = new Scanner(System.in).useDelimiter("\n");
         
         System.out.println("Ingresar radio de la circunferencia:");
         double radio = sc.nextDouble();
         Circunferencia circunferencia = new Circunferencia(radio);
         System.out.println("Área: " + circunferencia.calcularArea());
         System.out.println("Perímetro: " + circunferencia.calcularPerimetro());
    }
    
}
