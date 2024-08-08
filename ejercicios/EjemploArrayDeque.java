import java.util.ArrayDeque;
import java.util.ArrayDeque;
import java.util.Deque;

public class EjemploArrayDeque {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        deque.offer("Primero");
        deque.offer("Segundo");
        deque.offer("Tercero");

        System.out.println("Deque inicial: " + deque);

        deque.offerFirst("Nuevo Primero");
        System.out.println("Después de offerFirst: " + deque);

        deque.offerLast("Nuevo Último");
        System.out.println("Después de offerLast: " + deque);

        String primero = deque.peekFirst();
        System.out.println("Primer elemento (sin eliminar): " + primero);

        String eliminadoPrimero = deque.pollFirst();
        System.out.println("Elemento eliminado del principio: " + eliminadoPrimero);
        System.out.println("Deque después de pollFirst: " + deque);

        String eliminadoUltimo = deque.pollLast();
        System.out.println("Elemento eliminado del final: " + eliminadoUltimo);
        System.out.println("Deque después de pollLast: " + deque);

        deque.push("Elemento de Pila");
        System.out.println("Después de push: " + deque);

        String elementoPila = deque.pop();
        System.out.println("Elemento extraído (pop): " + elementoPila);
        System.out.println("Deque después de pop: " + deque);

        System.out.println("Iterando sobre los elementos:");
        for (String elemento : deque) {
            System.out.println(elemento);
        }
    }
}