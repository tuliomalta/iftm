import java.util.Scanner;

public class QuadradoDePares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        if (N <= 5 || N >= 2000) {
            System.out.println("O valor de N deve estar entre 5 e 2000.");
            return;
        }

        for (int i = 2; i <= N; i += 2) {
            int quadrado = i * i;
            System.out.println(i + "^2 = " + quadrado);
        }

        scanner.close();
    }
}
