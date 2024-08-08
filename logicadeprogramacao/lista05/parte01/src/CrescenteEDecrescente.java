import java.util.Scanner;

public class CrescenteEDecrescente {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            if (X == Y) {
                break;
            }

            if (X < Y) {
                System.out.println("Crescente");
            } else {
                System.out.println("Decrescente");
            }
        }

        scanner.close();

    }
}
