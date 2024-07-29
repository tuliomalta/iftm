import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bazinga {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        scanner.nextLine();

        for (int t = 1; t <= T; t++) {
            String[] escolhas = scanner.nextLine().split(" ");
            String sheldon = escolhas[0];
            String raj = escolhas[1];

            String resultado;

            if (sheldon.equals(raj)) {
                resultado = "De novo!";
            } else if (vencedor(sheldon, raj)) {
                resultado = "Bazinga!";
            } else {
                resultado = "Raj trapaceou!";
            }

            System.out.println("Caso #" + t + ": " + resultado);
        }

        scanner.close();
    }

    private static boolean vencedor(String sheldon, String raj) {
        switch (sheldon) {
            case "tesoura":
                return raj.equals("papel") || raj.equals("lagarto");
            case "papel":
                return raj.equals("pedra") || raj.equals("spock");
            case "pedra":
                return raj.equals("lagarto") || raj.equals("tesoura");
            case "lagarto":
                return raj.equals("spock") || raj.equals("papel");
            case "spock":
                return raj.equals("tesoura") || raj.equals("pedra");
            default:
                return false;
        }
    }
}
