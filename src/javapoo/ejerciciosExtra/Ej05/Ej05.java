package javapoo.ejerciciosExtra.Ej05;

import java.util.Scanner;

public class Ej05 {
    
    private static String[] meses;
    private static String mesSecreto;
    private static Scanner sc;
    
    public static void main(String[] args) {
        sc = new Scanner(System.in).useDelimiter("\n");
        inicializarMeses();
        actualizarMesSecreto();
        juego();
    }
    
    private static void juego() {
        String mes;
        
        do {
            System.out.println("Adivina el mes secreto:");
            mes = sc.next();
            
            if (mes.equals(mesSecreto)) {
                System.out.println("¡Has adivinado!");
                break;
            } else {
                System.out.println("Intenta nuevamente.");
            }
        } while (!mes.equals(""));
    }
    
    public static void inicializarMeses() {
        meses = new String [] {
            "enero",
            "febrero",
            "marzo",
            "abril",
            "mayo",
            "junio",
            "julio",
            "agosto",
            "septiembre",
            "octubre",
            "noviembre",
            "diciembre"
        };
    }
    
    private static void actualizarMesSecreto() {
        mesSecreto = meses[(int) (Math.random() * 12)];
    }
            
}
