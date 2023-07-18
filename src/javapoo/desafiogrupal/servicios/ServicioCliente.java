package javapoo.desafiogrupal.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import javapoo.desafiogrupal.entidades.Cliente;

public class ServicioCliente {
    
    private final Scanner sc;
    private final List<Cliente> clientes;

    public ServicioCliente() {
        sc = new Scanner(System.in).useDelimiter("\n");
        clientes = new ArrayList<>();
    }
    
    public Cliente registrarCliente() {
        Properties datos = obtenerDatosCliente();
        
        Cliente cliente = new Cliente(
                datos.getProperty("nombre"), 
                Integer.parseInt(datos.getProperty("edad")), 
                Integer.parseInt(datos.getProperty("altura")), 
                Double.parseDouble(datos.getProperty("peso")), 
                datos.getProperty("objetivo"));
        
        agregarCliente(cliente);
        
        return cliente;
    }

public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public List<Cliente> obtenerClientes() {
        return clientes;
    }
    
    public void actualizarCliente(
            int id, String nombre, int edad, int altura, double peso, String objetivo) {
        
        Cliente cliente = buscarCliente(id);
        cliente.setId(id);
        cliente.setNombre(nombre);
        cliente.setEdad(edad);
        cliente.setAltura(altura);
        cliente.setPeso(peso);
        cliente.setObjetivo(objetivo);
    }
    
    public void eliminarCliente(int id) {
        clientes.remove(buscarCliente(id));
        System.out.println("Cliente eliminado.");
        System.out.println();
    }
    
    public Cliente buscarCliente(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id)
                return cliente;
        }

        System.err.println("Cliente no encontrado.");
        System.out.println();
        return null;
    }
    
    private Properties obtenerDatosCliente() {
        Properties datos = new Properties();
        
        System.out.println("Ingresar nombre:");
        String nombre = sc.next();
        System.out.println("Ingresar edad:");
        String edad = sc.next();
        System.out.println("Ingresar altura (cm):");
        String altura = sc.next();
        System.out.println("Ingresar peso (Kg):");
        String peso = sc.next();
        System.out.println("Ingresar objetivo:");
        String objetivo = sc.next();
        System.out.println();

        datos.setProperty("nombre", nombre);
        datos.setProperty("edad", edad);
        datos.setProperty("altura", altura);
        datos.setProperty("peso", peso);
        datos.setProperty("objetivo", objetivo);
        
        return datos;
    }
    
    public void actualizacionCliente(int id) {
        Properties datos = obtenerDatosCliente();
        
        Cliente cliente = buscarCliente(id);
        
        actualizarCliente(
                cliente.getId(), 
                datos.getProperty("nombre"), 
                Integer.parseInt(datos.getProperty("edad")), 
                Integer.parseInt(datos.getProperty("altura")), 
                Double.parseDouble(datos.getProperty("peso")), 
                datos.getProperty("objetivo"));
    }
    
}
