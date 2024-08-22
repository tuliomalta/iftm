import java.util.Scanner;

public class Vet03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            vetor[i] = scanner.nextInt();
        }

        int contarPares = 0;

        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                contarPares++;
            }
        }

        System.out.println(contarPares);

        boolean first = true;

        System.out.print("{");

        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                if (!first) {
                    System.out.print(";");
                }
                System.out.print(vetor[i]);
                first = false;
            }
        }
        System.out.println("}");

        scanner.close();
    }
}