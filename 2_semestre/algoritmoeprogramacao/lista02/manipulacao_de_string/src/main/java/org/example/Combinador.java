package org.example;

import java.util.Scanner;

public class Combinador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            String str1 = scanner.next();
            String str2 = scanner.next();
            StringBuilder result = new StringBuilder();

            int length = Math.min(str1.length(), str2.length());

            for (int j = 0; j < length; j++) {
                result.append(str1.charAt(j));
                result.append(str2.charAt(j));
            }

            if (str1.length() > str2.length()) {
                result.append(str1.substring(length));
            } else {
                result.append(str2.substring(length));
            }

            System.out.println(result.toString());
        }

        scanner.close();
    }
}
