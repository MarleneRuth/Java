public class IncrementoPostfijo {
    public static void main(String[] args) {
        int x = 5;
        int y = x++;
        System.out.println("Después de 'int y = x++;':");
        System.out.println("x = " + x);  // Imprime 6
        System.out.println("y = " + y);  // Imprime 5

        int a = 10;
        System.out.println("\nImprimiendo 'a++': " + a++);  // Imprime 10
        System.out.println("Valor de 'a' después: " + a);   // Imprime 11

        int b = 1;
        int c = b++ + b++;
        System.out.println("\nDespués de 'int c = b++ + b++;':");
        System.out.println("b = " + b);  // Imprime 3
        System.out.println("c = " + c);  // Imprime 3 (1 + 2)
    }
}

