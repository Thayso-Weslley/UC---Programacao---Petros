import Classes.Retangulo;

public class POO_04 {
    public static void main(String[] args) {
        Retangulo meuRetangulo = new Retangulo(5, 3);
        System.out.println("Área do retângulo: " + meuRetangulo.calcularArea());
        System.out.println("Perímetro do retângulo: " + meuRetangulo.calcularPerimetro());
    }
}
