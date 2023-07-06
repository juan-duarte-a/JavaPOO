package javapoo.ejercicios.Ej14;

import java.util.Arrays;

public class Movil {
    
    private String marca;
    private String modelo;
    private int precio;
    private int memoriaRAM;
    private int almacenamiento;
    private int[] codigo;

    public Movil(String marca, String modelo, int precio, int memoriaRAM, int almacenamiento) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.memoriaRAM = memoriaRAM;
        this.almacenamiento = almacenamiento;
        codigo = new int[7];
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public String toString() {
        return marca + " " + modelo + " - " + Arrays.toString(codigo);
    }
    
}
