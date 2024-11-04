package RepasoJava.Metodos.InterfacesFuncionales;

/*
5. BiFunction<T, U, R>
Propósito: Acepta dos valores, uno de tipo T y otro de tipo U, y devuelve un valor de tipo R.
Uso típico: Realizar operaciones que requieren dos entradas, como sumar dos números.
Ejemplo:
Suma dos números enteros.
*/

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        System.out.println("Suma: " + add.apply(5, 3)); // Output: Suma: 8
    }
}

//Aquí, add es un BiFunction<Integer, Integer, Integer> que toma dos Integer y devuelve su suma. apply invoca esta función.
