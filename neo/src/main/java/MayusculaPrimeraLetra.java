public class MayusculaPrimeraLetra {
    /*
     * Crea una función que reciba un String de cualquier tipo y se encargue de
     * poner en mayúscula la primera letra de cada palabra.
     * - No se pueden utilizar operaciones del lenguaje que
     *   lo resuelvan directamente.
     */

    public static void main(String[] args) {
        String texto = "hola mundo! este es un ejemplo";
        String resultado = capitalizarPrimerasLetras(texto);
        System.out.println("Texto original: " + texto);
        System.out.println("Texto con primeras letras en mayúscula: " + resultado);
    }

    public static String capitalizarPrimerasLetras(String texto) {
        StringBuilder resultado = new StringBuilder();

        // Bandera para indicar si el siguiente carácter debe ser en mayúscula
        boolean capitalizar = true;

        for (char c : texto.toCharArray()) {
            // Si es espacio, se debe capitalizar el próximo carácter
            if (Character.isWhitespace(c)) {
                capitalizar = true;
            } else {
                // Si se debe capitalizar, convertir el carácter a mayúscula
                if (capitalizar) {
                    c = Character.toUpperCase(c);
                    capitalizar = false;
                }
            }
            // Agregar el carácter al resultado
            resultado.append(c);
        }
        return resultado.toString();
    }
}
