import java.util.Scanner;
public class SistemaPrestamoLibros {
    public static void main(String[] args) {
        System.out.println("*** Sistema de prestamo de libros ***");
        /*
        Se pide crear un sistema para una bibloteca, la cual desea prestar libros si cumple con cualquiera 
        de las siguientes condiciones: 
        1. El usuario tiene credencial de estudiante 
        2.El usuario vive a no mas de 3 km de la redonda 
        Si cumple con cualquiera de estas condiciones se le puede prestar el libro
        */

        final var DISTANCIA_PERMITIDA_KM = 3;   
        var consola = new Scanner(System.in);

        System.out.print("Cuentas con credencial de estudiante (true/false): ");
        var tienesCredencial = Boolean.parseBoolean(consola.nextLine());

        System.out.print("A cuantos km vives de la bibloteca: ");
        var distanciaBiblotecaKm = Integer.parseInt(consola.nextLine());

        var esElegiblePrestamo = tienesCredencial || distanciaBiblotecaKm <= DISTANCIA_PERMITIDA_KM;
        System.out.println("Eres elegible para el prestamo de libros: " + esElegiblePrestamo );

    }
}
