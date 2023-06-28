package javapoo.ejerciciosExtra.Ej02;

import java.util.Scanner;

public class Ej02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingresar x1:");
        int x1 = sc.nextInt();
        System.out.println("Ingresar y1:");
        int y1 = sc.nextInt();
        System.out.println("Ingresar x2:");
        int x2 = sc.nextInt();
        System.out.println("Ingresar y2:");
        int y2 = sc.nextInt();
        
        Puntos p = new Puntos(x1, y1, x2, y2);
        System.out.println("Distancia: " + p.calcularDistancia());
    }
    
}
