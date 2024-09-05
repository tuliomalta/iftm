import java.util.Scanner;

public class Func05 {

    public static double calcularVolume(double raio) {
        double pi = 3.1416;
        return (4.0 / 3.0) * pi * Math.pow(raio, 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();

        double volume = calcularVolume(raio);

        System.out.printf("Volume : %.2f%n", volume);

        sc.close();
    }

}
