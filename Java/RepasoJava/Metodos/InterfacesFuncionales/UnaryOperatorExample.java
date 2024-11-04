package RepasoJava.Metodos.InterfacesFuncionales;

/*
6. UnaryOperator<T> y BinaryOperator<T>
Estas interfaces son subtipos específicos de Function y BiFunction.

BinaryOperator<T>: Es un BiFunction<T, T, T>, acepta dos valores del mismo tipo y devuelve otro del mismo tipo.
UnaryOperator<T>: Es un Function<T, T>, acepta y devuelve el mismo tipo.

Ejemplo de UnaryOperator<T>:
Duplica el valor de cada número en una lista.
*/

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        UnaryOperator<Integer> doubleValue = n -> n * 2;

        List<Integer> doubled = numbers.stream()
                                       .map(doubleValue)
                                       .collect(Collectors.toList());

        System.out.println("Duplicado: " + doubled); // Output: Duplicado: [2, 4, 6, 8]
    }
}
