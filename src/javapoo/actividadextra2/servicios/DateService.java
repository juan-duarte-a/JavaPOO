package javapoo.actividadextra2.servicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateService {
    
    public static boolean fechaValida(String fecha) {
        try {
            LocalDate.parse(fecha, DateTimeFormatter.ISO_LOCAL_DATE);
        } catch (DateTimeParseException e) {
            return false;
        }
        
        return true;
    }
    
    public static LocalDate solicitarFecha(String texto) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        do {
            System.out.println(texto);
            String fecha = sc.next();
            
            if (!DateService.fechaValida(fecha)) {
                System.err.println("Fecha incorrecta.");
            }
            else {
                return LocalDate.parse(fecha, DateTimeFormatter.ISO_LOCAL_DATE);
            }
        } while (true);
    }
    
}
