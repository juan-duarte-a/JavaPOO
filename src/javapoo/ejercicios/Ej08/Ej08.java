package javapoo.ejercicios.Ej08;

public class Ej08 {
    
    public static void main(String[] args) {
        Cadena cadena = new Cadena("Hola mundooo.");
        
        System.out.println("Frase: " + cadena.getFrase());
        System.out.println("Contar vocales: " + cadena.contarVocales());
        System.out.println("Invertir frase: " + cadena.invertirFrase());
        System.out.println("Veces repetido 'o': " + cadena.vecesRepetido("o"));
        System.out.println("Comparar longitud 'Hola mundo': " + cadena.compararLongitud("Hola mundo"));
        System.out.println("Unir frases: " + cadena.unirFrases(" Nuevamente."));
        System.out.println("Reemplazar 'o' por '-': " + cadena.reemplazar("o", "-"));
        System.out.println("Contiene '.': " + cadena.contiene("."));
    }
}
