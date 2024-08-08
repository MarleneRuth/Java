public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[4];
        figuras[0] = new Circulo(5);
        figuras[1] = new Rectangulo(4, 6);
        figuras[2] = new Triangulo(3, 4);
        figuras[3] = new Hexagono(2);

        for (figura figura : figuras) {
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
            if (figura instanceof Dibujable) {
                ((Dibujable) figura).dibujar();
            }
            System.out.println();
        }

        GrupoFiguras grupo = new GrupoFiguras();
        for (figura figura : figuras) {
            grupo.agregarFigura(figura);
        }
        System.out.println("Área total del grupo: " + grupo.calcularAreaTotal());
    }
}