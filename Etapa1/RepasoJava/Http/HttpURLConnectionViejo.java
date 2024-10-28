package RepasoJava.Http;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionViejo { // Define una clase llamada HttpURLConnectionExample

    private static final String USER_AGENT = "Mozilla/5.0"; // Define una constante para el agente de usuario utilizado en la solicitud HTTP

    private static final String GET_URL = "https://www.google.com/search?q=javaguides"; // Define una constante con la URL a la que se enviará la solicitud GET

    public static void main(String[] args) throws IOException { // Método principal que puede lanzar una excepción IOException
        sendHttpGETRequest(); // Llama al método para enviar la solicitud HTTP GET
    }

    @SuppressWarnings("deprecation")
    private static void sendHttpGETRequest() throws IOException { // Método que envía una solicitud HTTP GET y puede lanzar una IOException
        URL obj = new URL(GET_URL); // Crea un objeto URL a partir de la URL definida en GET_URL
        HttpURLConnection httpURLConnection = (HttpURLConnection) obj.openConnection(); // Abre una conexión HTTP a la URL especificada
        httpURLConnection.setRequestMethod("GET"); // Establece el método de solicitud como GET
        httpURLConnection.setRequestProperty("User-Agent", USER_AGENT); // Agrega una propiedad para definir el agente de usuario en la solicitud
        int responseCode = httpURLConnection.getResponseCode(); // Obtiene el código de respuesta de la solicitud GET
        System.out.println("GET Response Code :: " + responseCode); // Imprime el código de respuesta HTTP

        if (responseCode == HttpURLConnection.HTTP_OK) { // Verifica si la respuesta es HTTP 200 (OK)
            BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream())); // Abre un lector de flujo para leer la respuesta de la conexión
            String inputLine; // Declara una variable para almacenar cada línea leída de la respuesta
            StringBuffer response = new StringBuffer(); // Crea un StringBuffer para acumular las líneas de respuesta

            while ((inputLine = in.readLine()) != null) { // Lee cada línea de la respuesta hasta llegar al final
                response.append(inputLine); // Agrega cada línea leída al StringBuffer
            }
            in.close(); // Cierra el lector de flujo de entrada

            // Imprime el resultado completo de la respuesta HTTP
            System.out.println(response.toString());
        } else { // Si la respuesta no es HTTP 200
            System.out.println("GET request not worked"); // Informa que la solicitud GET no funcionó
        }

        for (int i = 1; i <= 8; i++) { // Itera para mostrar las primeras 8 cabeceras de la respuesta HTTP
            System.out.println(httpURLConnection.getHeaderFieldKey(i) + " = " + httpURLConnection.getHeaderField(i)); // Imprime cada par clave-valor de las cabeceras de respuesta
        }
    }
}


