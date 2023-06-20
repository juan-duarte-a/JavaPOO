package javapoo.ejercicios.Ej06;

public class Cafetera {
    
    public final int CAPACIDAD_MAXIMA;
    
    private int cantidadActual;

    public Cafetera() {
        this.CAPACIDAD_MAXIMA = 1000;
    }

    public Cafetera(int CAPACIDAD_MAXIMA) throws IllegalArgumentException {
        if (CAPACIDAD_MAXIMA < 0) {
            throw new IllegalArgumentException("La capacidad máxima debe ser igual o mayor a cero.");
        }
        
        this.CAPACIDAD_MAXIMA = CAPACIDAD_MAXIMA;
        this.cantidadActual = 0;
    }

    public Cafetera(int CAPACIDAD_MAXIMA, int cantidadActual) throws IllegalArgumentException {
        this(CAPACIDAD_MAXIMA);
        
        if (cantidadActual > CAPACIDAD_MAXIMA) {
            throw new IllegalArgumentException("La capacidad actual "
                    + "no debe ser superior a la capacidad máxima.");
        }
        
        this.cantidadActual = cantidadActual;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public void llenarCafetera() {
        cantidadActual = CAPACIDAD_MAXIMA;
    }
    
    public void vaciarCafetera() {
        cantidadActual = 0;
    }
    
    public void agregarCafe(int cantidad) {
        cantidadActual = Math.min(cantidadActual + cantidad, CAPACIDAD_MAXIMA);
    }
    
    /**
     * Llena la taza de café con la cantidad solicitada.
     * Si la cantidad en la cafetera es menor a la cantidad solicitada la cafetera queda vacía.
     * 
     * @param cantidad Cantidad de café a servir en la taza.
     * @return <code>true</code> si la cantidad de café contenida en la cafetera es suficiente.
     *         <code>false</code> de lo contrario.
     */
    public boolean servirTaza(int cantidad) {
        boolean cantidadSuficiente = cantidad < cantidadActual;
        cantidadActual = Math.max(0, cantidadActual - cantidad);
        
        return cantidadSuficiente;
    }
    
}
