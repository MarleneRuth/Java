public class EjemploBooleanos {
    boolean estaActivo;

    public void imprimirEstado() {
        System.out.println("¿Está activo? " + estaActivo);
    }

    public void activar() {
        estaActivo = true;
    }

    public void ejemploVariableLocal() {
        boolean tienePermiso = false;
        System.out.println("¿Tiene permiso? " + tienePermiso);
        
        tienePermiso = true;
        System.out.println("¿Tiene permiso ahora? " + tienePermiso);
    }

    public static void main(String[] args) {
        EjemploBooleanos ejemplo = new EjemploBooleanos();

        System.out.println("Estado inicial:");
        ejemplo.imprimirEstado();

        ejemplo.activar();
        System.out.println("\nDespués de activar:");
        ejemplo.imprimirEstado();

        System.out.println("\nEjemplo con variable local:");
        ejemplo.ejemploVariableLocal();

        boolean[] estados = new boolean[3];
        System.out.println("\nValores iniciales del array de booleanos:");
        for (int i = 0; i < estados.length; i++) {
            System.out.println("Estado " + i + ": " + estados[i]);
        }

        estados[1] = true;
        System.out.println("\nDespués de cambiar el segundo elemento:");
        for (int i = 0; i < estados.length; i++) {
            System.out.println("Estado " + i + ": " + estados[i]);
        }
    }
}