
import java.util.Scanner;

public class SistemaDescuentosVIP {
    public static void main(String[] args) {
        System.out.println("*** Sistema de descuentos VIP ***");

        /*
        Una tienda de supermercado ofrece un descuento especial a clientes que compren 
        10 o mas articulos por dia y ademas sean miembros de la tienda
        El sistema debe solicitar al cliente que indique cuantos articulos ha comprado
        en el dia y preguntarle si cuenta con la membresia de la tienda
        En caso de haber comprado 10 o mas articulos y ser miembro de la tienda entonces
        tendra acceso al descuento VIP
         */

        final var NO_PRODUCTOS_DESCUENTO = 10;
        var consola = new Scanner(System.in);

        System.out.print("Cuantos productos compraste hoy: ");
        var cantidadProductos = Integer.parseInt(consola.nextLine());

        System.out.print("Tienes la membresia de la tienda (true/false): ");
        var tienesMembresia = Boolean.parseBoolean(consola.nextLine());

        var esElegibleDescuento = cantidadProductos >= NO_PRODUCTOS_DESCUENTO && tienesMembresia;

        System.out.println("Tienes acceso al descuento VIP: " + esElegibleDescuento);
    }
}
