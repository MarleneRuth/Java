public class IncrementoPost {
    public static void main(String[] args) {
        int x = 5;
        int y = x++;
        System.out.println("Después de 'int y = x++;':");
        System.out.println("x = " + x);  
        System.out.println("y = " + y);  
        int a = 10;
        System.out.println("\nImprimiendo 'a++': " + a++);  
        System.out.println("Valor de 'a' después: " + a);  
        int b = 1;
        int c = b++ + b++;
        System.out.println("\nDespués de 'int c = b++ + b++;':");
        System.out.println("b = " + b); 
        System.out.println("c = " + c);  
    }
}