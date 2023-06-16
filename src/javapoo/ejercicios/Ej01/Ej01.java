package javapoo.ejercicios.Ej01;

import java.util.Scanner;

public class Ej01 {
    
    private static Scanner sc;
    
    public static void main(String[] args) {
         sc = new Scanner(System.in).useDelimiter("\n");
         cargarLibro();
    }
    
    public static void cargarLibro() {
        System.out.println("Ingresar ISBN:");
        String ISBN = sc.nextLine();
        System.out.println("Ingresar título:");
        String titulo = sc.nextLine();
        System.out.println("Ingresar autor:");
        String autor = sc.nextLine();
        System.out.println("Ingresar páginas:");
        int paginas = sc.nextInt();
        
        Libro libro = new Libro(ISBN, titulo, autor, paginas);
        System.out.println(libro.toString());
    }
}
