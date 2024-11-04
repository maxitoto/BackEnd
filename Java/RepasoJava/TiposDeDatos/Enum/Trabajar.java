package RepasoJava.TiposDeDatos.Enum;

public class Trabajar {

    public static void main(String[] args) {

        Dias dias = Dias.DOMINGO;

        // Imprimir el día según el nombre del enum
        switch (dias) {
            case LUNES -> System.out.println(dias.name());//devuelve el nombre de la constante LUNES
            case MARTES -> System.out.println(dias.name());
            case MIERCOLES -> System.out.println(dias.name());
            case JUEVES -> System.out.println(dias.name());
            case VIERNES -> System.out.println(dias.name());
            case SABADO -> System.out.println(dias.name());
            case DOMINGO -> System.out.println(dias.name());
        }

        // Obtener y mostrar la abreviatura del día LUNES -> lun
        System.out.println("Abreviatura: " + dias.getAbreviatura());

        // Obtener todos los valores del enum [LUNES y lun]
        for (Dias d : Dias.values()) {
            System.out.println(d.name() + " - Abreviatura: " + d.getAbreviatura());
        }

        // Obtener la posición ordinal del lunes
        System.out.println("Posición ordinal de LUNES: " + Dias.LUNES.ordinal());

        //método del enum
        System.out.println("Es fin de semana? "+(dias.esFinDeSemana()?"Si":"No"));

        //uso método abstracto de enum
        System.out.println(dias.accion());
    }
}


