import java.util.Scanner;

public class Impostoderenda {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double imposto01 = 0, imposto02 = 0, imposto03 = 0;
        double impostoGeral = 0;
        double faixa01 = ((3000 - 2000.00) * 0.08);
        double faixa02 = ((4500 - 3000.00) * 0.18);
        String isento = "";


        double salario = s.nextDouble();

        if (salario <= 2000.00) {
            isento = "Isento";
        } else if (salario > 2000.00 && salario <= 3000.00) {
            imposto01 = (salario - 2000.00) * 0.08;
            impostoGeral = imposto01;
        } else if (salario > 3000.00 && salario <= 4500.00) {
            imposto02 = ((salario - 3000.00) * 0.18) + faixa01;
            impostoGeral = imposto02;
        } else if (salario > 4500.00) {
            imposto03 = ((salario - 4500.00) * 0.28) + faixa02 + faixa01;
            impostoGeral = imposto03;
        }

        if (impostoGeral > 0) {
            System.out.printf("R$ %.2f\n", impostoGeral);
        } else {
            System.out.println(isento);
        }
        s.close();
    }
}
