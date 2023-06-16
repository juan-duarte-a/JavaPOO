package javapoo.ejercicios.Ej01;

public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int paginas;

    public Libro() { }
    
    public Libro(String ISBN, String titulo, String autor, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Libro: " + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + '.';
    }

}
