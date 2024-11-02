package RepasoJava.Patrones.PatternMacherConRecordYSealed;


//una forma limpia de hacer programacion orientada a datos

public class Mente{

    sealed interface Sealed{}

    record Cuadrado(Double lado) implements Sealed{}
    record Rectangulo(Double ladoA, Double ladoB) implements Sealed{}
    record Triangulo(Double base, Double altura) implements Sealed{}
    record Punto(Double px, Double py)implements Sealed{}
    record Circunferencia(Punto centro, Double radio)implements Sealed{}


    public static Double calcularArea(Sealed x){//automaticamente se hace la extraccion de datos del record
        return switch(x){
            //el roden de llamado de las constantes tienen que ser iguales, si queres evitar nombrar una variable que no usaras utiliza '_' por ejemplo Double _ o tambien var _
            case Cuadrado(var lado) -> lado*lado;
            case Rectangulo(Double ladoA, Double ladoB) -> ladoA*ladoB;
            case Triangulo(var base ,Double altura) -> (base*altura)/2;
            case Punto(Double _, var _) -> 0.0; //ya que no se usa para nada, entonces coloco '_' y devuelvo cero decimal
            case Circunferencia(Punto(Double px, var _), var radio) -> radio*radio;
            
            
            //NO ES NECESARIO DEFAULT PORQUE SEALED HACE QUE SEAN ESAS 3 UNICAS OPCIONES Y NADA MAS (cosas de finals)
        };
    }

    
     public static void main(String[] args) {
        Rectangulo r = new Rectangulo(5.0, 2.0);
        System.out.println(calcularArea(r));
    }
}






