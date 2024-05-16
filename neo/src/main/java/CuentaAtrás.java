public class CuentaAtrás {

    /*
     * Crea una función que reciba dos parámetros para crear una cuenta atrás.
     * - El primero, representa el número en el que comienza la cuenta.
     * - El segundo, los segundos que tienen que transcurrir entre cada cuenta.
     * - Sólo se aceptan números enteros positivos.
     * - El programa finaliza al llegar a cero.
     * - Debes imprimir cada número de la cuenta atrás.
     */

    public static void main(String[] args) {
        iniciarCuentaAtras(10, 1); // Comienza desde 10 con intervalo de 1 segundo
    }

    public static void iniciarCuentaAtras(int inicio, int intervaloSegundos) {
        if (inicio <= 0 || intervaloSegundos <= 0) {
            System.out.println("Los parámetros deben ser enteros positivos.");
            return;
        }

        System.out.println("Comienza la cuenta atrás:");
        for (int i = inicio; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(intervaloSegundos * 1000); // Convertir segundos a milisegundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
