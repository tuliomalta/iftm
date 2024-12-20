package org.example;

import java.util.Scanner;

public class AvanceAsLetras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < T; i++) {
            String A = scanner.next();
            String B = scanner.next();
            int operations = 0;

            for (int j = 0; j < A.length(); j++) {
                int diff = B.charAt(j) - A.charAt(j);
                if (diff < 0) {
                    diff += 26;
                }
                operations += diff;
            }

            System.out.println(operations);
        }

        scanner.close();
    }
}
