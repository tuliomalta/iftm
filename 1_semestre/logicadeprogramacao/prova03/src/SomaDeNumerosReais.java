import java.util.Scanner;

public class SomaDeNumerosReais {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        int quantidadeNumeros = 0;

        while (true) {

//            System.out.print("Digite quantos números positivos quiser, e para encerra digite um negativo: ");

            double numero = scanner.nextDouble();

            if (numero < 0) {
                break;
            }

            soma += numero;
            quantidadeNumeros++;

        }

        System.out.printf("Soma = %.2f\n", soma);
        System.out.printf("Quantidade = %d\n", quantidadeNumeros);

    }
}
