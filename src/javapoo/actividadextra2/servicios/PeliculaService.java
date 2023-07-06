package javapoo.actividadextra2.servicios;

import java.util.ArrayList;
import java.util.Scanner;
import javapoo.actividadextra2.entidades.Pelicula;

public class PeliculaService {
    
    Scanner sc;
    private final ArrayList<Pelicula> peliculas;

    public PeliculaService() {
        sc = new Scanner(System.in).useDelimiter("\n");
        peliculas = new ArrayList<>();
    }
    
    public Pelicula crearPelicula() {
        System.out.println("Ingresar título de la película:");
        String titulo = sc.next();
        
        System.out.println("Ingresar género:");
        String genero = sc.next();
        
        System.out.println("Ingresar año:");
        int año = sc.nextInt();
        
        System.out.println("Ingresar duración (minutos):");
        int duracion = sc.nextInt();
        
        Pelicula pelicula = new Pelicula(titulo, genero, año, duracion);
        peliculas.add(pelicula);
        
        return pelicula;
    }
    
    public Pelicula buscarPeliculaPorTitulo() {
        System.out.println("Ingresar título:");
        String titulo = sc.next();
        
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getTitulo().equalsIgnoreCase(titulo))
                return pelicula;
        }
        
        System.out.println("Película no encontrada.");
        return null;
    }
    
    public void buscarPeliculaPorGenero() {
        System.out.println("Ingresar género:");
        String genero = sc.next();
        boolean encontrado = false;
        
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getGenero().equalsIgnoreCase(genero)) {
                System.out.println(pelicula);
                encontrado = true;
            }
        }
        
        if (!encontrado)
            System.out.println("No existen películas con el género " + genero + ".");
    }

    public void listarPeliculasDisponibles() {
        boolean encontrado = false;
        
        for (Pelicula pelicula : peliculas) {
            if (!pelicula.isAlquilada()) {
                System.out.println(pelicula);
                encontrado = true;
            }
        }

        if (!encontrado)
            System.out.println("No hay películas disponibles.");
    }
    
    public void cargarPeliculasIniciales() {
        peliculas.add(new Pelicula("Avatar", "Aventura", 2009, 162));
        peliculas.add(new Pelicula("Titanic", "Drama", 1997, 194));
        peliculas.add(new Pelicula("Jurassic Park", "Aventura", 1993, 127));
        peliculas.add(new Pelicula("El Rey Leon", "Animada", 1994, 118));
        peliculas.add(new Pelicula("El Padrino", "Drama", 1972, 175));
    }

}
