package javapoo.actividadextra2.servicios;

import java.util.Scanner;
import javapoo.actividadextra2.entidades.Pelicula;

public class PeliculaService {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Pelicula crearPelicula() {
        System.out.println("Ingresar título de la película:");
        String titulo = sc.next();
        
        System.out.println("Ingresar género:");
        String genero = sc.next();
        
        System.out.println("Ingresar año:");
        int año = sc.nextInt();
        
        System.out.println("Ingresar duración (minutos):");
        int duracion = sc.nextInt();
        
        return new Pelicula(titulo, genero, año, duracion);
    }
}
