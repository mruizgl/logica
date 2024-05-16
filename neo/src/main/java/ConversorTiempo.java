public class ConversorTiempo {

    /*
     * Crea una función que reciba días, horas, minutos y segundos (como enteros)
     * y retorne su resultado en milisegundos.
     */

    public static void main(String[] args) {
        int dias = 2;
        int horas = 12;
        int minutos = 30;
        int segundos = 45;

        long resultado = convertirAMilisegundos(dias, horas, minutos, segundos);
        System.out.println("El resultado en milisegundos es: " + resultado);
    }

    public static long convertirAMilisegundos(int dias, int horas, int minutos, int segundos) {
        // Convertir días, horas, minutos y segundos a milisegundos
        long totalMilisegundos = segundos * 1000L;
        totalMilisegundos += minutos * 60L * 1000L;
        totalMilisegundos += horas * 60L * 60L * 1000L;
        totalMilisegundos += dias * 24L * 60L * 60L * 1000L;

        return totalMilisegundos;
    }
}
