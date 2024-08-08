public class EmpleadoPorContrato extends Empleado implements Evaluable {
    private double tarifaPorHora;
    private int horasTrabajadas;

    public EmpleadoPorContrato(String nombre, int id, double tarifaPorHora, int horasTrabajadas) {
        super(nombre, id);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return tarifaPorHora * horasTrabajadas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.printf("Empleado Por Contrato - Nombre: %s, ID: %d, Salario: %.2f%n", getNombre(), getId(), calcularSalario());
    }

    @Override
    public double evaluarDesempeño() {
        // Implementación simple: si trabaja más de 160 horas, se considera buen desempeño
        return horasTrabajadas > 160 ? 1.0 : 0.5;
    }
}
