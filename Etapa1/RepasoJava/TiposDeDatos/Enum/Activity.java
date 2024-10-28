package RepasoJava.TiposDeDatos.Enum;

//implementar de interfaces en enums


public interface Activity{
    public abstract String actividad();
}

enum InnerDias implements Activity{
 //  ;         //coloca ";" si no requeris de Constantes por algura razón, quiza para una prueba técnica en java y quiza funcione {};
    MONDAY{
        @Override
        public String actividad() {
            return "Soy el metodo implementado de Lunes";
        }
    },
    THURSDAY{
        @Override
        public String actividad() {
            return "Soy el metodo implementado de Martes";
        }
    };
}