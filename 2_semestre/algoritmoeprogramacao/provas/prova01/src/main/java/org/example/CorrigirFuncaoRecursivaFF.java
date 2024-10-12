package org.example;

import java.util.Scanner;

public class CorrigirFuncaoRecursivaFF {

    private static int funcaoFF(int n) {

        if (n <= 1) {
            return 1;
        } else if (n % 2 == 0) {
            return funcaoFF(n / 2);
        } else {
            return funcaoFF((n - 1) / 2) + funcaoFF((n + 1) / 2);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("ff(" + n + ") = " + funcaoFF(n));
        s.close();

    }
}
