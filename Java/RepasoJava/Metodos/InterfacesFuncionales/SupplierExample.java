package RepasoJava.Metodos.InterfacesFuncionales;

/*
4. Supplier<T>
Propósito: No acepta ningún parámetro y devuelve un valor de tipo T.
Uso típico: Proporcionar valores o instancias bajo demanda (por ejemplo, para generar valores aleatorios).
Ejemplo:
Genera un valor aleatorio.
*/


import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Double> randomValue = Math::random;//cuerpo del metodo, de la clase Math usar el metodo random

        System.out.println("Valor aleatorio: " + randomValue.get()); // Output: Valor aleatorio: (un número entre 0.0 y 1.0)
        
    }
}

//En este ejemplo, randomValue es un Supplier<Double> que devuelve un valor aleatorio cada vez que se invoca get().
