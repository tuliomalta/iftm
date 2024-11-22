package org.example;

import java.util.Scanner;

public class TratarData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();
        String d = data.substring(0, 2);

        System.out.println("Estamos no dia " + d + " do mês.");

        scanner.close();
    }
}
