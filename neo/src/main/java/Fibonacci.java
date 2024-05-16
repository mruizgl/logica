public class Fibonacci {
    /*
     * Escribe un programa que imprima los 50 primeros números de la sucesión
     * de Fibonacci empezando en 0.
     * - La serie Fibonacci se compone por una sucesión de números en
     *   la que el siguiente siempre es la suma de los dos anteriores.
     *   0, 1, 1, 2, 3, 5, 8, 13...
     */
    public static void main(String[] args) {
        long a = 0;
        long b = 1;


        for (int i = 0; i < 50; i++) {
            System.out.println(a);

            long next = a + b;
            a = b;
            b = next;
        }
    }
}
