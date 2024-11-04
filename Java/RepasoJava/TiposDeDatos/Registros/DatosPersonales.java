import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

//los datos son constantes y es util para transferencia de datos, además ya no requiere de la creacion manual de un constructor, toString, setters( no hay ), getters, comparable, etc...
public record DatosPersonales(long id, int documento, LocalDate fechaDeNacimiento, LocalDate fechaDeCreacion) {

    private static int CONTADOR_DE_REGISTRO = 0;

    public  void setCONTADOR_DE_REGISTRO(int CONTADOR_DE_REGISTRO) {
        DatosPersonales.CONTADOR_DE_REGISTRO = CONTADOR_DE_REGISTRO;
    }

    public static int getCONTADOR_DE_REGISTRO() {
        return CONTADOR_DE_REGISTRO;
    }

    public DatosPersonales {//Solo tenemos que encargarnos de usar el constructor como un validador
        // Validaciones antes de la asignación de valores
        Objects.requireNonNull(id, "El id no puede ser nulo");
        Objects.requireNonNull(documento, "El documento no puede ser nulo");
        Objects.requireNonNull(fechaDeNacimiento, "La fecha de nacimiento no puede ser nula");
        Objects.requireNonNull(fechaDeCreacion, "La fecha de creacion no puede ser nula");
        
        if(id<0){
            throw new IllegalArgumentException("El id es erroneo");
        }
        if(documento < 10000000 || documento > 99999999){
            throw new IllegalArgumentException("El documento ingresado es erroneo");
        }
        if(fechaDeNacimiento.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("La fecha de nacimiento es futura a la actual");
        }
        if(fechaDeCreacion.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("La fecha de creacion es futura a la actual");
        }

        DatosPersonales.CONTADOR_DE_REGISTRO++;
    }

    //es posible usar metodos estaticos y de instancia, ademas poder instanciar atributos constantes y de tipo variable estaticas

    public int calcularEdad(){
        return Period.between(fechaDeNacimiento,LocalDate.now()).getYears();
    }
}
