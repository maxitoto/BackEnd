package RepasoJava.Metodos.InterfacesFuncionales;


/*2. Function<T, R>
Propósito: Acepta un valor de tipo T y devuelve un valor de tipo R.
Uso típico: Transformar un valor de un tipo a otro (por ejemplo, convertir de String a Integer).
Ejemplo:
Convierte una lista de nombres en sus longitudes.
*/

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Pedro", "Juan");

        Function<String, Integer> nameLength = String::length;//el cuerpo del metodo hace que a cada texto le saca el numero de caracteres

        //de la lista de textos, con la interface funcional stream, mapeandolo con el criterio de nameLength y hacer una colleccion de tipo lista
        List<Integer> lengths = names.stream()
                                     .map(nameLength)
                                     .collect(Collectors.toList());

        System.out.println("Longitud de los nombres: " + lengths); // Output: Longitud de los nombres: [3, 5, 4]
    }
}

/*
Aquí, nameLength es un Function<String, Integer> que toma un String y devuelve su longitud (Integer). Luego usamos map para transformar cada nombre en su longitud.
*/