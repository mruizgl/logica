public class MCDMCM {
    /*
     * Crea dos funciones, una que calcule el máximo común divisor (MCD) y otra
     * que calcule el mínimo común múltiplo (mcm) de dos números enteros.
     * - No se pueden utilizar operaciones del lenguaje que
     *   lo resuelvan directamente.
     */

    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 36;

        int mcd = calcularMCD(num1, num2);
        int mcm = calcularMCM(num1, num2);

        System.out.println("El MCD de " + num1 + " y " + num2 + " es: " + mcd);
        System.out.println("El mcm de " + num1 + " y " + num2 + " es: " + mcm);
    }

    // Función para calcular el máximo común divisor (MCD) usando el algoritmo de Euclides
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Función para calcular el mínimo común múltiplo (mcm) usando la relación entre MCD y mcm
    public static int calcularMCM(int a, int b) {
        // El mcm se calcula usando la relación: mcm(a, b) = (a * b) / MCD(a, b)
        return (a * b) / calcularMCD(a, b);
    }
}
