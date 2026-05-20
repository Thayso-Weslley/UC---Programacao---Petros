public class Ex07 {
    public static void main(String[] args){
        int numero1 = 5, numero2 = 7, numero3 = 3;

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("O maior número é: " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O maior número é: " + numero2);
        } else {
            System.out.println("O maior número é: " + numero3);
        }
    }
}
