package RepasoJava.TiposDeDatos.Enum.UsoDeEnumeracionEnAnotaciones;

public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

@interface Schedule {//puede ir en otro archivo 
    Day day(); // Elemento de la anotación de tipo 'Day'
}