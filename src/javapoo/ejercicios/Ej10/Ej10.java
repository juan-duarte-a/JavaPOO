package javapoo.ejercicios.Ej10;

import java.util.Arrays;

public class Ej10 {
    
    public static void main(String[] args) {
        double[] A = new double[50];
        double[] B = new double[20];

        Arrays.setAll(A, i -> Math.rint(Math.random() * 100) / 10);
        System.out.println("Arreglo A:");
        System.out.println(Arrays.toString(A) + "\n");
        
        Arrays.sort(A);
        System.out.println("Arreglo A ordenado:");
        System.out.println(Arrays.toString(A) + "\n");
        
        Arrays.fill(B, 10, 20, 0.5);
        System.arraycopy(A, 0, B, 0, 10);
        System.out.println("Arreglo B:");
        System.out.println(Arrays.toString(B));
    }
    
}
