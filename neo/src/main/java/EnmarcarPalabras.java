public class EnmarcarPalabras {
    /*
     * Crea una función que reciba un texto y muestre cada palabra en una línea,
     * formando un marco rectangular de asteriscos.
     * - ¿Qué te parece el reto? Se vería así:
     *   **********
     *   * ¿Qué   *
     *   * te     *
     *   * parece *
     *   * el     *
     *   * reto?  *
     *   **********
     */

    public static void main(String[] args) {
        String texto = "¿Qué te parece el reto?";
        imprimirMarcoRectangular(texto);
    }

    public static void imprimirMarcoRectangular(String texto) {
        // Dividir el texto en palabras
        String[] palabras = texto.split("\\s+");

        // Encontrar la longitud máxima de las palabras
        int longitudMaxima = 0;
        for (String palabra : palabras) {
            longitudMaxima = Math.max(longitudMaxima, palabra.length());
        }

        // Imprimir el marco superior
        imprimirLineaAsteriscos(longitudMaxima + 4);

        // Imprimir cada palabra rodeada de asteriscos
        for (String palabra : palabras) {
            System.out.println("* " + ajustarPalabra(palabra, longitudMaxima) + " *");
        }

        // Imprimir el marco inferior
        imprimirLineaAsteriscos(longitudMaxima + 4);
    }

    // Función para imprimir una línea de asteriscos de la longitud dada
    public static void imprimirLineaAsteriscos(int longitud) {
        for (int i = 0; i < longitud; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // Función para ajustar la longitud de una palabra con espacios
    public static String ajustarPalabra(String palabra, int longitudMaxima) {
        int espacios = longitudMaxima - palabra.length();
        StringBuilder palabraAjustada = new StringBuilder(palabra);
        for (int i = 0; i < espacios; i++) {
            palabraAjustada.append(" ");
        }
        return palabraAjustada.toString();
    }
}
