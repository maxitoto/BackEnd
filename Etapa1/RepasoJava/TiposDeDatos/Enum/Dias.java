package RepasoJava.TiposDeDatos.Enum;

public enum Dias {
    //podemos darle un valor asociado a las constantes LUNES -> LUNES("lun")
    LUNES("Mon"){//podemos implementar un metodo abstracto (si o si en todas las constantes)
        public String accion(){return "hoy es lunes y llevo a mis hijos  a la escuela y trabajo hasta tarde";}
    },
    MARTES("Tue"){
        public String accion(){return "hoy es martes y hago homeoffice";}
    },
    MIERCOLES("Wed"){
        public String accion(){return "hoy es miercoles y llevo a mis hijos  a la escuela y trabajo hasta tarde";}
    },
    JUEVES("Thu"){
        public String accion(){return "hoy es jueves y trabajo hasta tarde";}
    },
    VIERNES("Fri"){
        public String accion(){return "hoy es viernes y llevo a mis hijos  a la escuela y salgo temprano del trabajo";}
    },
    SABADO("Sat"){
        public String accion(){return "hoy es sabado y descanzo todo el dia";}
    },
    DOMINGO("Sun"){
        public String accion(){return "hoy es domingo y me dedico a hacer mis actividades prefereidas";}
    };

    public abstract String accion();

    private String abreviatura;

    // Constructor para cada día
    Dias(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    
    // Método para obtener la abreviatura
    public String getAbreviatura() {
        return abreviatura;
    }

    //podemos meter métodos
    public boolean esFinDeSemana() {
        return (this == SABADO || this == DOMINGO);
    }

     /*
        Constantes de enumeración y patrón singleton
        Las constantes de enumeración son singletons, lo que significa que solo hay una instancia de cada constante de enumeración y se pueden comparar mediante el operador. ==
    */
    public void demoSingleton(){
        if (Dias.LUNES == Dias.LUNES) {
            System.out.println("Misma instancia"); // this will be printed
        }
    }
    
    /*
        -Seguridad de la rosca-
    Las enumeraciones son inherentemente seguras para subprocesos. Todos sus miembros son finales y se garantiza que tienen una sola instancia, por lo que se pueden usar de forma segura en un entorno de varios subprocesos.

        -Reflexión y enumeraciones-
    Aunque es posible usar la reflexión para invocar métodos en instancias de enumeración, no es posible crear una instancia de una enumeración mediante la reflexión, que es otra prueba de su inmutabilidad.
     */


    /*
        -Enumeraciones en instrucciones switch y seguridad de tipos-
    Las enumeraciones se pueden usar en instrucciones de cambio de mayúsculas y minúsculas. Esto ayuda a escribir un código más limpio y también evita errores comunes, como errores tipográficos, que habrían pasado desapercibidos en el caso de las constantes de cadena.

    Ejemplo en java
        Day day = Day.MONDAY;
        switch (day) {
            case MONDAY -> {System.out.println("Mondays are hard."); break;}
            // other cases
        }
    El hecho de que no se pueda pasar un valor incorrecto, uno que no esté definido en la enumeración, a la instrucción switch garantiza la seguridad de tipos.

     */

     /*
      -Las enumeraciones son serializables-
    Dado que Enum implementa la interfaz Serializable, se puede serializar automáticamente. Sin embargo, solo se serializa el nombre de la constante de enumeración. Los valores de campo no se serializan, ya que se consideran datos por constante y no datos por instancia.
      */


      /*
            -Igualdad y comparación-
        Las enumeraciones se pueden comparar para la igualdad usando ambos y . Ambos darán el mismo resultado porque solo hay un objeto para cada constante de enumeración. == equals()

        Ejemplo en java
        if (Day.MONDAY == Day.MONDAY) {
            System.out.println("True"); // prints True
        }
        if (Day.MONDAY.equals(Day.MONDAY)) {
            System.out.println("True"); // prints True
        }
       */

       /*
                -toString() y name()-
            Todas las enumeraciones tienen automáticamente métodos y. El método devuelve el nombre de esta constante de enumeración, exactamente como se declara en su declaración de enumeración. El método también hace lo mismo. Sin embargo, se puede invalidar para proporcionar lógica personalizada, mientras que no se puede ser. toString() name() toString() name() toString() name()

            Ejemplo en java
            public enum Day {
                MONDAY {
                    @Override
                    public String toString() {
                        return "It's Monday!";
                    }
                },
                // other days
                ;
            }
        */
        

        /*
                    -Uso de enumeración en colecciones-
            Las enumeraciones se pueden usar como elementos en colecciones como listas, conjuntos o como claves en mapas, lo que proporciona seguridad de tipos y reduce los errores causados por pasar valores inapropiados.

            Ejemplo en java
            List<Day> daysList = new ArrayList<>();
            daysList.add(Day.MONDAY);
            daysList.add(Day.TUESDAY);
         */

         /*
                        -Enumeración anidada-
                Las enumeraciones se pueden anidar dentro de otras clases o dentro de otras enumeraciones. Sin embargo, tienen implícitamente un modificador estático, por lo que no se pueden anidar dentro de los métodos.

                Ejemplo en java
                public class OuterClass {
                    enum NestedEnum {
                        A, B, C
                    }
                }
          */

          enum NestedEnum{
            ALGO,OTRACOSA,ESTA_TODO_ANIDADO
          }
}