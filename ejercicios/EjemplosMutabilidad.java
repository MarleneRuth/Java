public class EjemplosMutabilidad {
    public static void main(String[] args) {
        final String nombreInmutable = "Alice";
        System.out.println("Nombre original: " + nombreInmutable);
        final StringBuilder nombreMutable = new StringBuilder("Charlie");
        System.out.println("Nombre original: " + nombreMutable);
        
        nombreMutable.append(" Brown");
        System.out.println("Nombre modificado: " + nombreMutable);

    
        final int[] numeros = {1, 2, 3};
        System.out.println("Array original: " + java.util.Arrays.toString(numeros));
        
        numeros[0] = 10;
        System.out.println("Array modificado: " + java.util.Arrays.toString(numeros));

    }
}

