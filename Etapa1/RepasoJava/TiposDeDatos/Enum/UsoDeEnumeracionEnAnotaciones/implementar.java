package RepasoJava.TiposDeDatos.Enum.UsoDeEnumeracionEnAnotaciones;

import java.lang.reflect.Method;

@Schedule(day = Day.MONDAY)
public class implementar {

    @Schedule(day = Day.MONDAY)
    public void name() {
        System.out.println("Este metodo es controlado por Lunes.");
    }

    public static void main(String[] args) {
        implementar innplementar = new implementar();

        innplementar.name();

       Class<implementar> classImplementar = implementar.class;

       // Verificar si la clase tiene la anotación Schedule
       if (classImplementar.isAnnotationPresent(Schedule.class)) {
        Schedule schedule = classImplementar.getAnnotation(Schedule.class);
        System.out.println("Clase programada para el día: " + schedule.day());
        }

        // Iterar sobre los métodos para verificar si alguno tiene la anotación
        for (Method method : classImplementar.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Schedule.class)) {
                Schedule schedule = method.getAnnotation(Schedule.class);
                System.out.println("Método '" + method.getName() + "' programado para el día: " + schedule.day());
            }
        }
    }
}
