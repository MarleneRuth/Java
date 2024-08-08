public class Empleado {
    private String nombre;
    private int id;

    public Empleado(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public double calcularSalario() {
        return 0; // Método base
    }

    public void mostrarDetalles() {
        // Implementación base
    }
}
