import java.util.Scanner;

public class AlarmeDespertador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int H1 = scanner.nextInt();
            int M1 = scanner.nextInt();
            int H2 = scanner.nextInt();
            int M2 = scanner.nextInt();

            if (H1 == 0 && M1 == 0 && H2 == 0 && M2 == 0) {
                break;
            }

            int minutosAtuais = H1 * 60 + M1;
            int minutosAlarme = H2 * 60 + M2;

            int duracao;
            if (minutosAlarme >= minutosAtuais) {
                duracao = minutosAlarme - minutosAtuais;
            } else {
                duracao = (1440 - minutosAtuais) + minutosAlarme;
            }

            System.out.println(duracao);
        }

        scanner.close();

    }
}
