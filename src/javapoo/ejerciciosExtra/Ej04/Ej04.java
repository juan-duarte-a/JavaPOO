package javapoo.ejerciciosExtra.Ej04;

public class Ej04 {
    
    public static void main(String[] args) {
        NIF nif = new NIF(1055490345);
        System.out.println(nif.mostrar());
        nif.setDNI(4638921945L);
        System.out.println(nif.mostrar());
        nif.setDNI(1280186938);
        System.out.println(nif.mostrar());
    }
    
}
