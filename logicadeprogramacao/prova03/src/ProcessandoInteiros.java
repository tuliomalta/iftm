import java.util.Scanner;

public class ProcessandoInteiros {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //System.out.print("Digite um número alvo inteiro positivo: ");

        int numeroAlvo = s.nextInt();

        int soma = 0;
        int quantidadePares = 0;
        int quantidadeImpares = 0;
        int contador = 0;

        while (soma < numeroAlvo) {

            //System.out.print("Digite um número inteiro positivo qualquer: ");
            int numero = s.nextInt();

            if (numero <= 0) {
                //System.out.println("Por favor, insira um número inteiro positivo.");
                continue;
            }

            soma += numero;
            contador++;

            if (numero % 2 == 0) {
                quantidadePares++;
            } else {
                quantidadeImpares++;
            }
        }

        double media = (double) soma / contador;


        System.out.println("Pares = " + quantidadePares);
        System.out.println("Impares = " + quantidadeImpares);
        System.out.printf("Média = %.2f\n", media);

        s.close();
    }
}