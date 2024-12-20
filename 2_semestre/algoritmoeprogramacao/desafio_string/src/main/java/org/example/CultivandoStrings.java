package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CultivandoStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            scanner.nextLine();
            if (n == 0) break;

            String[] strings = new String[n];
            for (int i = 0; i < n; i++) {
                strings[i] = scanner.nextLine();
            }

            Arrays.sort(strings, Comparator.comparingInt(String::length));

            int[] dp = new int[n];
            Arrays.fill(dp, 1);

            int maxSequenceLength = 1;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (isSubstring(strings[j], strings[i])) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    }
                }
                maxSequenceLength = Math.max(maxSequenceLength, dp[i]);
            }

            System.out.println(maxSequenceLength);
        }

        scanner.close();
    }

    private static boolean isSubstring(String s1, String s2) {
        return s2.contains(s1);
    }
}
