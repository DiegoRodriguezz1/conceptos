// Diego Alejandro Rodriguez Hernandez S3G

public class main {
    public static void main(String[] args) {
        // Crear instancias de un círculo, un rectángulo y un cuadrado
        // Es necesario cambiar los valores manualmente para calcular su area y perimetro
        circulo circulo = new circulo(5);
        rectangulo rectangulo = new rectangulo(4, 6);
        rectangulo cuadrado = new rectangulo(4);

        // Array de figuras
        Figuras[] figuras = { circulo, rectangulo, cuadrado };
        
        System.out.println(" [+] Calculadora de área y perímetro [+] \n");
        // Recorrer el arreglo y aplicar polimorfismo
        for (Figuras figura : figuras) {
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
            verificarYMostrarTipo(figura);
            System.out.println("- - - - - - - - - - - - - -");
        }
    }

    private static void verificarYMostrarTipo(Figuras figura) {
        if (figura instanceof rectangulo) {
            verificarSiEsCuadrado((rectangulo) figura);
        } else if (figura instanceof circulo) {
            System.out.println("La figura es un Círculo.");
        }
    }

    private static void verificarSiEsCuadrado(rectangulo rect) {
        if (rect.esCuadrado()) {
            System.out.println("La figura es un Cuadrado.");
        } else {
            System.out.println("La figura es un Rectángulo.");
        }
    }
}
