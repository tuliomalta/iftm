package recursividadeA;

import java.util.Scanner;

public class PreenchimentoDeVetorDois {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] n = new int[1000];

        preencherVetor(n, t, 0);

        for (int i = 0; i < n.length; i++) {
            System.out.println("N[" + i + "] = " + n[i]);
        }

        scanner.close();
    }

    public static void preencherVetor(int[] vetor, int t, int index) {
        if (index >= vetor.length) {
            return;
        }

        vetor[index] = index % t;
        preencherVetor(vetor, t, index + 1);
    }
}
