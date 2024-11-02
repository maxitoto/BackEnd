package RepasoJava.Patrones.PetternMacher;

import java.awt.Color;

// Pattern Matcher es una forma de hacer cosas con varios objetos que heredan de uno 
// y que se utilizan en un solo método.
// Es una forma de escribir el código limpio y más escalable.
public class Mente {
    
    abstract static class Padre {
        Color ojos = Color.GREEN;
        Color cabello = Color.BLACK;
        String nombre;
        boolean sexo = true;
    }

    static class Hijo extends Padre {
        public Hijo() {
            super();
            ojos = Color.BLUE;
            nombre = "Titan";
        }
    }

    static class Hija extends Padre {
        public Hija() {
            super();
            sexo = false;
            cabello = Color.RED;
            nombre = "Magenta";
        }
    }

    // Método que no usa Pattern Matcher, requiere hacer casting explícito
    public static void sinPatternMatcher(Object sucesor) {
        if (sucesor instanceof Hija) {
            // `sucesor.nombre` y `sucesor.cabello` no son accesibles porque `sucesor` es de tipo Object
            // Ahora que sabemos que es de tipo Hija, entonces es seguro hacer un cast a Hija
            Hija hija = (Hija) sucesor;
            System.out.println("Soy " + hija.nombre); // ahora sí se tiene acceso a los métodos y atributos
        } else if (sucesor instanceof Hijo) {
            Hijo hijo = (Hijo) sucesor;
            System.out.println("Soy " + hijo.nombre);
        }
    }

    // Método con Pattern Matcher, usa `instanceof` con autocasting
    public static void conPatternMatcher(Object sucesor) {
        if (sucesor instanceof Hija hija) { // colocamos un autocast junto al tipo de clase
            System.out.println("Soy " + hija.nombre);
        } else if (sucesor instanceof Hijo hijo) {
            System.out.println("Soy " + hijo.nombre);
        }
    }

    // Método con Pattern Matcher usando `switch`, más escalable y legible
    public static void conPatternMatcherSwitchedo(Object sucesor) {
        switch (sucesor) {
            case Hija hija -> System.out.println("Soy " + hija.nombre);
            case Hijo hijo -> System.out.println("Soy " + hijo.nombre);
            default -> System.out.println("No soy hijo de nadie");
        }
    }

    public static void main(String[] args) {
        sinPatternMatcher(new Hijo()); // poco escalable y poco legible
        conPatternMatcher(new Hijo()); // legible, poco escalable
        conPatternMatcherSwitchedo(new Hijo()); // escalable y legible
    }
}
