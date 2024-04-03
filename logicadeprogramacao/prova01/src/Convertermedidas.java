import java.util.Scanner;

public class Convertermedidas {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int medida = s.nextInt();

        int centimetros = medida * 100;

        int milimetros = medida * 1000;

        double quilometros = (double) medida / 1000;

        double milhas = (double) medida / 1609;

        System.out.println(medida + " metros");
        System.out.println(centimetros + " centímetros");
        System.out.println(milimetros + " milímetros");
        System.out.printf("%.4f quilômetros\n", quilometros);
        System.out.printf("%.4f milhas\n", milhas);

        s.close();

    }
}
