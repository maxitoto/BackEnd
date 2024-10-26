package RepasoJava.archivos;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;

public class ViejoYNuevo {
    public static void main(String[] args) throws URISyntaxException {
        
        //forma vieja
        String path = "C:/Users/tommy/Desktop/RoadToBackEnd/Etapa1/RepasoJava/archivos/Texto.txt";
        File archi = new File(path);
        System.out.println(archi);

        //parece que funciona igual xD
        String path2 = "C:\\Users\\tommy\\Desktop\\RoadToBackEnd\\Etapa1\\RepasoJava\\archivos\\Texto.txt";
        archi = new File(path2);
        System.out.println(archi);



        //forma nueva

        //es mas inteligente y no le importa la direccion y canditadad de barras

        /*
        tiene una variedad de opciones para construir sus objetos Path.

        Sin embargo, hay dos puntos importantes:

        1. La construcción de un objeto de ruta de acceso o la resolución de un objeto secundario no significa que el archivo o directorio exista realmente. La ruta de acceso es simplemente una referencia a un archivo potencial. Por lo tanto, tendrás que verificar su existencia por separado.

        2. Antes de Java-11, se llamaba , que deberá usar si está atascado en versiones anteriores de Java o si está construyendo una biblioteca que necesita cierta compatibilidad con versiones anteriores. A partir de Java 11, redirige internamente a .Path.ofPaths.getPaths.getPath.of . En otras palabras, pathOf se encarga de la compatibilidad para versiones viejas.
        */

        Path archiPath;

        archiPath = Path.of("C:\\Users\\tommy\\Desktop\\RoadToBackEnd\\Etapa1\\RepasoJava\\archivos\\Texto.txt");
        System.out.println(archiPath);

        archiPath = Path.of("C:/Users/tommy/Desktop/RoadToBackEnd/Etapa1/RepasoJava/archivos/Texto.txt");
        System.out.println(archiPath);

        archiPath = Path.of("C:","Users","tommy","Desktop","RoadToBackEnd","Etapa1","RepasoJava","archivos","Texto.txt");
        System.out.println(archiPath);

        archiPath = Path.of("C:","Users","tommy","Desktop","RoadToBackEnd","Etapa1","RepasoJava","archivos").resolve("Texto.txt"); // resolve == getChild()
        System.out.println(archiPath);

        archiPath = Path.of(new URI("file:///C:/Users/tommy/Desktop/RoadToBackEnd/Etapa1/RepasoJava/archivos/Texto.txt"));
        System.out.println(archiPath);


        //operaciones tipicas
            //existe el archivo?
            System.out.println("File existe? "+Files.exists(archiPath));


            try {
                //Cómo obtener la fecha de la última modificación de un archivo
                System.out.println("Fecha mod: "+Files.getLastModifiedTime(archiPath));
            } catch (IOException e) {
                e.printStackTrace();
            }

            //Cómo comparar archivos (Java12+)

            Path archiPath2 = Path.of(new URI("file:///C:/Users/tommy/Desktop/RoadToBackEnd/Etapa1/RepasoJava/archivos/TextoAux.txt"));

            try {
                System.out.println("mismatch = " + Files.mismatch(archiPath, archiPath2));
            } catch (IOException e) {
                e.printStackTrace();
            }

            //Cómo obtener el propietario de un archivo
            UserPrincipal owner;
            try {
                owner = Files.getOwner(archiPath);
                System.out.println("owner = " + owner);
            } catch (IOException e) {
                e.printStackTrace();
            }
            

            //Cómo crear archivos temporales

 /*
             El directorio de archivos temporales predeterminado se especifica mediante la propiedad del sistema java.io.tmpdir. En los sistemas UNIX, el valor predeterminado de esta propiedad suele ser "/tmp" o "/var/tmp"; en los sistemas Microsoft Windows suele ser "c:\temp". Se puede dar un valor diferente a esta propiedad del sistema cuando se invoca la máquina virtual Java, pero no se garantiza que los cambios programáticos en esta propiedad tengan ningún efecto sobre el directorio temporal utilizado por este método.

                Para especificar la propiedad System, puede invocar la JVM de la siguiente manera:java.io.tmpdir

                    java -Djava.io.tmpdir=/path/to/tmpdir

            Al crear archivos temporales, puede especificar un prefijo (primer parámetro) y un sufijo (segundo parámetro). Ambos pueden ser nulos.

            El prefijo tendrá el prefijo (¡duh!) al nombre del archivo temporal, el sufijo es esencialmente la extensión del archivo y, si lo omite, se utilizará una extensión predeterminada de ".tmp".

            
*/

            Path tempFile1;
            try {
                tempFile1 = Files.createTempFile("somePrefixOrNull", ".txt");
                System.out.println("tempFile1 = " + tempFile1);  
            } catch (IOException e) {
                e.printStackTrace();
            }
                   
            //En lugar del directorio temporal predeterminado, también puede especificar su propio directorio donde desea que se cree el archivo temporal.

            Path tmpDirectory;
            try {
                tmpDirectory = Files.createTempDirectory("prefix");
                System.out.println("tmpDirectory = " + tmpDirectory);
            } catch (IOException e) {
                e.printStackTrace();
            }

            /* Nota: Los archivos temporales, contrariamente a la creencia popular, no se eliminan solos. Debe asegurarse de eliminarlos explícitamente, al crearlos en pruebas unitarias o cuando se ejecuten en producción. */



            //Cómo crear archivos y directorios

            //Path newDirectory = Files.createDirectories(path.getParent().resolve("some/new/dir"));
            //System.out.println("newDirectory = " + newDirectory);

            //Path newFile = Files.createFile(newDirectory.resolve("emptyFile.txt"));
            //System.out.println("newFile = " + newFile);

            //........ mas info (lectura, escritura, mover, eliminar, listar archivos, archivos relativos, absolutos y canonicos...etc) https://www.marcobehler.com/guides/java-files
    }
}
