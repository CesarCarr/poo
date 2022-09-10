package Ex23;

public class Triangulo extends FiguraGeometrica {
	private double base;
	private double altura;
	
	public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

	@Override
	public double calculaArea() {
		return base * altura / 2;
	}
}
