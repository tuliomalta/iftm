package org.example;

import java.util.Scanner;

public class Joulupukki {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            line = line.replaceAll("(?i)\\b[JS][ou]l[Uu]p[Uu]kk[Ii]\\b", "Joulupukki");
            line = line.replaceAll("(?i)\\b[JS][ou]l[Uu]p[Uu]kk[Ii]\\.", "Joulupukki.");
            System.out.println(line);
        }

        scanner.close();
    }
}
