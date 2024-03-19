package lista01;

import java.util.Scanner;

public class Media02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a, b, c, media;

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        media = ((a * 2) + (b * 3) + (c * 5)) / 10;

        System.out.println(String.format("MEDIA = %.1f", media));

        scanner.close();

    }
}
