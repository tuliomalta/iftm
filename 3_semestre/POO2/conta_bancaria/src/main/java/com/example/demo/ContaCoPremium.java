package com.example.demo;

public class ContaCoPremium extends ContaCo {
    private double cashBackPercentual;

    public ContaCoPremium(String titular, double saldo, double limiteChequeEspecial, double cashBackPercentual) {
        super(titular, saldo, limiteChequeEspecial);
        this.cashBackPercentual = cashBackPercentual;
    }

    @Override
    public boolean sacar(double valor) {
        boolean resultado = super.sacar(valor);
        if (resultado) {
            double cashback = valor * (cashBackPercentual / 100);
            saldo += cashback;
            return true;
        }
        return false;
    }

    public String exibeBeneficioPremium() {
        return String.format("Conta Corrente Premium com cashback de %.0f%% em cada saque.", cashBackPercentual);
    }
}

