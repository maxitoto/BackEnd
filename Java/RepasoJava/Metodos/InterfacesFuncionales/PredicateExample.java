package RepasoJava.Metodos.InterfacesFuncionales;

/*
La interfaz funcional proporciona la estructura. Usted proporciona la semántica. Y debido a que es una interfaz funcional, puede usar las expresiones lambda de Java como implementaciones, y eso le brinda mucha flexibilidad en cómo se pueden usar. 
*/

/*
1. Predicate<T>
    Propósito: Evalúa un valor de tipo T y devuelve true o false.
    Uso típico: Filtrar elementos en una colección o validar condiciones.

Ejemplo:
Imagina que quieres filtrar una lista de números para quedarte solo con los pares.
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        Predicate<Integer> isEven = n -> n % 2 == 0; //condicion o "cuerpo del metodo"

        //de la lista de numeros, con la interface stream, filtrar con "isEven" y crea una nueva colleccion de tipo lista
        List<Integer> evens = numbers.stream()
                                     .filter(isEven)
                                     .collect(Collectors.toList());

        System.out.println("Números pares: " + evens); // Output: Números pares: [2, 4, 6]
    }
    /*
     Aquí, isEven es un Predicate<Integer> que devuelve true si el número es par, y luego lo usamos en filter para seleccionar los números pares de la lista.
     */
}
