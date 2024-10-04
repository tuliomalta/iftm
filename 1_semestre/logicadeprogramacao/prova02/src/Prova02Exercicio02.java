import java.util.Scanner;

public class Prova02Exercicio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantos números serão inseridos: ");

        int n = scanner.nextInt();

        int contagemNegativos = 0;

        System.out.println("Digite quaisquer números inteiros:");

        for (int i = 0; i < n; i++) {
            int entrada = scanner.nextInt();
            if (entrada < 0) {
                contagemNegativos++;
            }
        }

        System.out.println("A quantidade de números negativos é " + contagemNegativos + ".");
    }
}
