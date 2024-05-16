public class TresEnRaya {

    /*
     * Crea una función que analice una matriz 3x3 compuesta por "X" y "O"
     * y retorne lo siguiente:
     * - "X" si han ganado las "X"
     * - "O" si han ganado los "O"
     * - "Empate" si ha habido un empate
     * - "Nulo" si la proporción de "X", de "O", o de la matriz no es correcta.
     *   O si han ganado los 2.
     * Nota: La matriz puede no estar totalmente cubierta.
     * Se podría representar con un vacío "", por ejemplo.
     */

    public static void main(String[] args) {
        String[][] matriz = {
                {"X", "O", ""},
                {"X", "X", "O"},
                {"O", "O", ""}
        };

        String resultado = analizarMatriz(matriz);
        System.out.println("Resultado: " + resultado);
    }

    public static String analizarMatriz(String[][] matriz) {
        // Contadores para "X", "O" y vacíos
        int contadorX = 0;
        int contadorO = 0;
        int contadorVacios = 0;

        // Contadores para filas, columnas y diagonales
        int[] contadorFilas = new int[3];
        int[] contadorColumnas = new int[3];
        int contadorDiagonalPrincipal = 0;
        int contadorDiagonalSecundaria = 0;

        // Recorremos la matriz para contar y verificar posiciones
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String elemento = matriz[i][j];
                if (elemento.equals("X")) {
                    contadorX++;
                    contadorFilas[i]++;
                    contadorColumnas[j]++;
                    if (i == j) {
                        contadorDiagonalPrincipal++;
                    }
                    if (i + j == 2) {
                        contadorDiagonalSecundaria++;
                    }
                } else if (elemento.equals("O")) {
                    contadorO++;
                    contadorFilas[i]--;
                    contadorColumnas[j]--;
                    if (i == j) {
                        contadorDiagonalPrincipal--;
                    }
                    if (i + j == 2) {
                        contadorDiagonalSecundaria--;
                    }
                } else {
                    contadorVacios++;
                }
            }
        }

        // Verificamos si hay ganador en filas, columnas o diagonales
        for (int i = 0; i < 3; i++) {
            if (contadorFilas[i] == 3 || contadorColumnas[i] == 3) {
                return "X";
            } else if (contadorFilas[i] == -3 || contadorColumnas[i] == -3) {
                return "O";
            }
        }

        if (contadorDiagonalPrincipal == 3 || contadorDiagonalSecundaria == 3) {
            return "X";
        } else if (contadorDiagonalPrincipal == -3 || contadorDiagonalSecundaria == -3) {
            return "O";
        }

        // Verificamos si hay un empate
        if (contadorVacios == 0) {
            return "Empate";
        }

        // Verificamos si hay una proporción incorrecta de "X" y "O"
        if (Math.abs(contadorX - contadorO) > 1) {
            return "Nulo";
        }

        // Si no hay ganador ni empate, continuamos
        return "Ninguno";
    }
}
