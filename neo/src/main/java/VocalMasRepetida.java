import java.util.HashMap;
import java.util.Map;

public class VocalMasRepetida {
    /*
     * Crea un función que reciba un texto y retorne la vocal que
     * más veces se repita.
     * - Ten cuidado con algunos casos especiales.
     * - Si no hay vocales podrá devolver vacío.
     */

    public static void main(String[] args) {
        String texto = "Esta es una frase de ejemplo";
        char vocalMasRepetida = encontrarVocalMasRepetida(texto);
        if (vocalMasRepetida != ' ') {
            System.out.println("La vocal que más se repite es: " + vocalMasRepetida);
        } else {
            System.out.println("No se encontraron vocales en el texto.");
        }
    }

    public static char encontrarVocalMasRepetida(String texto) {
        texto = texto.toLowerCase();

        Map<Character, Integer> frecuenciaVocales = new HashMap<>();
        frecuenciaVocales.put('a', 0);
        frecuenciaVocales.put('e', 0);
        frecuenciaVocales.put('i', 0);
        frecuenciaVocales.put('o', 0);
        frecuenciaVocales.put('u', 0);

        for (char caracter : texto.toCharArray()) {
            if (frecuenciaVocales.containsKey(caracter)) {
                frecuenciaVocales.put(caracter, frecuenciaVocales.get(caracter) + 1);
            }
        }

        char vocalMasRepetida = ' ';
        int maxFrecuencia = 0;
        for (Map.Entry<Character, Integer> entry : frecuenciaVocales.entrySet()) {
            if (entry.getValue() > maxFrecuencia) {
                vocalMasRepetida = entry.getKey();
                maxFrecuencia = entry.getValue();
            }
        }

        return vocalMasRepetida;
    }
}
