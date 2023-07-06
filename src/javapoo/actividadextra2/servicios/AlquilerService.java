package javapoo.actividadextra2.servicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import javapoo.actividadextra2.entidades.Alquiler;
import javapoo.actividadextra2.entidades.Pelicula;

public class AlquilerService {
    
    Scanner sc;
    private final ArrayList<Alquiler> alquileres;
    private int ingresoTotal;

    public AlquilerService() {
        sc = new Scanner(System.in).useDelimiter("\n");
        alquileres = new ArrayList<>();
    }
    
    public Alquiler crearAlquiler(Pelicula pelicula) {
        LocalDate fechaDeInicio = DateService.solicitarFecha(
                "Ingresar fecha de alquiler (aaaa-mm-dd):");
        
        System.out.println("Ingresar número de días de alquiler:");
        int dias = sc.nextInt();
        LocalDate fechaDeFin = fechaDeInicio.plusDays(dias);
        
        int precio = calcularPrecio(dias);
        pelicula.setAlquilada(true);
        
        Alquiler alquiler = new Alquiler(pelicula, fechaDeInicio, fechaDeFin, precio);
        alquileres.add(alquiler);
        
        return alquiler;
    }
    
    public void buscarAlquilerPorFecha() {
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
    
    public void listarPeliculasAlquiladas() {
        for (Alquiler alquiler : alquileres) {
            System.out.println(alquiler);
        }
        
        if (alquileres.isEmpty())
            System.out.println("No hay películas alquiladas.");
    }

    private int calcularPrecio(int dias) {
        int precio = 10;
        
        if (dias > 3) {
            int diasExtra = dias - 3;
            precio = (int) Math.rint(10.0 * Math.pow(1.1, diasExtra));
        }
        
        ingresoTotal += precio;
        return precio;
    }
    
    public int getIngresoTotal() {
        return ingresoTotal;
    }

}
