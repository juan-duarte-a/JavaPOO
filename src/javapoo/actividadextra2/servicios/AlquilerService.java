package javapoo.actividadextra2.servicios;

import java.time.LocalDate;
import java.util.Scanner;
import javapoo.actividadextra2.entidades.Alquiler;
import javapoo.actividadextra2.entidades.Pelicula;

public class AlquilerService {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Alquiler crearAlquiler(Pelicula pelicula) {
        LocalDate fechaDeInicio = DateService.solicitarFecha(
                "Ingresar fecha de alquiler (aaaa-mm-dd):");
        
        System.out.println("Ingresar número de días de alquiler:");
        int dias = sc.nextInt();
        LocalDate fechaDeFin = fechaDeInicio.plusDays(dias);
        
        int precio = calcularPrecio(dias);
        pelicula.setAlquilada(true);
        
        return new Alquiler(pelicula, fechaDeInicio, fechaDeFin, precio);
    }
    
    private int calcularPrecio(int dias) {
        int precio = 10;
        
        if (dias > 3) {
            int diasExtra = dias - 3;
            precio *= Math.rint(Math.pow(1.1, diasExtra));
        }
        
        return precio;
    }
    
}
