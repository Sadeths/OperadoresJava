public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("*** Operadores Unarios ***");

        int a = 3, b = -2, resultado;
        var c = true;
        //Operador unario +
        resultado = +a;
        System.out.println("Operador unario +: " + resultado);
        
        //Operador unario -
        resultado = -a;
        System.out.println("Operador unario -: " + resultado);

        //Operadores unarios incremento/decremento
        //Pre-incremento
        a = 3;
        resultado = ++a; // primero se incrementa el valor
        System.out.println("Pre-incremento: " + resultado);
        System.out.println("a ya se incremento: " + a);
        
        //Post-incremento
        a = 3;
        resultado = a ++; // primero se asigna el valor y luego se incrementa
        System.out.println("Post-incremento a++: " + resultado);
        System.out.println("a se incrementa después de la asignación: " + a);

        //Pre-decremento
        b = -2;
        resultado = --b; // primero se decrementa el valor
        System.out.println("Pre-decremento: " + resultado);
        System.out.println("b ya se decremento: " + b);

        //Post-decremento
        b = -2;
        resultado = b --; // primero se asigna el valor y luego se decrementa
        System.out.println("Post-decremento b--: " + resultado);
        System.out.println("b se decrementa después de la asignación: " + b);
    }
}
