import java.util.Scanner;

public class Prova02Exercicio01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantos números serão inseridos: ");

        int n = scanner.nextInt();

        int maior = Integer.MIN_VALUE;

        System.out.println("Digite quaisquer números inteiros: ");

        for (int i = 0; i < n; i++) {
            int entrada = scanner.nextInt();
            if (entrada > maior) {
                maior = entrada;

            }
        }

        System.out.println("O maior número inserido é " + maior + ".");

    }
}