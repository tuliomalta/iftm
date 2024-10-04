import java.util.Scanner;

public class MaiorEPosição {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] valores = new int[100];

        for (int i = 0; i < 100; i++) {
            valores[i] = scanner.nextInt();
        }

        int maiorValor = valores[0];
        int posicaoMaiorValor = 0;

        for (int i = 1; i < 100; i++) {
            if (valores[i] > maiorValor) {
                maiorValor = valores[i];
                posicaoMaiorValor = i;
            }
        }

        System.out.println(maiorValor);
        System.out.println(posicaoMaiorValor + 1);

        scanner.close();

    }
}
