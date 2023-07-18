package javapoo.desafiogrupal.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import javapoo.desafiogrupal.entidades.Rutina;
import javapoo.desafiogrupal.entidades.Rutina.NivelDificultad;

public class ServicioRutina {
    
    private final Scanner sc;
    private final List<Rutina> rutinas;

    public ServicioRutina() {
        sc = new Scanner(System.in).useDelimiter("\n");
        rutinas = new ArrayList<>();
    }
    
    public Rutina crearRutina() {
        Properties datos = obtenerDatosRutina();
        
        char nivel = datos.getProperty("dificultad").toUpperCase().charAt(0);
        NivelDificultad dificultad =  
                nivel == 'A' ? Rutina.NivelDificultad.Alta
                : nivel == 'M' ? Rutina.NivelDificultad.Media 
                : Rutina.NivelDificultad.Baja;
        
        Rutina rutina = new Rutina(
                datos.getProperty("nombre"), 
                Integer.parseInt(datos.getProperty("duracion")), 
                dificultad,
                datos.getProperty("descripcion"));
                
        agregarRutina(rutina);
        
        return rutina;
    }
    
    public void agregarRutina(Rutina rutina) {
        rutinas.add(rutina);
    }
    
    public List<Rutina> obtenerRutinas() {
        return rutinas;
    }
    
    public void actualizarRutina(
            int id, String nombre, int duracion, NivelDificultad dificultad, String descripcion) {
        
        Rutina rutina = buscarRutina(id);
        rutina.setId(id);
        rutina.setNombre(nombre);
        rutina.setDuracion(duracion);
        rutina.setDificultad(dificultad);
        rutina.setDescripcion(descripcion);
    }
    
    public void eliminarRutina(int id) {
        rutinas.remove(buscarRutina(id));
        System.out.println("Rutina eliminada.");
        System.out.println();
    }
    
    public Rutina buscarRutina(int id) {
        for (Rutina rutina : rutinas) {
            if (rutina.getId() == id)
                return rutina;
        }
        
        System.err.println("Rutina no encontrada.");
        System.out.println();
        return null;
    }
    
    private Properties obtenerDatosRutina() {
        Properties datos = new Properties();

        System.out.println("Ingresar nombre:");
        String nombre = sc.nextLine();
        System.out.println("Ingresar duración (min):");
        String duracion = sc.next();
        System.out.println("Ingresar dificultad (A = Alta, M = Media, B = Baja):");
        String dificultad = sc.next();
        System.out.println("Ingresar descripción:");
        String descripcion = sc.next();
        System.out.println();
        
        datos.setProperty("nombre", nombre);
        datos.setProperty("duracion", duracion);
        datos.setProperty("dificultad", dificultad);
        datos.setProperty("descripcion", descripcion);
        
        return datos;
    }
    
    public void actualizacionRutina(int id) {
        Properties datos = obtenerDatosRutina();

        char nivel = datos.getProperty("dificultad").toUpperCase().charAt(0);
        NivelDificultad dificultad =  
                nivel == 'A' ? Rutina.NivelDificultad.Alta
                : nivel == 'M' ? Rutina.NivelDificultad.Media 
                : Rutina.NivelDificultad.Baja;
        
        Rutina rutina = buscarRutina(id);

        rutina.setNombre(datos.getProperty("nombre"));
        rutina.setDuracion(Integer.parseInt(datos.getProperty("duracion")));
        rutina.setDificultad(dificultad);
        rutina.setDescripcion(datos.getProperty("descripcion"));
    }
    
}
