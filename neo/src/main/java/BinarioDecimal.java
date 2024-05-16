public class BinarioDecimal {
    /*
     * Crea un programa se encargue de transformar un número binario
     * a decimal sin utilizar funciones propias del lenguaje que
     * lo hagan directamente.
     */

    public static void main(String[] args) {
        String binario = "1010";
        int decimal = binarioADecimal(binario);
        System.out.println("El número binario " + binario + " es equivalente a " + decimal + " en decimal.");
    }

    public static int binarioADecimal(String binario) {
        int decimal = 0;
        int longitud = binario.length();

        for (int i = 0; i < longitud; i++) {
            char digito = binario.charAt(longitud - i - 1);

            int valor = Character.getNumericValue(digito) * (int) Math.pow(2, i);

            decimal += valor;
        }

        return decimal;
    }
}
