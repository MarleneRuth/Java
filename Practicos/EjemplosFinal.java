public class EjemplosFinal {
 
    public static final int DIAS_SEMANA = 7;

    public static final String NOMBRE_EMPRESA = "Mi Empresa S.A.";

    public void ejemplosDeUso() {
 
        final double PI = 3.14159;

        System.out.println("Una semana tiene " + DIAS_SEMANA + " días.");
        System.out.println("El valor de PI es " + PI);

        System.out.println("Nombre de la empresa: " + NOMBRE_EMPRESA);

        final StringBuilder builder = new StringBuilder("Hola");
        builder.append(" Mundo"); 

        var mensaje = "Hola Mundo"; 
        System.out.println(mensaje);
    }

    public void metodoConParametroFinal(final int numero) {
        System.out.println("El número es: " + numero);
    }

    public static void main(String[] args) {
        EjemplosFinal ejemplo = new EjemplosFinal();
        ejemplo.ejemplosDeUso();
        ejemplo.metodoConParametroFinal(5);
    }
}
