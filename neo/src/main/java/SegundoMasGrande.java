public class SegundoMasGrande {
    /*
     * Dado un listado de números, encuentra el SEGUNDO más grande
     */

    public static void main(String[] args) {
        int[] numeros = {9, 4, 6, 2, 8};
        int segundoMasGrande = encontrarSegundoMasGrande(numeros);
        System.out.println("El segundo número más grande es: " + segundoMasGrande);
    }

    public static int encontrarSegundoMasGrande(int[] numeros) {
        if (numeros.length < 2) {
            System.out.println("El listado debe tener al menos dos números.");
            return -1;
        }

        int primerMaximo = Integer.MIN_VALUE;
        int segundoMaximo = Integer.MIN_VALUE;

        // Encontrar el número más grande
        for (int numero : numeros) {
            if (numero > primerMaximo) {
                segundoMaximo = primerMaximo;
                primerMaximo = numero;
            } else if (numero > segundoMaximo && numero != primerMaximo) {
                segundoMaximo = numero;
            }
        }

        return segundoMaximo;
    }
}
