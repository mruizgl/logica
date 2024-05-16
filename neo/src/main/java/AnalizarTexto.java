public class AnalizarTexto {
    /*
     * Crea un programa que analice texto y obtenga:
     * - Número total de palabras.
     * - Longitud media de las palabras.
     * - Número de oraciones del texto (cada vez que aparecen un punto).
     * - Encuentre la palabra más larga.
     *
     * Todo esto utilizando un único bucle.
     */

    public static void main(String[] args) {
        String texto = "Este es un ejemplo de texto. ¿Cómo se comportará el programa? ¡Vamos a descubrirlo!";
        analizarTexto(texto);
    }

    public static void analizarTexto(String texto) {
        int totalPalabras = 0;
        int totalLetras = 0;
        int totalOraciones = 0;
        int longitudPalabraMasLarga = 0;
        String palabraMasLarga = "";

        boolean dentroDePalabra = false;
        int longitudPalabraActual = 0;

        for (char caracter : texto.toCharArray()) {
            if (Character.isLetter(caracter)) {
                dentroDePalabra = true;
                longitudPalabraActual++;
            } else if (caracter == '.') {
                totalOraciones++;
            } else {

                if (dentroDePalabra) {
                    totalPalabras++;
                    totalLetras += longitudPalabraActual;

                    if (longitudPalabraActual > longitudPalabraMasLarga) {
                        longitudPalabraMasLarga = longitudPalabraActual;
                        palabraMasLarga = texto.substring(texto.length() - longitudPalabraActual);
                    }

                    longitudPalabraActual = 0;
                    dentroDePalabra = false;
                }
            }
        }

        if (dentroDePalabra) {
            totalPalabras++;
            totalLetras += longitudPalabraActual;
            if (longitudPalabraActual > longitudPalabraMasLarga) {
                longitudPalabraMasLarga = longitudPalabraActual;
                palabraMasLarga = texto.substring(texto.length() - longitudPalabraActual);
            }
        }

        double longitudMediaPalabras = totalPalabras > 0 ? (double) totalLetras / totalPalabras : 0;


        System.out.println("Número total de palabras: " + totalPalabras);
        System.out.println("Longitud media de las palabras: " + longitudMediaPalabras);
        System.out.println("Número de oraciones del texto: " + totalOraciones);
        System.out.println("Palabra más larga: " + palabraMasLarga);
    }
}
