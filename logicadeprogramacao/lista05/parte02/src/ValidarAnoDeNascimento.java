import java.util.Scanner;

public class ValidarAnoDeNascimento {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int ano = scanner.nextInt();

            if (ano >= 1900 && ano <= 2023) {
                System.out.println(ano);
                break;
            } else {
                System.out.println("Ano invalido");
            }
        }

        scanner.close();

    }
}
