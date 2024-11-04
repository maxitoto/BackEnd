package RepasoJava.TiposDeDatos.Enum.UsoDeEnumSetyEnumMap;

import java.util.EnumMap;

import RepasoJava.TiposDeDatos.Enum.Dias;

public class UsoEnumMap {
    public static void main(String[] args) {
        EnumMap<Dias, String> semana = new EnumMap<>(Dias.class);
        semana.put(Dias.MIERCOLES, "literalmente la mitad de la semana laboral");
        semana.put(Dias.SABADO, "El mejor dia de la semana");
        System.out.println(semana);

        for (String dia : semana.values()) {
            System.out.println(dia);
        }
        
        System.out.println(semana.get(Dias.MIERCOLES));
        System.out.println(semana.get("El mejor dia de la semana"));//Es null porque no es la clave
    }
    
}