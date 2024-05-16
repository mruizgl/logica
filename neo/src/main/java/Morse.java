import java.util.HashMap;
import java.util.Map;

public class Morse {
    /*
     * Crea un programa que sea capaz de transformar texto natural a código
     * morse y viceversa.
     * - Debe detectar automáticamente de qué tipo se trata y realizar
     *   la conversión.
     * - En morse se soporta raya "—", punto ".", un espacio " " entre letras
     *   o símbolos y dos espacios entre palabras "  ".
     * - El alfabeto morse soportado será el mostrado en
     *   https://es.wikipedia.org/wiki/Código_morse.
     */

    public static void main(String[] args) {
        String entrada = "Hola mundo";
        String salida = "";

        // Detectar si la entrada es texto natural o código Morse
        if (esCodigoMorse(entrada)) {
            // Si es código Morse, convertir a texto natural
            salida = convertirNumerosAMorseTexto(entrada);
        } else {
            // Si es texto natural, convertir a código Morse
            salida = convertirTextoANumerosMorse(entrada);
        }

        System.out.println("Salida: " + salida);
    }

    // Función para verificar si la entrada es código Morse o texto natural
    public static boolean esCodigoMorse(String texto) {
        // Si contiene al menos un punto o una raya, se asume que es código Morse
        return texto.contains(".") || texto.contains("-");
    }

    // Función para convertir texto natural a código Morse
    public static String convertirTextoANumerosMorse(String texto) {
        // Diccionario para mapear caracteres a su equivalente en código Morse
        Map<Character, String> codigoMorse = new HashMap<>();
        codigoMorse.put('A', ".-");
        codigoMorse.put('B', "-...");
        codigoMorse.put('C', "-.-.");
        codigoMorse.put('D', "-..");
        codigoMorse.put('E', ".");
        codigoMorse.put('F', "..-.");
        codigoMorse.put('G', "--.");
        codigoMorse.put('H', "....");
        codigoMorse.put('I', "..");
        codigoMorse.put('J', ".---");
        codigoMorse.put('K', "-.-");
        codigoMorse.put('L', ".-..");
        codigoMorse.put('M', "--");
        codigoMorse.put('N', "-.");
        codigoMorse.put('O', "---");
        codigoMorse.put('P', ".--.");
        codigoMorse.put('Q', "--.-");
        codigoMorse.put('R', ".-.");
        codigoMorse.put('S', "...");
        codigoMorse.put('T', "-");
        codigoMorse.put('U', "..-");
        codigoMorse.put('V', "...-");
        codigoMorse.put('W', ".--");
        codigoMorse.put('X', "-..-");
        codigoMorse.put('Y', "-.--");
        codigoMorse.put('Z', "--..");
        codigoMorse.put('1', ".----");
        codigoMorse.put('2', "..---");
        codigoMorse.put('3', "...--");
        codigoMorse.put('4', "....-");
        codigoMorse.put('5', ".....");
        codigoMorse.put('6', "-....");
        codigoMorse.put('7', "--...");
        codigoMorse.put('8', "---..");
        codigoMorse.put('9', "----.");
        codigoMorse.put('0', "-----");

        // Convertir texto a mayúsculas para evitar problemas con el diccionario
        texto = texto.toUpperCase();

        StringBuilder morse = new StringBuilder();
        for (char c : texto.toCharArray()) {
            if (c == ' ') {
                morse.append("   "); // Dos espacios para separar palabras
            } else if (codigoMorse.containsKey(c)) {
                morse.append(codigoMorse.get(c)).append(" "); // Un espacio entre letras o símbolos
            }
        }
        return morse.toString().trim(); // Eliminar espacios al principio y al final
    }

    // Función para convertir código Morse a texto natural
    public static String convertirNumerosAMorseTexto(String morse) {
        // Diccionario para mapear código Morse a caracteres
        Map<String, Character> codigoTexto = new HashMap<>();
        for (Map.Entry<Character, String> entry : codigoMorse.entrySet()) {
            codigoTexto.put(entry.getValue(), entry.getKey());
        }

        StringBuilder texto = new StringBuilder();
        String[] palabras = morse.split("   "); // Separar palabras
        for (String palabra : palabras) {
            String[] letras = palabra.split(" "); // Separar letras o símbolos
            for (String letra : letras) {
                texto.append(codigoTexto.getOrDefault(letra, null));
            }
            texto.append(" "); // Un espacio entre palabras
        }
        return texto.toString().trim(); // Eliminar espacios al principio y al final
    }

    // Diccionario para texto natural a código Morse
    private static final Map<Character, String> codigoMorse = new HashMap<>();
    static {
        codigoMorse.put('A', ".-");
        codigoMorse.put('B', "-...");
        codigoMorse.put('C', "-.-.");
        codigoMorse.put('D', "-..");
        codigoMorse.put('E', ".");
        codigoMorse.put('F', "..-.");
        codigoMorse.put('G', "--.");
        codigoMorse.put('H', "....");
        codigoMorse.put('I', "..");
        codigoMorse.put('J', ".---");
        codigoMorse.put('K', "-.-");
        codigoMorse.put('L', ".-..");
        codigoMorse.put('M', "--");
        codigoMorse.put('N', "-.");
        codigoMorse.put('O', "---");
        codigoMorse.put('P', ".--.");
        codigoMorse.put('Q', "--.-");
        codigoMorse.put('R', ".-.");
        codigoMorse.put('S', "...");
        codigoMorse.put('T', "-");
        codigoMorse.put('U', "..-");
        codigoMorse.put('V', "...-");
        codigoMorse.put('W', ".--");
        codigoMorse.put('X', "-..-");
        codigoMorse.put('Y', "-.--");
        codigoMorse.put('Z', "--..");
        codigoMorse.put('1', ".----");
        codigoMorse.put('2', "..---");
        codigoMorse.put('3', "...--");
        codigoMorse.put('4', "....-");
        codigoMorse.put('5', ".....");
        codigoMorse.put('6', "-....");
        codigoMorse.put('7', "--...");
        codigoMorse.put('8', "---..");
        codigoMorse.put('9', "----.");
        codigoMorse.put('0', "-----");
    }
}
