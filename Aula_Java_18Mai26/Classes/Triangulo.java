package Classes;

public class Triangulo {
    int base, altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea() {
        double resultado = (base * altura) / 2;

        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área do triângulo: " + resultado);
    }
}
