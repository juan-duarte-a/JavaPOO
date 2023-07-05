package javapoo.actividadextra2.entidades;

import java.time.LocalDate;

public class Alquiler {
    
    private Pelicula pelicula;
    private LocalDate fechaDeInicio;
    private LocalDate fechaDeFin;
    private int precio;

    public Alquiler(Pelicula pelicula, LocalDate fechaDeInicio, LocalDate fechaDeFin, int precio) {
        this.pelicula = pelicula;
        this.fechaDeInicio = fechaDeInicio;
        this.fechaDeFin = fechaDeFin;
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public LocalDate getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(LocalDate fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public LocalDate getFechaDeFin() {
        return fechaDeFin;
    }

    public void setFechaDeFin(LocalDate fechaDeFin) {
        this.fechaDeFin = fechaDeFin;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return pelicula.getTitulo() 
                + ". Fecha de alquiler: " + fechaDeInicio
                + ". Fecha de entrega: " + fechaDeFin
                + ". Precio: " + precio
                + ".";
    }
    
}
