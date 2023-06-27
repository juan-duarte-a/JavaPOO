package javapoo.ejercicios.Ej12;

import java.util.Scanner;

public class Ej12 {
    
    private static Scanner sc;
    
    public static void main(String[] args) {
        sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println(crearPersona());
    }
    
    public static Persona crearPersona() {
        System.out.println("Ingresar nombre:");
        String nombre = sc.next();
        System.out.println("Ingresar fecha de nacimiento");
        System.out.print(" Año ->");
        int año = sc.nextInt();
        System.out.print(" Mes ->");
        int mes = sc.nextInt();
        System.out.print(" Día ->");
        int dia = sc.nextInt();

        return new Persona(nombre, año, mes, dia);
    }
    
}
