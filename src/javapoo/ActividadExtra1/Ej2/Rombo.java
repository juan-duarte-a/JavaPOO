package javapoo.ActividadExtra1.Ej2;

public class Rombo implements Figura {
    
    private final double diagonalMenor;
    private final double diagonalMayor;

    public Rombo(double diagonalMenor, double diagonalMayor) {
        this.diagonalMenor = diagonalMenor;
        this.diagonalMayor = diagonalMayor;
    }

    @Override
    public double calcularPerimetro() {
        return Math.sqrt(Math.pow(diagonalMenor, 2) + Math.pow(diagonalMayor, 2));
    }
    
    @Override
    public double calcularArea() {
        return diagonalMayor * diagonalMayor / 2;
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    public double getDiagonalMayor() {
        return diagonalMayor;
    }
    
}
