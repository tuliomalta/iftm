package com.example.demo;

public class ContaCo extends ContaBancaria {

    private double limiteChequeEspecial;

    public ContaCo(String titular, double saldo, double limiteChequeEspecial) {
        super(titular, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public boolean sacar(double valor) {

    }

    public String exibeLimiteChequeEspecial() {
        return "";
    }


}
