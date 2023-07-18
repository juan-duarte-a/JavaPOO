package javapoo.desafiogrupal;

import java.util.Scanner;
import javapoo.desafiogrupal.entidades.Cliente;
import javapoo.desafiogrupal.entidades.Rutina;
import javapoo.desafiogrupal.servicios.ServicioCliente;
import javapoo.desafiogrupal.servicios.ServicioRutina;

public class Gimnasio {
    
    private static Scanner sc;
    private static ServicioCliente servicioCliente;
    private static ServicioRutina servicioRutina;
    
    public static void main(String[] args) {
        sc = new Scanner(System.in).useDelimiter("\n");
        servicioCliente = new ServicioCliente();
        servicioRutina = new ServicioRutina();
        boolean salir;
        
        agregarClientesIniciales();
        agregarRutinasIniciales();
        
        do {
            salir = mostrarMenu();
        } while (!salir);
    }
    
    private static boolean mostrarMenu() {
        System.out.println("OPCIONES");
        System.out.println("1.  Agregar cliente");
        System.out.println("2.  Agregar rutina");
        System.out.println("3.  Mostrar clientes");
        System.out.println("4.  Mostrar rutinas");
        System.out.println("5.  Buscar cliente por ID");
        System.out.println("6.  Buscar rutina por ID");
        System.out.println("7.  Eliminar cliente");
        System.out.println("8.  Eliminar rutina");
        System.out.println("9.  Actualizar cliente");
        System.out.println("10. Actualizar rutina");
        System.out.println("X.  Salir");
        System.out.println();
        System.out.print("Ingresar opción: ");
        
        String opcion = sc.next();
        System.out.println();
        
        switch (opcion.toUpperCase()) {
            case "1":
                servicioCliente.registrarCliente();
                break;
            case "2":
                servicioRutina.crearRutina();
                break;
            case "3":
                mostrarClientes();
                break;
            case "4":
                mostrarRutinas();
                break;
            case "5":
                buscarCliente();
                break;
            case "6":
                buscarRutina();
                break;
            case "7":
                eliminarCliente();
                break;
            case "8":
                eliminarRutina();
                break;
            case "9":
                actualizarCliente();
                break;
            case "10":
                actualizarRutina();
                break;
            case "X":
                return true;
            default:
                System.out.println("Opción incorrecta.\n");
        }
        
        return false;
    }
    
    private static void buscarCliente() {
        System.out.println("Ingresar ID del cliente:");
        int id = sc.nextInt();
        Cliente cliente = servicioCliente.buscarCliente(id);
        
        if (cliente != null)
            System.out.println(cliente + " Objetivo: " + cliente.getObjetivo() + "\n");
    }
    
    private static void buscarRutina() {
        System.out.println("Ingresar ID de la rutina:");
        int id = sc.nextInt();
        Rutina rutina = servicioRutina.buscarRutina(id);
        
        if (rutina != null)
            System.out.println(rutina + " " + rutina.getDescripcion() + "\n");
    }
    
    private static void eliminarCliente() {
        System.out.println("Ingresar ID del cliente:");
        int id = sc.nextInt();
        
        if (servicioCliente.buscarCliente(id) != null)
            servicioCliente.eliminarCliente(id);
    }
    
    private static void eliminarRutina() {
        System.out.println("Ingresar ID de la rutina:");
        int id = sc.nextInt();
        
        if (servicioRutina.buscarRutina(id) != null)
            servicioRutina.eliminarRutina(id);
    }
    
    public static void mostrarClientes() {
        System.out.println("Clientes:");
        servicioCliente.obtenerClientes().forEach(System.out::println);
        System.out.println();
    }
    
    public static void mostrarRutinas() {
        System.out.println("Rutinas:");
        servicioRutina.obtenerRutinas().forEach(System.out::println);
        System.out.println();
    }
    
    public static void actualizarCliente() {
        System.out.println("Ingresar ID del cliente:");
        int id = sc.nextInt();
        
        if (servicioCliente.buscarCliente(id) != null)
            servicioCliente.actualizacionCliente(id);
    }
    
    public static void actualizarRutina() {
        System.out.println("Ingresar ID de la rutina:");
        int id = sc.nextInt();
        
        if (servicioRutina.buscarRutina(id) != null)
            servicioRutina.actualizacionRutina(id);
    }
    
    private static void agregarClientesIniciales() {
        servicioCliente.agregarCliente(new Cliente(
                "Juan", 34, 173, 65.3, "Mejorar resistencia física"));
        servicioCliente.agregarCliente(new Cliente(
                "Milena", 33, 156, 58.0, "Tonificar"));
        servicioCliente.agregarCliente(new Cliente(
                "Laura", 31, 168, 87.1, "Bajar de peso"));
        servicioCliente.agregarCliente(new Cliente(
                "David", 27, 163, 62.8, "Aumentar masa muscular"));
        servicioCliente.agregarCliente(new Cliente(
                "Andrés", 40, 181, 71.9, "Mejorar rendimiento deportivo"));
    }
    
    private static void agregarRutinasIniciales() {
        servicioRutina.agregarRutina(new Rutina("Entrenamiento funcional", 
                40, Rutina.NivelDificultad.Media, 
                "Entrenamiento enfocado en mejorar resistencia, fuerza y coordinación"));
        servicioRutina.agregarRutina(new Rutina("Entrenamiento cardiovascular", 
                60, Rutina.NivelDificultad.Alta, 
                "Se enfoca en mejorar la resistencia cardiovascular y quemar grasa"));
        servicioRutina.agregarRutina(new Rutina("Rutina de yoga", 
                45, Rutina.NivelDificultad.Baja, 
                "Se enfoca en mejorar la flexibilidad y la relajación"));
        servicioRutina.agregarRutina(new Rutina("Rutina de alta intensidad", 
                20, Rutina.NivelDificultad.Alta, 
                "Entrenamiento enfocado en mejorar resistencia cardiovascular y quemar grasa"));
        servicioRutina.agregarRutina(new Rutina("Entrenamiento de fuerza", 
                30, Rutina.NivelDificultad.Media, 
                "Se enfoca en los músculos principales del cuerpo"));
    }
    
}
