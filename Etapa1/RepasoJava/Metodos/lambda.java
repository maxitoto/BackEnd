package RepasoJava.Metodos;

import java.util.ArrayList;
import java.util.stream.*;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/**
 * lambda
 */
public class lambda {

    //(parameter)->expression

    public static void main(String[] args) {
        ArrayList<Integer> elements = new ArrayList<Integer>();
        for (int i = 0; i < 6; i++) {elements.add(i);}
        
        //con cada numero(n) hacer el metodo {Sout(n);}
        elements.forEach( (n)->{System.out.println(n);} );

        //con los numeros, sepralos para filtrarlos, con cada numero(n), donde n == 5, a cada n encontrado en la condicion escribilo por terminal
        elements.stream().filter(n -> n == 5).forEach(n -> System.out.println(n));


        // podemos guardar un metodo lambda y luego usarlo
        Consumer<Integer> metodo = (n) -> {System.out.println(n);};
        elements.forEach(metodo);

        
        StringFunction ejem = (s) -> s+"!";
        printFormatted("Hola", ejem);
    }

    public static void printFormatted(String str, StringFunction format){
        String result = format.run(str);
        System.out.println(result);
    }
    
    public interface StringFunction {
        String run(String str);
    }
}