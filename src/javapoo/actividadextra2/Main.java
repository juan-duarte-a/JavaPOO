package javapoo.actividadextra2;

import java.util.Scanner;
import javapoo.actividadextra2.entidades.Pelicula;
import javapoo.actividadextra2.servicios.AlquilerService;
import javapoo.actividadextra2.servicios.PeliculaService;

public class Main {
    
    private final Scanner sc;
    private final AlquilerService alquilerService;
    private final PeliculaService peliculaService;
    
    public Main() {
        sc = new Scanner(System.in).useDelimiter("\n");
        alquilerService = new AlquilerService();
        peliculaService = new PeliculaService();
    }
    
    public static void main(String[] args) {
        Main main = new Main();
        main.iniciar();
    }

    public void iniciar() {
        boolean salir;
        peliculaService.cargarPeliculasIniciales();
        
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
        peliculaService.crearPelicula();
    }
    
    private void alquilarPelicula() {
        Pelicula pelicula = peliculaService.buscarPeliculaPorTitulo();
        
        if (pelicula == null) {
            return;
        }
        
        if (pelicula.isAlquilada()) {
            System.out.println("Película no disponible.");
            return;
        }
        
        alquilerService.crearAlquiler(pelicula);
    }
    
    private void listarPeliculasDisponibles() {
        peliculaService.listarPeliculasDisponibles();
    }
    
    private void listarPeliculasAlquiladas() {
        alquilerService.listarPeliculasAlquiladas();
    }
    
    private void buscarPeliculaPorTitulo() {
        Pelicula pelicula = peliculaService.buscarPeliculaPorTitulo();
        
        if (pelicula != null)
            System.out.println(pelicula);
    }
    
    private void buscarPeliculaPorGenero() {
        peliculaService.buscarPeliculaPorGenero();
    }
    
    private void buscarAlquilerPorFecha() {
        alquilerService.buscarAlquilerPorFecha();
    }
    
    private void calcularIngresoTotal() {
        System.out.println("Ingreso total: " + alquilerService.getIngresoTotal());
    }
    
}
