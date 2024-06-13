public class Teste {
    public static void main(String[] args) {
        int i = 1000;
        int soma = 0;
        while (i > 0) {
            soma = soma + i;
            System.out.println("Imprima soma " + soma);
            i = i - 1;
            System.out.println("Imprima o número " + i);
        }
    }
}
