import java.util.Scanner;

public class Vet02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            vetor[i] = scanner.nextInt();
        }

        int x = scanner.nextInt();

        for (int i = 0; i < n; i += x) {
            System.out.println("Pos[" + i + "] = " + vetor[i]);
        }

        scanner.close();
    }
}
