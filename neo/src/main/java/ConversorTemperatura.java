public class ConversorTemperatura {
    /*
     * Crea una función que transforme grados Celsius en Fahrenheit
     * y viceversa.
     *
     * - Para que un dato de entrada sea correcto debe poseer un símbolo "°"
     *   y su unidad ("C" o "F").
     * - En caso contrario retornará un error.
     */

    public static void main(String[] args) {
        String temperaturaCelsius = "25°C";
        String temperaturaFahrenheit = "77°F";

        try {
            double celsius = convertirACelsius(temperaturaCelsius);
            System.out.println(temperaturaCelsius + " es equivalente a " + celsius + "°C");

            double fahrenheit = convertirAFahrenheit(temperaturaFahrenheit);
            System.out.println(temperaturaFahrenheit + " es equivalente a " + fahrenheit + "°F");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static double convertirACelsius(String temperatura) {
        if (!temperatura.matches("-?\\d+(\\.\\d+)?°C")) {
            throw new IllegalArgumentException("La temperatura ingresada no es válida.");
        }
        double valor = Double.parseDouble(temperatura.replaceAll("[^0-9.-]", ""));
        return (valor - 32) * 5 / 9;
    }

    public static double convertirAFahrenheit(String temperatura) {
        if (!temperatura.matches("-?\\d+(\\.\\d+)?°F")) {
            throw new IllegalArgumentException("La temperatura ingresada no es válida.");
        }
        double valor = Double.parseDouble(temperatura.replaceAll("[^0-9.-]", ""));
        return valor * 9 / 5 + 32;
    }
}
