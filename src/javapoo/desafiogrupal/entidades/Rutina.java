package javapoo.desafiogrupal.entidades;

public class Rutina {
    
    public enum NivelDificultad {Alta, Media, Baja};
    private int id;
    private String nombre;
    private int duracion;
    private NivelDificultad dificultad;
    private String descripcion;
    private static int idCount = 501;

    public Rutina(String nombre, int duracion, NivelDificultad dificultad, String descripcion) {
        this.id = idCount++;
        this.nombre = nombre;
        this.duracion = duracion;
        this.dificultad = dificultad;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public NivelDificultad getDificultad() {
        return dificultad;
    }

    public void setDificultad(NivelDificultad dificultad) {
        this.dificultad = dificultad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Override
    public String toString() {
        return "ID: " + id + ". " 
                + nombre + ". " 
                + "Dificultad: " + dificultad + ".";
    }
}
