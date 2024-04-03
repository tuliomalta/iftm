import java.util.Scanner;

public class Validacaodeumnumeroreal {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double entrada = s.nextDouble();

        if (entrada>=0.0 && entrada<=200.0) {
            System.out.println("Valido");
        } else {
            System.out.println("Invalido");
        }

        s.close();

    }
}
