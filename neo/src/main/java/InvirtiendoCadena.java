public class InvirtiendoCadena {
    /*
     * Crea un programa que invierta el orden de una cadena de texto
     * sin usar funciones propias del lenguaje que lo hagan de forma automática.
     * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
     */

    public static void main(String[] args) {
        String texto = "Hola mundo";

        String textoInvertido = invertirCadena(texto);

        System.out.println("Cadena original: " + texto);
        System.out.println("Cadena invertida: " + textoInvertido);
    }

    public static String invertirCadena(String cadena) {
        char[] caracteres = cadena.toCharArray();
        char[] invertida = new char[caracteres.length];

        for (int i = 0; i < caracteres.length; i++) {
            invertida[i] = caracteres[caracteres.length - 1 - i];
        }

        return new String(invertida);
    }
}
