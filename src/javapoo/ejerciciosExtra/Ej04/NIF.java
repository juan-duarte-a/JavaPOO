package javapoo.ejerciciosExtra.Ej04;

public class NIF {
    
    private long DNI;
    private String letra;
    private final String letras;
    
    public NIF(long DNI) {
        this.DNI = DNI;
        letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        actualizarLetra();
    }
    
    public String mostrar() {
        return String.valueOf(DNI) + "-" + letra;
    }
    
    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
        actualizarLetra();
    }

    public String getLetra() {
        return letra;
    }
    
    private void actualizarLetra() {
        letra = String.valueOf(letras.charAt((int) (DNI % 23)));
    }
    
}
