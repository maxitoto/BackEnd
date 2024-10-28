package RepasoJava.Metodos;

import java.util.function.Consumer;
import java.util.function.Function;



/*una funcion anonima es aquella que no tiene identificador

funcion NO anónima:

    Privacidad [Type|void] identificador(parametro/s){
        cuerpo
    }

funcion anónima:

        Type no puede ser (var)

    Type result = (parametro, parametro) -> {
                        cuerpo
                    }

    los parametros no tiene tipo, son solo sus referencias (IDs) su Tipo de Dato se calcula por el contexto(que se hara con ellos y que devolverá la funcion anonima)

    Type result = (x, y) -> {
                        cuerpo
                    }


    El truco está en las interfaces funcionales, se trata de implementar una interface sin nombrar a la funcion explicitamente.
    
        Ejemplo No anónimo:
            Runneable runner = new Runneable(){
                @Override
                public void run(){
                    cuerpo
                }
            }

        Ejemplo No anónimo:
            public class Runner implements Runneable{
                @Override
                public void run(){
                    cuerpo
                }
            }

        Ejemplo anónimo:
            Runneable runner = () -> {
                                    cuerpo
                                }
        
        Se lee de la siguiente forma: "Con la referencia(runner) de la clase Runneable, implementar con (ninguna variable) el siguiente modulo de instrucciones (cuerpo)"
        

            Runneable runner = () -> {
                                    Sout("Hola");
                                };

            Runneable runner = () -> Sout("Hello Word");

            Runneable runner = (a) -> {
                                    Sout(a);
                                };

            Runneable runner = (a) -> Sout(a);

*/

public class FuncionesAnonimas {

    public static void main(String[] args) {

        Runnable runner;

        runner = () -> System.out.println("Hola");

        //busco el nombre de la procedimiento que implementamos = "run"
        runner.run();
        

        /*
            runner = (a) -> {a*2;};
            int num = 5;
            runner(num);

            Esto no funciona porque la interface [ run() ] como se ve, no acepta parametros.

            Para realizar la tarea, existen las interfaces funcionales con metodos a implementar, con un parametro, 2 o más, hasta una lista de para metros.
        */

        //ejemplo:

        //declaro una funcion "utilizoUnArgumento" que recibe un Integer, al parametro de entrada le llamamos num  y el cuerpo de la funcion anónima se manipula el paramatero num
        
        Consumer<Integer> utilizoUnArgumento = (numA) -> System.out.println(numA*2 + "" );
        
        //para conocer el nombre de la funcion anónima hay que consultar la documentacion: Represents an operation that accepts a single input argument and returns no result. Unlike most other functional interfaces, Consumer is expected to operate via side-effects. This is a functional interface whose functional method is accept(Object). Dice que su IFuncional es accept.

        Integer A = 5;
        utilizoUnArgumento.accept(A);

        //Otro ejemplo: Interface Funcional con un argumento y una salida

        Function<Integer, Double> unParametroUnaSalida = (numB) -> {
                                                                    Double result = numB/3.5;
                                                                    System.out.println("lambda 'Function' resuelto");
                                                                    return result;//cuando el cuerpo se extiende más que solo el resultado inmediato [numB/3.5;] entoces requiere de un cuerpo común, varialbes y return

                                                                    //Ejem : Function<Integer, Double> unParametroUnaSalida = (numB) -> num/3.5; Listo...
                                                                };
                                                                

        //busco en la docu como se llama lo que acabo de implementar... apply(Object)

        Double result = unParametroUnaSalida.apply(A);
        System.out.println(result);
        

        Runnable dobleLambda = () -> System.out.println(unParametroUnaSalida.apply(A) + " lambda 'Runneable' resuelto");

        //busco el nombre de la procedimiento que implementamos
        dobleLambda.run();

    }
}