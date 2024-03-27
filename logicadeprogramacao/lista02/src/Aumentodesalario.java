import java.util.Scanner;

public class Aumentodesalario {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double salarioAntigo = s.nextDouble();

        if (salarioAntigo >= 0.00 && salarioAntigo <= 400.00) {
            double novoSalario = salarioAntigo + (salarioAntigo * 0.15);
            double reajuste = novoSalario - salarioAntigo;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 15 %");
        } else if (salarioAntigo >= 400.01 && salarioAntigo <= 800.00) {
            double novoSalario = salarioAntigo + (salarioAntigo * 0.12);
            double reajuste = novoSalario - salarioAntigo;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 12 %");
        } else if (salarioAntigo >= 800.01 && salarioAntigo <= 1200.00) {
            double novoSalario = salarioAntigo + (salarioAntigo * 0.10);
            double reajuste = novoSalario - salarioAntigo;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 10 %");
        } else if (salarioAntigo >= 1200.01 && salarioAntigo <= 2000.00) {
            double novoSalario = salarioAntigo + (salarioAntigo * 0.07);
            double reajuste = novoSalario - salarioAntigo;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 7 %");
        } else if (salarioAntigo > 2000.00) {
            double novoSalario = salarioAntigo + (salarioAntigo * 0.04);
            double reajuste = novoSalario - salarioAntigo;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 4 %");
        }

        s.close();
    }
}
