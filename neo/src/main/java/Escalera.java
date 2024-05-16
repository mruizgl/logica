public class Escalera {
    /*
     * Crea una función que dibuje una escalera según su número de escalones.
     * - Si el número es positivo, será ascendente de izquiera a derecha.
     * - Si el número es negativo, será descendente de izquiera a derecha.
     * - Si el número es cero, se dibujarán dos guiones bajos (__).
     *
     * Ejemplo: 4
     *         _
     *       _|
     *     _|
     *   _|
     * _|
     *
     */

    public static void main(String[] args) {
        int escalones = 5;
        dibujarEscalera(escalones);
    }

    public static void dibujarEscalera(int escalones) {
        if (escalones == 0) {
            System.out.println("__");
            return;
        }

        int anchoEscalon = Math.abs(escalones);

        for (int i = 0; i < anchoEscalon; i++) {
            for (int j = 0; j < anchoEscalon - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.print("_");

            for (int j = 0; j < i; j++) {
                System.out.print("|");
            }

            System.out.println();
        }
    }
}
