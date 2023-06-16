package javapoo.ejercicios.Ej07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej07 {
    
    private static Scanner sc;
    
    public static void main(String[] args) {
         sc = new Scanner(System.in).useDelimiter("\n");
         List<Persona> personas = new ArrayList<>();
         
         personas.add(new Persona("Juan", 17, 60, 1.73, Persona.Sexo.HOMBRE));
         personas.add(new Persona("Angélica", 33, 55, 1.62, Persona.Sexo.MUJER));
         personas.add(new Persona("Laura", 14, 73, 1.66, Persona.Sexo.MUJER));
         personas.add(new Persona("Arturo", 37, 91, 1.68, Persona.Sexo.HOMBRE));
         
         
    }
    
    public static Persona crearPersona() {
        System.out.println("Ingresar nombre:");
        String nombre = sc.next();
        System.out.println("Ingresar edad:");
        int edad = sc.nextInt();
        System.out.println("Ingresar peso:");
        double peso = sc.nextDouble();
        System.out.println("Ingresar altura:");
        double altura = sc.nextDouble();
        System.out.println("Ingresar sexo (H/M/O):");
        String sexo = sc.next();
        
        Persona.Sexo s = sexo.equalsIgnoreCase("h") ? Persona.Sexo.HOMBRE
                : sexo.equalsIgnoreCase("m") ? Persona.Sexo.MUJER
                : Persona.Sexo.OTRO;
        
        return new Persona(nombre, edad, peso, altura, s);
    }
}
