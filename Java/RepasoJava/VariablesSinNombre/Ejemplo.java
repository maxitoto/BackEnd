package RepasoJava.VariablesSinNombre;


public class Ejemplo {
    public static void main(String[] args) {
        try {} catch (Exception e) {
            // existen ocaciones donde las variables como "e" se quedan sin usar para nada y algunos IDE lo marcan como sin usar (color amarillo)
        }

        try {
            
        } catch (Exception _) {
            //a partir de java 22 se puede usar "_" como nombre de variable, evitando que se marque como no usado y dando semantica al codigo
        }

        //de todas formas no funciona en todos los casos
         //en la declaracion de un main "public static void main(String[] args)" args generalmente no se utiliza
         //pero aún así no podemos reemplazarlo por "_" public static void main(String[] _) esto dará un error en tiempo de programación

         //puedes declarar variables con "_"
         Integer _ = 5;
    }
    
}