package RepasoJava.Anotaciones.Retention;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface UsaRUNTIME{
    /*El 99% de las veces Retention contendra la política RUNTIME
        RUNTIME simplemente le dice a Java que mantenga esta anotación durante la ejecución real del programa y tambien durante la compilación, para que otro código pueda realmente mirar esta anotación en  tiempo de ejecución, por lo tanto lo hace accesible
     */
}

@Retention(RetentionPolicy.SOURCE)
@interface UsaSOURCE{
     /*
     SOURSE indica a Java que se deshaga de esta anotacion incluso antes de comenzar a compilar el código, por lo tanto, esta anotacion es para aquellas que importan en tiempo de programación, por ejemplo: @SuppressWarnings evita un color y subrayado visual.
      */
}

//aqui vamos a usar una anotacion x para demostrar que si no hay runtime, entonces esta desaparecerá en tiempo de compilacion como SOURCE
@Target(ElementType.TYPE)
@interface NoUsaRetention{
     /*
        Al no usar la anotacion retention, en momento de preguntar si el elemento usa la etiqueta esta es eliminada igual que al usar source
      */
}

@Retention(RetentionPolicy.CLASS)
@interface UsaCLASS{
    /*
     CLASS indica a Java que mantenga la anotación durante la compilación, pero una vez que se ejecuta, lo eliminará.
      */
}


@UsaRUNTIME
class RetentionRUNTIME{}

@UsaSOURCE
class RetentionSOURCE{}

@UsaCLASS
class RetentionCLASS{}

@NoUsaRetention
class NoRetention{}



public class RetentionEjemplo{}