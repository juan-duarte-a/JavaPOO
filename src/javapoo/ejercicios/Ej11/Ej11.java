package javapoo.ejercicios.Ej11;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ej11 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingresar día:");
        int dia = sc.nextInt();
        System.out.println("Ingresar mes:");
        int mes = sc.nextInt();
        System.out.println("Ingresar año:");
        int año = sc.nextInt();
        
        LocalDate fecha = LocalDate.of(año, mes, dia);
        
        Period p = Period.between(fecha, LocalDate.now());
        System.out.println("Años de diferencia entre " + fecha + " y " + LocalDate.now()
                + ": " + p.getYears());
    }
    
}
