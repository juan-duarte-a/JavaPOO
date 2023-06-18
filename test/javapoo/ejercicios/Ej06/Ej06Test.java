package javapoo.ejercicios.Ej06;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Ej06Test {
    private Cafetera cafetera;
    
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

    @Test
    public void constructor1Test() {
        cafetera = new Cafetera(750);
        assertEquals("Capacidad máxima debería ser 750.", 750, cafetera.CAPACIDAD_MAXIMA);
    }
    
    @Test
    public void constructor2Test() {
        assertEquals("Capacidad máxima debería ser 800.", 800, cafetera.CAPACIDAD_MAXIMA);
        assertEquals("Capacidad actual debería ser 450.", 450, cafetera.getCantidadActual());
    }
    
    @Test
    public void llenarCafeteraTest() {
        cafetera.llenarCafetera();
        assertEquals("La cantidad actual debería ser 800.", 800, cafetera.getCantidadActual());
    }
    
    @Test
    public void vaciarCafeteraTest() {
        cafetera.vaciarCafetera();
        assertEquals("La cantidad actual debería ser 0.", 0, cafetera.getCantidadActual());
    }
    
    @Test
    public void agregarCafe1Test() {
        cafetera.agregarCafe(210);
        assertEquals("La cantidad actual debería ser 0.", 660, cafetera.getCantidadActual());
    }
    
    @Test
    public void agregarCafe2Test() {
        cafetera.agregarCafe(600);
        assertEquals("La cantidad actual debería ser 800.", 800, cafetera.getCantidadActual());
    }
    
    @Test
    public void servirTaza1Test() {
        assertTrue("Debería dar true.", cafetera.servirTaza(220));
    }
    
    @Test
    public void servirTaza2Test() {
        assertFalse("Debería dar false.", cafetera.servirTaza(620));
    }
    
}
