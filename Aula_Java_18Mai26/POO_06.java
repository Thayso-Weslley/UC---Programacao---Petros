import Classes.Circulo;

public class POO_06 {
    public static void main(String[] args) {
        Circulo meuCirculo = new Circulo(4);
        System.out.println("Área do círculo: " + meuCirculo.calcularArea());
        System.out.println("Circunferência do círculo: " + meuCirculo.calcularPerimetro());
    }
}
