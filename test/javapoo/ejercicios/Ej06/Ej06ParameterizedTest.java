package javapoo.ejercicios.Ej06;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Ej06ParameterizedTest {
    private final int cantidad;
    private final int cantidadActual;
    private Cafetera cafetera;
    
    public Ej06ParameterizedTest(int cantidad, int cantidadActual) {
        this.cantidad = cantidad;
        this.cantidadActual = cantidadActual;
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        cafetera = new Cafetera(800, 450);
    }
    
    @After
    public void tearDown() {
    }

    @Parameters(name = "valoresDePrueba")
    public static Object[] valoresDePrueba() {
        return new Object[] {
            new Object[] {  0, 450},
            new Object[] {150, 300},
            new Object[] {100, 350},
            new Object[] {400,  50},
            new Object[] {450,   0},
            new Object[] {500,   0}
        };
    }

    @Test
    public void servirTazaParameterized() {
        cafetera.servirTaza(cantidad);
        assertEquals("La cantidad actual debería ser " 
                + cantidadActual, cantidadActual, cafetera.getCantidadActual());
    }
    
}
