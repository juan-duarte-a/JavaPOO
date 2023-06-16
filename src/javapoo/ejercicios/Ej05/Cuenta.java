package javapoo.ejercicios.Ej05;

public class Cuenta {
    
    private final int numeroCuenta;
    private long DNI;
    private double saldo;

    public Cuenta(long DNI, double saldo) {
        this.numeroCuenta = this.hashCode();
        this.DNI = DNI;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void ingresar(double cantidad) {
        saldo += cantidad;
    }
    
    public void retirar(double cantidad) {
        saldo = Math.max(0, saldo - cantidad);
    }
    
    public void extraccionRapida() {
        saldo -= saldo * 0.2;
    }
    
    public String consultarDatos() {
        return "Número de cuenta: " + numeroCuenta
                + "%nDNI: " + DNI
                + "%nSaldo: " + String.format("$%,.2f", saldo)
                + "%n";
    }
    
}
