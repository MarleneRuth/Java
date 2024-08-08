import java.util.Scanner;

public class ConversionStringAInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingrese su edad: ");
        String edadComoString = scanner.nextLine();

        try {

            int edad = Integer.parseInt(edadComoString);

            if (edad >= 18) {
                System.out.println("Eres mayor de edad.");
            } else {
                System.out.println("Eres menor de edad.");
            }

            int añosHasta100 = 100 - edad;
            System.out.println("Te faltan " + añosHasta100 + " años para llegar a 100.");

        } catch (NumberFormatException e) {
            System.out.println("Error: Por favor, ingrese un número válido.");
        }

        scanner.close();
    }
}

