import java.util.Scanner;

public class SequenciaDeNumerosESoma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            int M = scanner.nextInt();
            int N = scanner.nextInt();

            if (M <= 0 || N <= 0) {
                break;
            }

            int menor = Math.min(M, N);
            int maior = Math.max(M, N);

            int soma = 0;
            for (int i = menor; i <= maior; i++) {
                System.out.print(i + " ");
                soma += i;
            }

            System.out.println("Sum=" + soma);
        }

        scanner.close();

    }
}
