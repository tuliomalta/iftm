import java.util.Scanner;

public class Vet04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            vetor[i] = scanner.nextInt();
        }

        for (int i = n - 1; i >= 0; i--) {
            if (vetor[i] < 0) {
                System.out.println(vetor[i]);
            }
        }

        scanner.close();

    }
}
