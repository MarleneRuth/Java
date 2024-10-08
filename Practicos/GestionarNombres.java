import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GestionarNombres {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<String> nombres = new ArrayList<>();
            System.out.print("¿Cuántos nombres desea ingresar? ");
            int cantidadNombres = scanner.nextInt();
            scanner.nextLine(); 
            for (int i = 0; i < cantidadNombres; i++) {
                System.out.print("Ingrese el nombre " + (i + 1) + ": ");
                nombres.add(scanner.nextLine());
            }

            while (true) {
                System.out.println("\nOpciones:");
                System.out.println("1. Ordenar y mostrar nombres");
                System.out.println("2. Buscar un nombre");
                System.out.println("3. Eliminar un nombre");
                System.out.println("4. Encontrar el nombre más largo");
                System.out.println("5. Salir");
                System.out.print("Elija una opción: ");

                int opcion = scanner.nextInt();
                scanner.nextLine(); 

                switch (opcion) {
                    case 1:

                        nombres.sort(String::compareTo);
                        System.out.println("Nombres ordenados: " + nombres);
                        break;
                    case 2:
                    
                        System.out.print("Ingrese un nombre a buscar: ");
                        String buscar = scanner.nextLine();
                        int indice = nombres.indexOf(buscar);
                        if (indice >= 0) {
                            System.out.println(buscar + " está en la posición " + (indice + 1));
                        } else {
                            System.out.println(buscar + " no está en la lista");
                        }
                        break;
                    case 3:
                        
                        System.out.print("Ingrese el nombre a eliminar: ");
                        String eliminar = scanner.nextLine();
                        if (nombres.remove(eliminar)) {
                            System.out.println(eliminar + " ha sido eliminado de la lista");
                        } else {
                            System.out.println(eliminar + " no se encontró en la lista");
                        }
                        break;
                    case 4:
                        
                        String nombreMasLargo = encontrarNombreMasLargo(nombres);
                        System.out.println("El nombre más largo es: " + nombreMasLargo);
                        break;
                    case 5:
                        System.out.println("Gracias por usar el programa.");
                        return;
                    default:
                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                }
            }
        }
    }

    private static String encontrarNombreMasLargo(ArrayList<String> nombres) {
        return nombres.stream()
                .max((a, b) -> Integer.compare(a.length(), b.length()))
                .orElse("");
    }
}