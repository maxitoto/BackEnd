package RepasoJava.TiposDeDatos.Enum;
import java.util.Date;

public class Trabajar {

    public static void main(String[] args) {
        // Obtiene el día actual
        Date diaActual = new Date();
        String diaAbreviado = diaActual.toString().split(" ")[0];

        // Usar un switch para determinar el día
        Dias dia = null;
        switch (diaAbreviado) {
            case "Mon":
                dia = Dias.LUNES;
                break;
            case "Tue":
                dia = Dias.MARTES;
                break;
            case "Wed":
                dia = Dias.MIERCOLES;
                break;
            case "Thu":
                dia = Dias.JUEVES;
                break;
            case "Fri":
                dia = Dias.VIERNES;
                break;
            case "Sat":
                dia = Dias.SABADO;
                break;
            case "Sun":
                dia = Dias.DOMINGO;
                break;
            default:
                System.out.println("Día no reconocido.");
                return;
        }

        // Imprimir el día
        System.out.println("El día actual es: " + dia);
        System.out.println("Abreviatura: " + dia.getAbreviatura());
    }
}

