package RepasoJava.TiposDeDatos.Enum;

public enum Dias {
    LUNES("Mon"),
    MARTES("Tue"),
    MIERCOLES("Wed"),
    JUEVES("Thu"),
    VIERNES("Fri"),
    SABADO("Sat"),
    DOMINGO("Sun");

    private String abreviatura;

    // Constructor para cada día
    Dias(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    // Método para obtener la abreviatura
    public String getAbreviatura() {
        return abreviatura;
    }
}
