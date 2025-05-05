package org.example.avaliacao_calculadora;

public class Calculadora {
    private int memoria;

    public Calculadora() {
        this.memoria = 0;
    }

    public Calculadora(int memoria) {
        this.memoria = memoria;
    }

    public int getMemoria() {
        return this.memoria;
    }

    public void zerarMemoria() {
        this.memoria = 0;
    }

    public void somar(int valor) {
        this.memoria += valor;
    }

    public void subtrair(int valor) {
        this.memoria -= valor;
    }

    public void multiplicar(int valor) {
        this.memoria *= valor;
    }

    public void dividir(int valor) throws Exception {
        if (valor == 0)
            throw new Exception("Divisão por zero!!!");
        this.memoria /= valor;
    }

    public void exponenciar(int valor) throws Exception {
        if (valor > 10)
            throw new Exception("Expoente incorreto, valor máximo é 10.");
        int base = this.memoria;
        int resultado = 1;
        for (int i = 0; i < valor; i++) {
            resultado *= base;
        }
        this.memoria = resultado;
    }
}
