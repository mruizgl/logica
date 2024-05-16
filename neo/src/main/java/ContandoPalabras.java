import java.util.HashMap;
import java.util.Map;

public class ContandoPalabras {
    /*
     * Crea un programa que cuente cuantas veces se repite cada palabra
     * y que muestre el recuento final de todas ellas.
     * - Los signos de puntuación no forman parte de la palabra.
     * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
     * - No se pueden utilizar funciones propias del lenguaje que
     *   lo resuelvan automáticamente.
     */

    public static void main(String[] args) {
        String texto = "Este es un texto de ejemplo, con palabras repetidas. Este es un Texto!";

        Map<String, Integer> conteoPalabras = contarPalabras(texto);

        for (Map.Entry<String, Integer> entry : conteoPalabras.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> contarPalabras(String texto) {
        String[] palabras = texto.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

        Map<String, Integer> conteoPalabras = new HashMap<>();

        for (String palabra : palabras) {
            conteoPalabras.put(palabra, conteoPalabras.getOrDefault(palabra, 0) + 1);
        }

        return conteoPalabras;
    }
}
