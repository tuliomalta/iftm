import java.util.Scanner;

public class Coordenadasdeumponto {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String localizacao = "";

        double x = s.nextDouble();
        double y = s.nextDouble();

        if (x == 0.0 && y == 0.0) {
            localizacao = "Origem";
        } else if (x >= 0.1 && y >= 0.1) {
            localizacao = "Q1";
        } else if (x <= -0.1 && y >= 0.1) {
            localizacao = "Q2";
        } else if (x <= -0.1 && y <= -0.1) {
            localizacao = "Q3";
        } else if (x >= 0.1 && y <= -0.1) {
            localizacao = "Q4";
        } else if (x == 0.0) {
            localizacao = "Eixo Y";
        } else if (y == 0.0) {
            localizacao = "Eixo X";
        }

        System.out.println(localizacao);

        s.close();

    }
}
