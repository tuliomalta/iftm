package org.example;

import java.util.Scanner;

public class ObiUri {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String[] words = scanner.nextLine().split(" ");

        for (int i = 0; i < N; i++) {
            if (words[i].equals("OB") || words[i].equals("OBO")) {
                words[i] = "OBI";
            } else if (words[i].equals("UR") || words[i].equals("URU")) {
                words[i] = "URI";
            }
        }

        for (String word : words) {
            System.out.print(word + " ");
        }
        scanner.close();
    }
}
