package javapoo.ejerciciosExtra.Ej03;

import java.util.Arrays;

public class Ej03 {
    
    public static void main(String[] args) {
        Raices raices1 = new Raices(1, -5, 4);
        System.out.println(Arrays.toString(raices1.calcular()));
        
        Raices raices2 = new Raices(4, -12, 9);
        System.out.println(Arrays.toString(raices2.calcular()));
        
        Raices raices3 = new Raices(1, 0, 4);
        System.out.println(Arrays.toString(raices3.calcular()));
    }
    
}
