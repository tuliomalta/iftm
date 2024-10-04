import java.util.Scanner;

public class Funcionarios {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalIdade = 0;
        double totalSalario = 0;
        int count = 0;
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;
        double mulheresAcima3000 = 0;

        while (true) {
            int idade = scanner.nextInt();
            char sexo = scanner.next().charAt(0);
            double salario = scanner.nextDouble();
            char continuar = scanner.next().charAt(0);

            if (idade < 0 || salario < 0) {
                System.out.println("Entrada inválida.");
                continue;
            }

            totalIdade += idade;
            totalSalario += salario;
            count++;

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (idade < menorIdade) {
                menorIdade = idade;
            }
            if (sexo == 'f' && salario > 3000) {
                mulheresAcima3000++;
            }

            if (continuar == 'n') {
                break;
            }
        }

        if (count > 0) {
            double mediaSalario = totalSalario / count;
            System.out.printf("Media salarios = R$ %.2f%n", mediaSalario);
            System.out.println("Menor e maior idade = " + menorIdade + " e " + maiorIdade);
            System.out.println("Salarios de mulheres acima de 3000 = R$ " + mulheresAcima3000);
        } else {
            System.out.println("Nenhum dado foi inserido.");
        }

        scanner.close();

    }
}
