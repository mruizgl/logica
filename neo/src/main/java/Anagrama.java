public class Anagrama {
    public static void main(String[] args) {
        System.out.println(sonAnagramas("amor", "roma"));
        System.out.println(sonAnagramas("hola", "adios"));
        System.out.println(sonAnagramas("ratón", "tóran"));
        System.out.println(sonAnagramas("amor", "amor"));
    }

    public static boolean sonAnagramas(String palabra1, String palabra2) {
        if (palabra1.equals(palabra2)) {
            return false;
        }

        if (palabra1.length() != palabra2.length()) {
            return false;
        }

        char[] arrayPalabra1 = palabra1.toCharArray();
        char[] arrayPalabra2 = palabra2.toCharArray();

        java.util.Arrays.sort(arrayPalabra1);
        java.util.Arrays.sort(arrayPalabra2);

        return java.util.Arrays.equals(arrayPalabra1, arrayPalabra2);
    }
}
