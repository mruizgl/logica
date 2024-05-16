public class Obstaculos {

    public static void main(String[] args) {
        String[] acciones = {"run", "jump", "run", "run", "jump"};
        String pista = "_|_|_|_|_";

        boolean exito = evaluarCarrera(acciones, pista);

        if (exito) {
            System.out.println("El atleta ha superado correctamente la carrera.");
        } else {
            System.out.println("El atleta no ha superado correctamente la carrera.");
        }
    }

    public static boolean evaluarCarrera(String[] acciones, String pista) {
        char[] pistaArray = pista.toCharArray();

        for (int i = 0; i < acciones.length; i++) {
            char obstaculo = pistaArray[i * 2 + 1]; // Obstáculo en la posición impar
            String accion = acciones[i];

            if (accion.equals("run")) {
                // Si el atleta corre en una valla, cambia la valla por "/"
                if (obstaculo == '|') {
                    pistaArray[i * 2 + 1] = '/';
                }
            } else if (accion.equals("jump")) {
                // Si el atleta salta en el suelo, marca el suelo como "x"
                if (obstaculo == '_') {
                    pistaArray[i * 2 + 1] = 'x';
                }
            }
        }

        // Imprimir la pista modificada
        System.out.println("Pista después de la carrera: " + new String(pistaArray));

        // Verificar si el atleta ha superado correctamente la carrera
        for (char obstaculo : pistaArray) {
            if (obstaculo == '|' || obstaculo == '_') {
                return false; // La carrera no ha sido superada correctamente
            }
        }

        return true; // La carrera ha sido superada correctamente
    }
}
