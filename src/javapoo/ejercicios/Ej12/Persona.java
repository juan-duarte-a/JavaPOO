package javapoo.ejercicios.Ej12;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    
    private LocalDate fechaDeNacimiento;
    private String nombre;

    public Persona(String nombre, int año, int mes, int dia) {
        this.nombre = nombre;
        this.fechaDeNacimiento = LocalDate.of(año, mes, dia);
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int calcularEdad() {
        return Period.between(fechaDeNacimiento, LocalDate.now()).getYears();
    }
    
    public boolean menorQue(int edad) {
        return fechaDeNacimiento.getYear() < edad;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + ". Edad: " + calcularEdad() + " años.";
    }
    
}
