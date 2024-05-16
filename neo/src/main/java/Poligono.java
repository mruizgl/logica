public class Poligono {
    /*
     * Crea una única función (importante que sólo sea una) que sea capaz
     * de calcular y retornar el área de un polígono.
     * - La función recibirá por parámetro sólo UN polígono a la vez.
     * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
     * - Imprime el cálculo del área de un polígono de cada tipo.
     */
    public static void main(String[] args) {
        // Crear instancias de cada tipo de polígono con dimensiones de ejemplo
        double baseTriangulo = 5;
        double alturaTriangulo = 10;
        double ladoCuadrado = 4;
        double baseRectangulo = 6;
        double alturaRectangulo = 8;

        // Calcular y mostrar el área de cada polígono
        System.out.println("Área del triángulo: " + calcularArea(baseTriangulo, alturaTriangulo, "triangulo"));
        System.out.println("Área del cuadrado: " + calcularArea(ladoCuadrado, ladoCuadrado, "cuadrado"));
        System.out.println("Área del rectángulo: " + calcularArea(baseRectangulo, alturaRectangulo, "rectangulo"));
    }

    // Función para calcular el área de un polígono
    public static double calcularArea(double dimension1, double dimension2, String tipoPoligono) {
        switch (tipoPoligono.toLowerCase()) {
            case "triangulo":
                return (dimension1 * dimension2) / 2;
            case "cuadrado":
                return dimension1 * dimension1;
            case "rectangulo":
                return dimension1 * dimension2;
            default:
                throw new IllegalArgumentException("Tipo de polígono no soportado: " + tipoPoligono);
        }
    }
}
