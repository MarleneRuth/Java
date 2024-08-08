public class Gravedad {
    private static final double GRAVEDAD_UNIVERSAL = 6.67430e-11; // m^3 kg^-1 s^-2

    public static void main(String[] args) {
        double masa = 70.0; // Masa en kilogramos

        // Calcular el peso en diferentes planetas
        double pesoEnMercurio = Planeta.MERCURIO.calcularPeso(masa);
        double pesoEnVenus = Planeta.VENUS.calcularPeso(masa);
        double pesoEnTierra = Planeta.TIERRA.calcularPeso(masa);

        // Mostrar los resultados
        System.out.println("El peso en Mercurio para una masa de " + masa + " kg es " + pesoEnMercurio + " N");
        System.out.println("El peso en Venus para una masa de " + masa + " kg es " + pesoEnVenus + " N");
        System.out.println("El peso en la Tierra para una masa de " + masa + " kg es " + pesoEnTierra + " N");
    }

    enum Planeta {
        MERCURIO(3.303e+23, 2.4397e6), // Masa en kg, radio en metros
        VENUS(4.869e+24, 6.0518e6),
        TIERRA(5.976e+24, 6.37814e6);

        private final double masa; // Masa del planeta en kg
        private final double radio; // Radio del planeta en metros

        Planeta(double masa, double radio) {
            this.masa = masa;
            this.radio = radio;
        }

        public double calcularPeso(double masaObjetivo) {
            // Fórmula de la gravedad: F = G * (m1 * m2) / r^2
            return GRAVEDAD_UNIVERSAL * (masa * masaObjetivo) / (radio * radio);
        }

        @Override
        public String toString() {
            return name() + " [masa=" + masa + " kg, radio=" + radio + " m]";
        }
    }
}
