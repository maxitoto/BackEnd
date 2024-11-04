package RepasoJava.SealedClass.ExtensionYClases;

//el objetivo de la palabara reservada sealed es restringir quienes pueden heredar de la clase, tanto extender como implementar.
/*las clases hijas que esten permitidas de extender o implementar, tendran que ser final, para darle continuidad
 a la restriccion y no saltarsela de la siguiente forma: 
 Desayuno<--pan<--otraclase "esto no tiene que ocurrir, entonces 'pan' debe ser final" porque 'otraclase' podria heredar de Desayuno siendo esto no permitido
 
 */


/*tipos de clases

public sealed class Desayuno permits pan, cafe, mantequilla {}
public sealed abstract class Desayuno permits pan, cafe, mantequilla {} se puede colocar abstract sealed o al reves
public sealed interface Desayuno permits pan, cafe, mantequilla {}
*/

public sealed abstract class Desayuno permits Cafe {

    
}

sealed interface Merienda permits Mantequilla, Pan{
    public void untar();
    
}


//intento de herencia no permitida
final class otraClase extends Desayuno implements Merienda{
    //primer error, no estoy permitido en Desayuno
    //segundo error, no estoy permitido en Merienda

    //tendo que sobreescribir si o si, pero da igual, esto no compilará
    @Override
    public void untar() {
        System.out.println("no funiona");
    }

}