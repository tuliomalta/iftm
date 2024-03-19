package lista01;

import java.util.Scanner;

public class Media01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double A, B, MEDIA;

        A = scanner.nextDouble();
        B = scanner.nextDouble();

        MEDIA = ((A*3.5) + (B*7.5))/11;

        System.out.println(String.format("MEDIA = %.5f", MEDIA));

        scanner.close();

    }
}
