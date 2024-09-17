public class circulo extends Figuras {
    // Declarar variables
    private double radio;
    // Constante de pi
    private final double PI = 3.1416;

    // Constructor que inicializa el radio del círculo
    public circulo(double radio) {
        this.radio = radio;
    }

    // redefinir el método abstracto calcularArea() para calcular el área de un circulo
    @Override
    public double calcularArea() {
        // Fórmula del área del círculo: PI * radio^2
        return PI * Math.pow(radio, 2);
    }

    // redefinir el método abstracto calcularPerimetro() para calcular el perimetro del círculo
    @Override
    public double calcularPerimetro() {
        // Fórmula del perímetro del círculo
        return 2 * PI * radio;
    }
}
