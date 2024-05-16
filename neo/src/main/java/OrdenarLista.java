import java.util.Arrays;

public class OrdenarLista {
    /*
     * Crea una función que ordene y retorne una matriz de números.
     * - La función recibirá un listado (por ejemplo [2, 4, 6, 8, 9]) y un parámetro
     *   adicional "Asc" o "Desc" para indicar si debe ordenarse de menor a mayor
     *   o de mayor a menor.
     * - No se pueden utilizar funciones propias del lenguaje que lo resuelvan
     *   automáticamente.
     */

    public static void main(String[] args) {
        int[] numeros = {9, 4, 6, 2, 8};
        String orden = "Asc"; // Orden ascendente

        int[] numerosOrdenados = ordenarMatriz(numeros, orden);
        System.out.println("Matriz ordenada: " + Arrays.toString(numerosOrdenados));
    }

    public static int[] ordenarMatriz(int[] matriz, String orden) {
        int[] matrizOrdenada = matriz.clone();

        boolean cambio = true;

        while (cambio) {
            cambio = false;
            for (int i = 0; i < matrizOrdenada.length - 1; i++) {
                if ((orden.equals("Asc") && matrizOrdenada[i] > matrizOrdenada[i + 1]) ||
                        (orden.equals("Desc") && matrizOrdenada[i] < matrizOrdenada[i + 1])) {
                    int temp = matrizOrdenada[i];
                    matrizOrdenada[i] = matrizOrdenada[i + 1];
                    matrizOrdenada[i + 1] = temp;
                    cambio = true;
                }
            }
        }
        return matrizOrdenada;
    }
}
