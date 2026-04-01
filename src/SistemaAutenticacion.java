
import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("***Sistema de Autenticacion ***");
        /*
        Crea un programa para validar el usuario y password proporcionados por el usuario
        Crea 2 constantes con los valores correctos y posteriormente compara que el usuario 
        y password proporcionados por el usuario sean validos 
        Debe solicitar el usuario y el password al usuario y si son iguales que los valores 
        correctos almacenados en las constantres debe imprimir true , de lo contario debe imprimir 
        false
         */

        //Declaramos las constantes 
        final var USUARIO = "admin";
        final var PASSWORD = "1234";

        var consola = new Scanner(System.in);

        //Se imprimen las consultas al usuario
        System.out.print("Cual es tu usuario: ");
        var usuario = consola.nextLine();
        System.out.print("Cual es tu password: ");
        var password = consola.nextLine();

        //Se agrega una nueva variable para ver si los datos son correctos
        var datosCorrectos = usuario.equals(USUARIO) && password.equals(PASSWORD);
        
        //Se envia el mensaje del usuario que fue autenticado 
        System.out.println("Los datos son correctos: " + datosCorrectos);






    }
}
