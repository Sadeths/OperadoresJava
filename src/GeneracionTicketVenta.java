
import java.util.Scanner;

public class GeneracionTicketVenta {
    public static void main(String[] args) {
        System.out.println("*** Generacion ticket de venta ***");

        /*
        Supongamos que compramos varios articulos en el supermercado y queremos obtener el ticket de venta
        total incluyendo los impuestos.
        El sistema solicitara el precio de cada producto a comprar y el usuario debera indicar su precio 
        (Valor de tipo con punto decimal)
        El sistema debe realizar la suma de cada producto, calcular el impuesto y finalmente imprimir el 
        total de la compra
         */

         var consola = new Scanner(System.in);

         System.out.print("Precio de leche: ");
         var precioLeche = Double.parseDouble(consola.nextLine());

         System.out.print("Precio pan: ");
         var precioPan = Double.parseDouble(consola.nextLine());

         System.out.print("Precio lechuga: ");
         var precioLechuga = Double.parseDouble(consola.nextLine());

         System.out.print("Precio platanos: ");
         var precioPlatanos = Double.parseDouble(consola.nextLine());

         System.out.print("Aplica algun descuento (%): ");
         var descuentoPorcentaje = Integer.parseInt(consola.nextLine());

         //Calculo del subtotal (sin impuestos)
         var subtotal = precioLeche + precioPan + precioLechuga + precioPlatanos;
        
         //Aplicar el descuento
         var descuento = subtotal * (descuentoPorcentaje/100.0);

         //Subtotal con descuento
         var subtotalConDescuento = subtotal- descuento;

         //Calculo con impuestos (12%)
         var impuesto = subtotalConDescuento * 0.12;

         //Calculo total de la compra (con impuestos)
         var costoTotalCompra = subtotalConDescuento + impuesto;

         //Imprimir el ticket de venta
         System.out.printf("""
                 %nTicket de Venta
                 -----------------
                 Subtotal: $%.2f
                 Descuento: $%.2f (%d%%)
                 Impuesto (12%%): $%.2f
                 Costo total de la compra: $%.2f
                 """,subtotal,descuento,descuentoPorcentaje,impuesto,costoTotalCompra);

    }
}
