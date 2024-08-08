import java.util.Scanner;

public class ValidarSalarios {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            double nota = scanner.nextDouble();

            if ((nota >= 0 && nota <= 10) || (nota >= 100 && nota <= 200)) {
                System.out.println(nota);
                break;
            } else {
                System.out.println("nota invalida");
            }
        }

        scanner.close();

    }
}
