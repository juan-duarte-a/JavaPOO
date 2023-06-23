package javapoo.ActividadExtra1.Ej1;

import static javapoo.ActividadExtra1.Ej1.Vehiculo.Tipo.*;
import java.util.ArrayList;
import java.util.List;

public class ActividadExtra1 {
    
    public static List<Vehiculo> vehiculos;
    
    public static void main(String[] args) {
        vehiculos = new ArrayList<>();
        
        vehiculos.add(new Vehiculo("Trek", "Domane", 2017, Bicicleta));
        vehiculos.add(new Vehiculo("Yamaha", "F150", 2020, Motocicleta));
        vehiculos.add(new Vehiculo("Ford", "Fiesta", 2011, Automóvil));
        
        moverVehiculos(5);
        moverVehiculos(10);
        moverVehiculos(60);
        
        moverYFrenarVehiculos(5*60);
    }
    
    private static void moverVehiculos(int tiempo) {
        System.out.println("Distancia tras " + tiempo + " segundos");
        
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo + " - Distancia: " + vehiculo.moverse(tiempo) + " metros");
        }
        
        System.out.println();
    }

    private static void moverYFrenarVehiculos(int tiempo) {
        System.out.println("Distancia tras " + tiempo + " segundos y frenado");
        
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo + " - Distancia: " + (vehiculo.moverse(tiempo) 
                    + vehiculo.frenar()) + " metros");
        }
        
        System.out.println();
    }

}
