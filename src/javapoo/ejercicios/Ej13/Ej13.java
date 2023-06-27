package javapoo.ejercicios.Ej13;

public class Ej13 {
    
    public static void main(String[] args) {
        Curso curso = new Curso("POO en Java", 3, 4, Curso.Turno.TARDE, 20);
        curso.setAlumnos(cargarAlumnos());
        System.out.println("Curso: " + curso);
        System.out.println("Ganancias por semana: " + curso.calcularGananciaSemanal());
    }
    
    public static String[] cargarAlumnos() {
        return new String[] {
            "Juan",
            "María",
            "Eduardo",
            "Ana",
            "Carlos"
        };
    }

}
