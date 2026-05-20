package Classes;

public class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void aplicarDesconto(double percentual) {
        preco -= preco * (percentual / 100);

        System.out.println("Desconto de " + percentual + "% aplicado. Novo preço: R$ " + preco);
    }
}
