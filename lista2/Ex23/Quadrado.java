package Ex23;

public class Quadrado extends FiguraGeometrica {
	private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return lado * lado;
    }

}
