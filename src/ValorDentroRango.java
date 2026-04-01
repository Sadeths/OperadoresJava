
import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        /*
            Realizar un programa para saber si el valor proporcionado se encuentra dentro de un rango definido
            - - - - - - - - - - - - - - - - - - - - - - - - - 
            -3       0           2             5           6
            Fuera    Valor       Valor        Valor final   Fuera rango 
                   Inicial 
            rango
                        Rango entre 0 y 5
         */
        System.out.println("*** Valor Dentro Rango ***");
        //Definimos los limites
        final var MINIMO = 0;
        final var MAXIMO = 5;

        //Solicitar un valor entre 0 y 5
        System.out.print("Proporciona un dato entre 0 y 5: ");
        var dato = Integer.parseInt(new Scanner(System.in).nextLine());
        //Verifcar si el dato esta dentro de rango
        var estaDentroRango = dato >= MINIMO && dato <= MAXIMO;
        System.out.println("Esta dentro del rango: " + estaDentroRango);


    }
}
