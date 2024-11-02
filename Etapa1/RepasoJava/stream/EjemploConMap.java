package RepasoJava.stream;

import java.util.ArrayList;
import java.util.List;

/*
 En streams de Java, map es una operación intermedia que transforma cada elemento del flujo en otro elemento (similar a map en programación funcional), aplicando una función a cada elemento de entrada y produciendo un flujo transformado.
 */

public class EjemploConMap {
     static List<String> paises = new ArrayList<String>();

     public static void main(String[] args) {
        paises.add("argentina");
        paises.add("argentina");
        paises.add("brasil");
        paises.add("japon");
        paises.add("uruguay");

        //hacer una tuberia de paises, quitar los repetidos y crear un mapa con valores de length de cada cadena y escribir por pantalla la estrucutra.
        paises.stream().distinct().map((pais) -> pais.length()).forEach(System.out::println);

        System.out.println("********        ");

        //transformo la lista de paises en una lista de paises con multiples elementos, paises separados por 'A'
        paises.stream().distinct().mapMulti((str, consumer) -> {
                                                                    for (String palabra : str.split("a")) {
                                                                        consumer.accept(palabra);
                                                                    }
                                                                }).forEach(System.out::println);

        /*
         map(Function<T, R>): Toma una función que transforma cada elemento de tipo T en un tipo R.
        
         mapMulti(BiConsumer<T, Consumer<R>>): Similar a map, pero permite que cada elemento del flujo se convierta en cero, uno o múltiples elementos en el flujo de salida, usando un Consumer
         */
     }

}
