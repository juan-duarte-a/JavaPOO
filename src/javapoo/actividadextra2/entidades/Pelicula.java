package javapoo.actividadextra2.entidades;

public class Pelicula {
    
    private String titulo;
    private String genero;
    private int año;
    private int duracion;
    private boolean alquilada;

    public Pelicula(String titulo, String genero, int año, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.año = año;
        this.duracion = duracion;
        this.alquilada = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isAlquilada() {
        return alquilada;
    }

    public void setAlquilada(boolean alquilada) {
        this.alquilada = alquilada;
    }
    
    @Override
    public String toString() {
        return titulo + ". " + año + ". " + genero + ". Duración: " + duracion + " minutos." 
                + (alquilada ? " Alquilada." : " Disponible.");
    }

}
