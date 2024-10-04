import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt();

            if (X == 0) {
                System.out.println("NULL");
            } else {
                // Verifica se o número é positivo ou negativo
                String sign = (X > 0) ? "POSITIVE" : "NEGATIVE";

                // Verifica se o número é par ou ímpar
                String parity = (X % 2 == 0) ? "EVEN" : "ODD";

                // Imprime a mensagem correspondente
                System.out.println(parity + " " + sign);
            }
        }

    }
}
