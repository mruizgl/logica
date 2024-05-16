public class NumeroPrimoGemelo {

    /*
     * Crea un programa que encuentre y muestre todos los pares de números primos
     * gemelos en un rango concreto.
     * El programa recibirá el rango máximo como número entero positivo.
     *
     * - Un par de números primos se considera gemelo si la diferencia entre
     *   ellos es exactamente 2. Por ejemplo (3, 5), (11, 13)
     *
     * - Ejemplo: Rango 14
     *   (3, 5), (5, 7), (11, 13)
     */

    public static void main(String[] args) {
        int rangoMaximo = 50; // Puedes cambiar este número para probar diferentes rangos
        encontrarNumerosPrimosGemelos(rangoMaximo);
    }

    public static void encontrarNumerosPrimosGemelos(int rangoMaximo) {
        System.out.println("Pares de números primos gemelos en el rango hasta " + rangoMaximo + ":");

        for (int numero = 2; numero <= rangoMaximo - 2; numero++) {
            if (esPrimo(numero) && esPrimo(numero + 2)) {
                System.out.println("(" + numero + ", " + (numero + 2) + ")");
            }
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
