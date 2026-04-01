public class PrecedenciaOperadores {
    public static void main(String[] args) {
        /*
        1. Parentesis y corchetes 
        2. Operadores unarios -,++,--
        3.Operadores aritmeticos *,/,%
        4.Operadores aritmeticos +,-
        5.Relacionales <,<=,>,>=
        6.Equivalencias ==, !=
        7.Logicos &&,||
        8.Asignacion =,+=,-=,*=, etc
         */

        //Expresion
        /*
        Paso1. Division 12/3 =4
        Paso2. Multiplicacion 2*3 = 6
        Paso3. Suma 4+6 = 10
        Paso4. Resta 10-1 = 9
         */
        var a = 12 / 3+2*3-1;
        System.out.println("a = " + a);
    }
}
