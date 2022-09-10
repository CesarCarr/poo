package Ex23;

public class Circulo extends FiguraGeometrica {
	private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return Math.PI * (raio * raio);
    }
}
