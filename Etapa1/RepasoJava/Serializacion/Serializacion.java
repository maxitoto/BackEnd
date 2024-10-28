package RepasoJava.Serializacion;
// Actualmente, Serializable es considerado obsoleto, pero es útil para entender el propósito de serializar.
/* 
   Básicamente, serializar es transformar un objeto en una cadena de bits para almacenarlo temporalmente y/o enviarlo a otra computadora a través de la red. 
   La deserialización es el proceso inverso: capturar la cadena de bits y transformarla nuevamente en una instancia del objeto.

   Serializable es muy rígido. Aunque puede manejar más de un tipo, cualquier cambio en la estructura del objeto, como agregar un atributo, cambiarle el nombre o agregar un método, puede generar inconsistencias y complicar la deserialización. Además, tiene problemas de seguridad, ya que los datos serializados pueden ser manipulados maliciosamente. Tambien, puede ser incompatible al cambiar de versiones.
   
   Hoy en día, se utilizan alternativas más avanzadas y flexibles como Protocol Buffers (protobufs), JSON, y XML. Estas tecnologías permiten una serialización y deserialización más robusta, eficiente y segura. Protobufs, por ejemplo, son altamente eficientes y compatibles con cambios de versión, mitigando muchos de los problemas inherentes a Serializable.
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializacion {
    public static void main(String[] args) {
        try {
            Persona persona = new Persona("Tomas","Blanco",42011082);
            FileOutputStream archi =new FileOutputStream("C:\\Users\\tommy\\Desktop\\BackEnd\\Etapa1\\RepasoJava\\Serializacion\\objectPersona.txt");
            ObjectOutputStream objectArchiBits = new ObjectOutputStream(archi);
            objectArchiBits.writeObject(persona);
            objectArchiBits.flush();
            objectArchiBits.close();
            System.out.println("Terminado");
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }

        try {
            ObjectInputStream objectArchi = new ObjectInputStream(new FileInputStream("C:\\Users\\tommy\\Desktop\\BackEnd\\Etapa1\\RepasoJava\\Serializacion\\objectPersona.txt"));
            Persona persona = (Persona) objectArchi.readObject(); //devuelve un Object, por eso hay que hacer un cast
            System.out.println(persona.toString());
            objectArchi.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     nota: si una clase hereda de otra clase que implementa serializable, la clase que herada tambien es serializable.

     Si una clase que esta compuesta de otra clase -> Alfajor{Dulce deLeche = new Dulce();} entonces Dulce tambien debe implementar Serializable para poder Serializar Alfajor.

     Si en una coleccion de objetos, alguno no implementa serializable entonces ocurrira un error en tiempo de ejecucion.
     */
}
