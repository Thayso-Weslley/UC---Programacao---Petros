package Classes;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void fazerAniversario() {
        idade++;
        System.out.println("Parabéns, " + nome + "! Agora você tem " + idade + " anos.");
    }   
}
