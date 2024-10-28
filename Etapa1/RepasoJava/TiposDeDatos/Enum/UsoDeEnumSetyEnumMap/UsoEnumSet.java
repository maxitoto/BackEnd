package RepasoJava.TiposDeDatos.Enum.UsoDeEnumSetyEnumMap;

import java.util.EnumSet;

import RepasoJava.TiposDeDatos.Enum.Dias;

public class UsoEnumSet {
    public static void main(String[] args) {
        EnumSet<Dias> semana = EnumSet.of(Dias.DOMINGO, Dias.MARTES);
        System.out.println(semana);
        semana.add(Dias.LUNES);//se comporta como una lista
        System.out.println(semana+ " size: "+semana.size() );
    }
}
