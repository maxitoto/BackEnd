package RepasoJava.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class ejemplo {
    static List<String> paises = new ArrayList<String>();
    
    public static void main(String[] args) {
        paises.add("argentina");
        paises.add("argentina");
        paises.add("brasil");
        paises.add("japon");
        paises.add("uruguay");


        Stream<String> stream = paises.stream(); //llamar como varialbe

        //uso correcto, como tuberia
        System.out.println(
            paises.
            stream().
            distinct().
            count());
        //distinct es una operacion transformadora, modifica el listado de entrada
        //toList es una operacion finalizadora, junta todos los elementos y los expulsa como una lista

        System.out.println("------------");

        paises.
        stream().
        filter(pais->pais.length()>5).
        toList().
        forEach(pais->System.out.println(pais));

        System.out.println("------------");
        
        paises.stream().distinct().toList().forEach(pais->System.out.println(pais));
        
    }
}