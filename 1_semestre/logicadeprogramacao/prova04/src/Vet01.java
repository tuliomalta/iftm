import java.util.Scanner;

public class Vet01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] vetor1 = new int[n];
        int[] vetor2 = new int[n];

        for (int i = 0; i < n; i++) {
            vetor1[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            vetor2[i] = scanner.nextInt();
        }

        int[] produto = new int[n];
        for (int i = 0; i < n; i++) {
            produto[i] = vetor1[i] * vetor2[i];
        }

        System.out.print("{");
        for (int i = 0; i < n; i++) {
            System.out.print(produto[i]);
            if (i < n - 1) {
                System.out.print(",");
            }
        }
        System.out.println("}");
    }
}
