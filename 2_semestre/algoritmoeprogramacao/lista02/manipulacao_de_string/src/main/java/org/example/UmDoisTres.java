package org.example;

import java.util.Scanner;

public class UmDoisTres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            String word = scanner.nextLine();

            if (isCloseTo("one", word)) {
                System.out.println(1);
            } else if (isCloseTo("two", word)) {
                System.out.println(2);
            } else if (isCloseTo("three", word)) {
                System.out.println(3);
            }
        }

        scanner.close();
    }

    public static boolean isCloseTo(String target, String word) {
        int differences = 0;
        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) != word.charAt(i)) {
                differences++;
            }
        }
        return differences <= 1;
    }
}
