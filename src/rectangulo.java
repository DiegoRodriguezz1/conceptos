public class rectangulo extends Figuras {
    private double ancho, alto;

    public rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public rectangulo(double lado) {
        this.ancho = lado;
        this.alto = lado;
    }
    // redefinir el metodo de calcularArea() para el area de un cuadrado
    @Override
    public double calcularArea() {
        return ancho * alto;
    }

    // redefinir el metodo de calcularArea() para el area de un rectangulo
    @Override
    public double calcularPerimetro() {
        return (2 * ancho) + (2 * alto);
    }

    public boolean esCuadrado() {
        return ancho == alto;
    }
}
