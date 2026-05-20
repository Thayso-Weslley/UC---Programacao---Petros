import Classes.ContaBancaria;

public class POO_03 {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("12345-6", 1000.00);
        minhaConta.depositar(500.00);
        minhaConta.sacar(200.00);
    }
}
