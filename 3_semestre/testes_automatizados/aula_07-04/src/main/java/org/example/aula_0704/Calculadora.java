package org.example.aula_0704;

public class Calculadora {

    public int somar(int num1, int num2) {
        return num1 + num2;
    }

    public int subtrair(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public int dividir(int num1, int num2) throws Exception {
        if (num2 == 0) {
            throw new DividirPorZeroException();
        }
        return num1 / num2;
    }
}
