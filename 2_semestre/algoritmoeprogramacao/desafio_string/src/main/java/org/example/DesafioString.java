package org.example;

import java.util.Scanner;

public class DesafioString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String deciphered = decipherLine(input);
            System.out.println(deciphered);
        }
    }

    private static String decipherLine(String input) {
        int mid = input.length() / 2;
        String leftHalf = new StringBuilder(input.substring(0, mid)).reverse().toString();
        String rightHalf = new StringBuilder(input.substring(mid)).reverse().toString();
        return leftHalf + rightHalf;
    }
}