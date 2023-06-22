package javapoo.ejercicios.Ej08;

public class Cadena {
    
    private int longitud;
    private String frase;
    
    public Cadena(String frase) {
        setFrase(frase);
    }
    
    public final void setFrase(String frase) {
        this.frase = frase;
        longitud = frase.length();
    }

    public int getLongitud() {
        return longitud;
    }

    public String getFrase() {
        return frase;
    }
    
    public int contarVocales() {
        return (int) frase.chars().filter(ch -> {
            char c = Character.toLowerCase((char) ch);
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
        }).count();
    }
    
    public String invertirFrase() {
        return new StringBuilder(frase).reverse().toString();
    }
    
    public int vecesRepetido(String caracter) {
        return (int) frase.chars().filter(c -> c == caracter.charAt(0)).count();
    }
    
    public int compararLongitud(String texto) {
        return frase.length() - texto.length();
    }
    
    public String unirFrases(String otraFrase) {
        return frase.concat(otraFrase);
    }
    
    public String reemplazar(String letra, String nuevaLetra) {
        return frase.replace(letra, nuevaLetra);
    }
    
    public boolean contiene(String texto) {
        return frase.contains(texto);
    }
}
