package javapoo.ejercicios.Ej14;

import java.util.Scanner;
import java.util.stream.Stream;

public class Ej14 {
    
    private static Scanner sc;
    
    public static void main(String[] args) {
        sc = new Scanner(System.in).useDelimiter("\n");
        Movil movil = cargarCelular();
        ingresarCodigo(movil);
        System.out.println(movil);
    }
    
    public static Movil cargarCelular() {
        System.out.println("Ingresar marca:");
        String marca = sc.next();
        System.out.println("Ingresar modelo:");
        String modelo = sc.next();
        System.out.println("Ingresar precio:");
        int precio = sc.nextInt();
        System.out.println("Ingresar RAM:");
        int memoriaRAM = sc.nextInt();
        System.out.println("Ingresar almacenamiento:");
        int almacenamiento = sc.nextInt();
        
        return new Movil(marca, modelo, precio, memoriaRAM, almacenamiento);
    }
    
    public static void ingresarCodigo(Movil movil) {
        System.out.println("Ingresar código:");
        String codigo = sc.next();
        if (codigo.length() > 7) codigo = codigo.substring(0, 7);
        movil.setCodigo(Stream.of(codigo).mapToInt(c -> Integer.valueOf(c)).toArray());
    }
    
}
