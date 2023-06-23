package javapoo.ActividadExtra1.Ej2;

import java.util.Scanner;

public class Ej2 {
    
    private static Scanner sc;
    
    public static void main(String[] args) {
        sc = new Scanner(System.in).useDelimiter("\n");
        Figura figura = null;
        
        System.out.println("Elegir figura:\n");
        System.out.println("1. Triángulo");
        System.out.println("2. Rombo");
        System.out.println("3. Cuadrado");
        System.out.println("4. Rectángulo");
        System.out.println("5. Pentágono");
        System.out.println("6. Hexágono");
        System.out.println("7. Círculo");
        System.out.println("");
        
        String opcion = sc.next();
        
        switch (opcion) {
            case "1": figura = crearTriangulo();
                break;
            case "2": figura = crearRombo();
                break;
            case "3": figura = crearCuadrado();
                break;
            case "4": figura = crearRectangulo();
                break;
            case "5": figura = crearPentagono();
                break;
            case "6": figura = crearHexagono();
                break;
            case "7": figura = crearCirculo();
                break;
            default: System.out.println("Opción incorrecta.");
        }
        
        if (figura != null) {
            System.out.println("\nPerímetro: " + figura.calcularPerimetro());
            System.out.println("Área: " + figura.calcularArea());
        }
    }
    
    private static Cuadrado crearCuadrado() {
        System.out.println("Ingresar lado:");
        double lado = sc.nextDouble();

        return new Cuadrado(lado);
    }
    
    private static Rectangulo crearRectangulo() {
        System.out.println("Ingresar alto:");
        double alto = sc.nextDouble();
        System.out.println("Ingresar ancho:");
        double ancho = sc.nextDouble();

        return new Rectangulo(alto, ancho);
    }
    
    private static Triangulo crearTriangulo() {
        System.out.println("Ingresar lado 1:");
        double lado1 = sc.nextDouble();
        System.out.println("Ingresar lado 2:");
        double lado2 = sc.nextDouble();
        System.out.println("Ingresar lado 3:");
        double lado3 = sc.nextDouble();

        return new Triangulo(lado1, lado2, lado3);
    }
    
    private static Circulo crearCirculo() {
        System.out.println("Ingresar radio:");
        double radio = sc.nextDouble();

        return new Circulo(radio);
    }
    
    private static Rombo crearRombo() {
        System.out.println("Ingresar diagonal menor:");
        double diagonalMenor = sc.nextDouble();
        System.out.println("Ingresar diagonal mayor:");
        double diagonalMayor = sc.nextDouble();

        return new Rombo(diagonalMenor, diagonalMayor);
    }
    
    private static Pentagono crearPentagono() {
        System.out.println("Ingresar lado:");
        double lado = sc.nextDouble();
        
        return new Pentagono(lado);
    }
    
    private static Hexagono crearHexagono() {
        System.out.println("Ingresar lado:");
        double lado = sc.nextDouble();
        
        return new Hexagono(lado);
    }
    
}
