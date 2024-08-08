public class ComparacionStrings {
    public static void main(String[] args) {
 
        String str1 = "hola";
        String str2 = "hola";
        String str3 = new String("hola");

        System.out.println("Usando ==:");
        System.out.println("str1 == str2: " + (str1 == str2));       
        System.out.println("str1 == str3: " + (str1 == str3));       
        System.out.println("\nUsando .equals():");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); 
        System.out.println("str1.equals(str3): " + str1.equals(str3)); 

        String str4 = "Hola";
        System.out.println("\nComparando 'hola' con 'Hola':");
        System.out.println("str1 == str4: " + (str1 == str4));      
        System.out.println("str1.equals(str4): " + str1.equals(str4)); 
        System.out.println("str1.equalsIgnoreCase(str4): " + str1.equalsIgnoreCase(str4)); 
    }
}