package RepasoJava.Metodos.InterfacesFuncionales;

/*
3. Consumer<T>
Propósito: Acepta un valor de tipo T y realiza una operación sobre él, sin devolver nada.
Uso típico: Realizar operaciones que no necesitan devolver valores, como imprimir o almacenar información.
Ejemplo:
Imprime cada elemento de una lista.
*/

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Pedro", "Juan");

        //escribir cada variable
        Consumer<String> printName = System.out::println;

        //con cada texto del arreglo, usar el metodo printName
        names.forEach(printName);
        // Output:
        // Ana
        // Pedro
        // Juan
    }
}

//Aquí, printName es un Consumer<String> que toma un nombre y lo imprime. forEach aplica esta acción a cada elemento de la lista.
