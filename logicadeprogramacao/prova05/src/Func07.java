import java.util.Scanner;

public class Func07 {

    public static void preencherVetor(int[] vetor, Scanner s) {

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = s.nextInt();
        }

    }

    public static int[] somaVetores(int[] x, int[] y) {

        int[] soma = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            soma[i] = x[i] + y[i];
        }
        return soma;

    }

    public static int[] multiplicaVetores(int[] x, int[] y) {

        int[] produto = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            produto[i] = x[i] * y[i];
        }
        return produto;

    }

    public static void imprimirVetor(int[] vetor, String mensagem) {
        System.out.print(mensagem + " : {");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        preencherVetor(x, s);

        preencherVetor(y, s);

        int[] soma = somaVetores(x, y);
        int[] produto = multiplicaVetores(x, y);

        imprimirVetor(soma, "Soma");
        imprimirVetor(produto, "Produto");

        s.close();
    }
}

