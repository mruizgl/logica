public class FactorialRecursivo {

    public static void main(String[] args) {
        int numero = 5;
        long resultado = factorial(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static long factorialSinRecursividad(int n) {
        long resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }
}
