package com.example.demo;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {}

    public boolean sacar(double valor) {
        return false;
    }

    public String exibeSaldo() {
        return "";
    }
}
