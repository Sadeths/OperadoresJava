
import java.util.Scanner;

public class CalculoAreaRectangulo {
    public static void main(String[] args) {
        System.out.println("*** Calculo del Area de un Rectangulo ***");

        /*
        Se solicita calcular el area y perimeto de un rectangulo aplicando las siguientes
        formulas: 
        area = base * altura
        perimetro = 2 * (base + altura)
        */

        var consola = new Scanner(System.in);
        //Consultamos al usuario sobre la base y altura del rectangulo
        System.out.print("Cual es la base del rectangulo: ");
        var baseRectangulo = Integer.parseInt(consola.nextLine());
        System.out.print("Cual es la altura del rectangulo: ");
        var alturaRectangulo = Integer.parseInt(consola.nextLine());
        //Realizamos el calculo
        var areaRectangulo = baseRectangulo * alturaRectangulo;
        var perimetroRectangulo = 2 * (baseRectangulo + alturaRectangulo);
        //Imprimimos los resultados 
        System.out.printf("""
                Area: %d
                Perimetro: %d
                """,areaRectangulo, perimetroRectangulo);

    }
}
