package com.augusto;

public class FolhaPagamento {
    protected double saldo;

    public double calcular(Remuneravel remuneravel) {
        saldo += remuneravel.remuneracao();
        return saldo;
    }
}
