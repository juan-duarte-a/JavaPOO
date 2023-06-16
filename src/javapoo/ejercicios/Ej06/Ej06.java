package javapoo.ejercicios.Ej06;

import java.util.Scanner;

public class Ej06 {

    private static Scanner sc;
    
    public static void main(String[] args) {
         sc = new Scanner(System.in).useDelimiter("\n");
         
         System.out.println("Ingresar capacidad máxima de la cafetera: ");
         int cantidad = sc.nextInt();
         
         Cafetera cafetera = new Cafetera(cantidad);
         System.out.println("Cantidad inicial de café: " + cafetera.getCantidadActual());
         cafetera.llenarCafetera();
         System.out.println("Cantidad de café después de llenar la cafetera: " + cafetera.getCantidadActual());
         System.out.println("Servir cantidad: 200");
         if(!cafetera.servirTaza(200))
             System.out.println("¡Cantidad en cafetera insuficiente!");
         System.out.println("Cantidad actual de café: " + cafetera.getCantidadActual());
         System.out.println("Servir cantidad: 200");
         if(!cafetera.servirTaza(200))
             System.out.println("¡Cantidad en cafetera insuficiente!");
         System.out.println("Cantidad actual de café: " + cafetera.getCantidadActual());
         System.out.println("Servir cantidad: 300");
         if(!cafetera.servirTaza(300))
             System.out.println("¡Cantidad en cafetera insuficiente!");
         System.out.println("Cantidad actual de café: " + cafetera.getCantidadActual());
         System.out.println("Servir cantidad: 400");
         if(!cafetera.servirTaza(400))
             System.out.println("¡Cantidad en cafetera insuficiente!");
         
         System.out.println("Cantidad de café en la cafetera: " + cafetera.getCantidadActual());
    }
    
}
