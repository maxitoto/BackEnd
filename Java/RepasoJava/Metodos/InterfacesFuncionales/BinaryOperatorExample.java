package RepasoJava.Metodos.InterfacesFuncionales;

/* 
Operaciones con dos valores del mismo tipo, como máximo
Ejemplo de BinaryOperator<T>:
Encuentra el valor máximo entre dos números.
*/

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> max = Integer::max;

        System.out.println("Máximo: " + max.apply(5, 10)); // Output: Máximo: 10
    }
}
