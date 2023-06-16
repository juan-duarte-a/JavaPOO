package javapoo.ejercicios.Ej07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej07 {

    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in).useDelimiter("\n");
        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Juan", 17, 50, 1.73, Persona.Sexo.HOMBRE));
        personas.add(new Persona("Angélica", 33, 55, 1.62, Persona.Sexo.MUJER));
        personas.add(new Persona("Laura", 19, 73, 1.66, Persona.Sexo.MUJER));
        personas.add(new Persona("Arturo", 37, 91, 1.68, Persona.Sexo.HOMBRE));

        personas.stream().forEach(persona -> {
            System.out.println(persona.toString());
            System.out.println("¿Es mayor de edad? " + (persona.esMayorDeEdad() ? "Sí." : "No."));
            System.out.println("Índice de masa corporal: "
                    + (persona.calcularIMC() == -1 ? "peso por debajo de lo ideal."
                    : persona.calcularIMC() == 0 ? "peso ideal."
                    : "con sobrepeso."));
            System.out.println();
        });

        int porcentajeMayoresDeEdad = (int) (100 * personas.stream()
                .filter(persona -> persona.esMayorDeEdad()).count() / personas.size());

        System.out.println("Porcentaje de personas mayores de edad: " + porcentajeMayoresDeEdad + "%");
        System.out.println("Porcentaje de personas menores de edad: " + (100 - porcentajeMayoresDeEdad) + "%");

        int porcentajeBajoPeso = (int) (100 * personas.stream()
                .filter(persona -> persona.calcularIMC() == -1).count() / personas.size());

        int porcentajeSobrepeso = (int) (100 * personas.stream()
                .filter(persona -> persona.calcularIMC() == 1).count() / personas.size());

        System.out.println("Porcentaje de personas con bajo peso: " + porcentajeBajoPeso + "%");
        System.out.println("Porcentaje de personas con peso ideal: " 
                + (100 - (porcentajeBajoPeso + porcentajeSobrepeso)) + "%");
        System.out.println("Porcentaje de personas con sobrepeso: " + porcentajeSobrepeso + "%");
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
