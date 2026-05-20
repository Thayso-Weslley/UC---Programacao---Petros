public class Ex09 {
    public static void main(String[] args) {
        String nome = "Paralelepipedo";

        int vogais = 0;
        for (int i = 0; i < nome.length(); i++) {
            char letra = nome.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                vogais++;
            }
        }
        System.out.println("O nome " + nome + " possui " + vogais + " vogais.");
    }
}
