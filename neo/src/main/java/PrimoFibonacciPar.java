public class PrimoFibonacciPar {

    /*
     * Escribe un programa que, dado un número, compruebe y muestre si es primo,
     * fibonacci y par.
     * Ejemplos:
     * - Con el número 2, nos dirá: "2 es primo, fibonacci y es par"
     * - Con el número 7, nos dirá: "7 es primo, no es fibonacci y es impar"
     */

    public static void main(String[] args) {
        int numero = 13; // Puedes cambiar este número para probar diferentes valores
        String resultado = verificarPropiedades(numero);
        System.out.println(numero + " " + resultado);
    }

    public static String verificarPropiedades(int numero) {
        String resultado = "";

        if (esPrimo(numero)) {
            resultado += "primo";
        } else {
            resultado += "no es primo";
        }

        if (esFibonacci(numero)) {
            if (!resultado.isEmpty()) {
                resultado += ", ";
            }
            resultado += "fibonacci";
        } else {
            if (!resultado.isEmpty()) {
                resultado += ", ";
            }
            resultado += "no es fibonacci";
        }


        if (numero % 2 == 0) {
            if (!resultado.isEmpty()) {
                resultado += " y es par";
            } else {
                resultado += "es par";
            }
        } else {
            if (!resultado.isEmpty()) {
                resultado += " y es impar";
            } else {
                resultado += "es impar";
            }
        }

        return resultado;
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

    public static boolean esFibonacci(int numero) {
        return esCuadradoPerfecto(5 * numero * numero + 4) || esCuadradoPerfecto(5 * numero * numero - 4);
    }

    public static boolean esCuadradoPerfecto(int numero) {
        int raiz = (int) Math.sqrt(numero);
        return raiz * raiz == numero;
    }
}
