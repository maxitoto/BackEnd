package RepasoJava.Metodos.CuatroFormasDeLlamarAMetodos;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ejemplo {
    public static void main(String[] args) {
        //parseLong es un metodo estatico de la clase Long y va a decodificar la cadena que reciba por parametro y lo transformará en valor de tipo long

    //1#
        //si necestio una funcion lambda que transforme un String a un un long haría:
        Function<String, Long> lambda = (str) -> Long.parseLong(str);
        //pero aqui realmente tomamos el parametro y pasarselo de forma explicita a otro metodo

        //para esto entonces usamos una referencia estatica
        Function<String, Long> staticLambda = Long::parseLong;// es simplemene el metodo parseLong de la clase Long y es estatico
        //con esto el lenguaje hará es ver ese parseLong no como una llamada, sino como un elemento de primera clase, osea una referencia al metodo como si se tratase de una variable

        //en resumen te ahorras escribir un metodo que recibe un str y que llama a otro metodo dandole ese mismo str

    //2#
        //en algunos casos querrás invocar una funcion lambda que llame al constructor de una clase, le pasas los parametros del contructor y realizas el llamado con new

        //supplier es una interface funcional que no acepta parametros pero devuelve algo
        Supplier<String> constructorLambda = ()-> new String();
        //que pasa? bueno, de nuevo estamos llamando a una funcion lambda que llama a otro metodo

        //entonces podemos sustituirlo
        Supplier<String> contructorLambdaEstatico = String::new;

        //en lugar de llamar a una funcion que llama a otra funcion, directamente llamo a la funcion final

        //ahora con parametros, un parametro de entrada y claro... la salida
        Function<String, String> constructorLambdaEstaticoConParametro = String::new;
              //<entrada,salida> esta es una razon por la que no se puede usar var, es ambiguo saber a que constructor haces referencia

    //3#
        //que pasa cuando ya tenemos una cadena?
        String cadena = new String("Hola que tal?");

        //y que pasa si quiero una funcion lambda que me devuelva la longitud de la cadena
        Supplier<Integer> lambdaLength = () -> cadena.length();
        //de nuevo caemos en lo mismo, para obtener la longitu estamos llamando a una funcion lambda que llama a otra funcion, ahora por instancia, pero es lo mismo

        //una forma de simplificarlo a partir de una instancia 
        Supplier<Integer> lambdaLengthSimpl = cadena::length; //RECORDA, NO LLEVA PARENTESIS

        //otro ejemplo, nota: predicate es una funcion que devuelve un booleano si se cumple una condicion, si empieza la cadena comienza con str entonces es verdadero
            Predicate<String> lambdaComienzaCon = (str) -> cadena.startsWith(str);
            //simplificado es
            Predicate<String> lambdaComienzaConSimp = cadena::startsWith;

    //4#
        //cuando se utilize este formato surgen cosas
        //String::length , aqui el lenguaje no sabe a que instancia hace referencia, solo se nombra a la clase y una funcion que no es de clase
          //String::length así no compilará
        
        //podriamos hacer
        Function<String, Integer> lambdaEstatico = String::length;
        //<InstanciaAnonima, Salida>
          
        //pero ahora aun más simplificado y con parametros

        //Bifunction recibe dos parametros y una salida, la cadena "Hola", en este caso la cantidad de veces a repetir, ejem 2 y el tipo de salida String que será "HolaHola"
        BiFunction<String, Integer, String> lambdaSimplificado = String::repeat;
        //lo interesante es que no requerimos de una instancia explicita para fabricar la funcion, solo la clase y el metodo(no estatico) de la clase
        //explicacion para que funcione, BiFunction<IntanciaAnonima, var x para la operacion, Salida>
        
    }
}
