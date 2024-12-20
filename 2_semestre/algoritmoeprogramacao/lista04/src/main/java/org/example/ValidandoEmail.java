package org.example;


import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidandoEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String emailRegex = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(emailRegex);

        String input = scanner.nextLine();

        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("Email válido");
        } else {
            System.out.println("Email inválido");
        }

        scanner.close();
    }
}
