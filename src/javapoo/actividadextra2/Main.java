package javapoo.actividadextra2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import javapoo.actividadextra2.entidades.Alquiler;
import javapoo.actividadextra2.entidades.Pelicula;
import javapoo.actividadextra2.servicios.AlquilerService;
import javapoo.actividadextra2.servicios.DateService;
import javapoo.actividadextra2.servicios.PeliculaService;

public class Main {
    
    private final Scanner sc;
    private final ArrayList<Pelicula> peliculas;
    private final ArrayList<Alquiler> alquileres;
    private final AlquilerService alquilerService;
    private final PeliculaService peliculaService;
    private int ingresoTotal;
    
    public Main() {
        sc = new Scanner(System.in).useDelimiter("\n");
        alquilerService = new AlquilerService();
        peliculaService = new PeliculaService();
        peliculas = new ArrayList<>();
        alquileres = new ArrayList<>();
    }
    
    public static void main(String[] args) {
        Main main =  new Main();
        main.iniciar();
    }

    public void iniciar() {
        boolean salir;
        cargarPeliculasIniciales();
        
        do {
            salir = mostrarMenu();
        } while (!salir);
    }
    
    public boolean mostrarMenu() {
        System.out.println();
        System.out.println("Seleccione una opción:");
        System.out.println();
        System.out.println("1. Crear película");
        System.out.println("2. Crear alquiler");
        System.out.println("3. Listar películas disponibles");
        System.out.println("4. Listar películas alquiladas");
        System.out.println("5. Buscar película por título");
        System.out.println("6. Buscar película por género");
        System.out.println("7. Buscar alquiler por fecha");
        System.out.println("8. Calcular ingreso total");
        System.out.println("9. Salir");
        System.out.println();
        
        String opcion = sc.next();
        
        switch (opcion) {
            case "1":
                crearPelicula();
                break;
            case "2":
                alquilarPelicula();
                break;
            case "3":
                listarPeliculasDisponibles();
                break;
            case "4":
                listarPeliculasAlquiladas();
                break;
            case "5":
                buscarPeliculaPorTitulo();
                break;
            case "6":
                buscarPeliculaPorGenero();
                break;
            case "7":
                buscarAlquilerPorFecha();
                break;
            case "8":
                calcularIngresoTotal();
                break;
            case "9":
                return true;
            default:
                System.err.println("¡Opción incorrecta!");
        }
        
        return false;
    }
    
    private void crearPelicula() {
        Pelicula pelicula = peliculaService.crearPelicula();
        peliculas.add(pelicula);
    }
    
    private void alquilarPelicula() {
        Pelicula pelicula = buscarPeliculaPorTitulo();
        
        if (pelicula == null) {
            System.out.println("Película no se encuentra.");
            return;
        }
        
        if (pelicula.isAlquilada()) {
            System.out.println("Película no disponible.");
            return;
        }
        
        Alquiler alquiler = alquilerService.crearAlquiler(pelicula);
        alquileres.add(alquiler);
    }
    
    private void listarPeliculasDisponibles() {
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
    
    private void listarPeliculasAlquiladas() {
        for (Alquiler alquiler : alquileres) {
            System.out.println(alquiler);
        }
        
        if (alquileres.isEmpty())
            System.out.println("No hay películas alquiladas.");
    }
    
    private Pelicula buscarPeliculaPorTitulo() {
        System.out.println("Ingresar título:");
        String titulo = sc.next();
        
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getTitulo().equalsIgnoreCase(titulo))
                return pelicula;
        }
        
        System.out.println("Película no encontrada.");
        return null;
    }
    
    private void buscarPeliculaPorGenero() {
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
    
    private void buscarAlquilerPorFecha() {
        LocalDate fecha = DateService.solicitarFecha("Ingresar fecha (aaaa-mm-dd):");
        boolean encontrado = false;
        
        for (Alquiler alquiler : alquileres) {
            if (alquiler.getFechaDeInicio().equals(fecha)) {
                System.out.println(alquiler);
                encontrado = true;
            }
        }
        
        if (!encontrado)
            System.out.println("Alquiler no encontrado.");
    }
    
    private void calcularIngresoTotal() {
        for (Alquiler alquiler : alquileres) {
            ingresoTotal += alquiler.getPrecio();
        }
        
        System.out.println("Ingreso total: " + ingresoTotal);
    }
    
    private void cargarPeliculasIniciales() {
        peliculas.add(new Pelicula("Avatar", "Aventura", 2009, 162));
        peliculas.add(new Pelicula("Titanic", "Drama", 1997, 194));
        peliculas.add(new Pelicula("Jurassic Park", "Aventura", 1993, 127));
        peliculas.add(new Pelicula("El Rey Leon", "Animada", 1994, 118));
        peliculas.add(new Pelicula("El Padrino", "Drama", 1972, 175));
    }
    
}
