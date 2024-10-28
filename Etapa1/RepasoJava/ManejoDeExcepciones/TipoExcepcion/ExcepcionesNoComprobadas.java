package RepasoJava.ManejoDeExcepciones.TipoExcepcion;

import java.util.Arrays;

/*
    Excepciones no comprobadas: también conocidas como excepciones en tiempo de ejecución, estas excepciones no requieren control explícito y no son comprobadas por el compilador. 
    Entre los ejemplos se incluyen NullPointerException, ArrayIndexOutOfBoundsException y ArithmeticException.
 */

public class ExcepcionesNoComprobadas {
    
    public static void main(String[] args) {
        int[] listaDeEnteros = new int[]{1,2,3};

        Arrays.stream(listaDeEnteros).forEach((num)->System.out.println(num));
        
        System.out.println(listaDeEnteros[3]); //dará excepcion en tiempo de ejecucion
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3


        int a = 4, b = 0;

        @SuppressWarnings("unused")
        double result = a/b; //dará un excepcion en tiempo de ejecucion
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
    }
}
