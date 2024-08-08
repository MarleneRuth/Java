public class Triangulo extends Figura implements Dibujable {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return 0.5 * base * altura;
    }

    @Override
    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt(base*base + altura*altura);
        return base + altura + hipotenusa;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un triángulo");
    }
}