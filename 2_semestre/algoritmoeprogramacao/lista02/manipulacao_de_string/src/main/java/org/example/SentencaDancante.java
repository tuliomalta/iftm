package org.example;

import java.util.Scanner;

public class SentencaDancante {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String sentence = scanner.nextLine();
            StringBuilder result = new StringBuilder();
            boolean isUpper = true;

            for (int i = 0; i < sentence.length(); i++) {
                char ch = sentence.charAt(i);

                if (ch == ' ') {
                    result.append(' ');
                } else {
                    if (isUpper) {
                        result.append(Character.toUpperCase(ch));
                    } else {
                        result.append(Character.toLowerCase(ch));
                    }
                    isUpper = !isUpper;
                }
            }

            System.out.println(result.toString());
        }

        scanner.close();
    }
}
