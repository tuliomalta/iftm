import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        double a, b, c;

        a = le();
        b = le();
        c = le();

        EquacaoSegundoGrau equacao = new EquacaoSegundoGrau(a, b, c);

        double delta = equacao.delta();

        if (delta > 0) {
            double x1 = equacao.x1();
            double x2 = equacao.x2();
            exibe(x1, x2, delta);
        } else if (delta == 0) {
            double x1 = equacao.x1();
            System.out.println("x1 = " + x1);
        } else {
            System.out.println("Não existe raiz real");
        }
    }

    public static double le() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        return scanner.nextDouble();
    }

    public static void exibe(double x1, double x2, double delta) {
        System.out.println("Delta = " + delta);
        System.out.println("X1 = " + x1 + " \nX2 = " + x2);
    }
}
