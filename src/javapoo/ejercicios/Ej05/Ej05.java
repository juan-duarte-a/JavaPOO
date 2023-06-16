package javapoo.ejercicios.Ej05;

import java.util.Scanner;

public class Ej05 {
    
    private static Scanner sc;
    
    public static void main(String[] args) {
         sc = new Scanner(System.in).useDelimiter("\n");
         
         System.out.println("Ingresar DNI:");
         long DNI = sc.nextLong();
         System.out.println("Ingresar saldo:");
         int saldo = sc.nextInt();
         
         Cuenta cuenta = new Cuenta(DNI, saldo);
         cuenta.ingresar(200000);
         cuenta.extraccionRapida();
         System.out.printf(cuenta.consultarDatos());
    }

}
