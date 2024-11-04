package RepasoJava.TiposDeDatos.TipoVar;

public class Var {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        var a = 1;
        var b = "Soy un String";
        //b = a; error, el tipo no es igual. aún sigue siendo fuertemente tipado

        //var a;
        //a = "String";  esto no funciona, var no puede ser tipado sin un contenido para a. ya que no puede determinar el tipo de dato

    }

    //public void argumentoDinamico(var a) {} tampoco podemos intentar hacer un argumento dinamico

    //public var retornoDinamico(){} tampoco podemos devolver un elemento de tipado dinamico

    
}
