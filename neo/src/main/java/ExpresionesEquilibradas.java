public class ExpresionesEquilibradas {
    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "defghi";

        imprimirCaracteresDiferentes(str1, str2);
    }

    public static void imprimirCaracteresDiferentes(String str1, String str2) {
        StringBuilder out1 = new StringBuilder();
        StringBuilder out2 = new StringBuilder();

        for (char c : str1.toCharArray()) {
            if (str2.indexOf(c) == -1) {
                out1.append(c);
            }
        }

        for (char c : str2.toCharArray()) {
            if (str1.indexOf(c) == -1) {
                out2.append(c);
            }
        }

        System.out.println("Caracteres en str1 pero no en str2: " + out1.toString());
        System.out.println("Caracteres en str2 pero no en str1: " + out2.toString());
    }
}
