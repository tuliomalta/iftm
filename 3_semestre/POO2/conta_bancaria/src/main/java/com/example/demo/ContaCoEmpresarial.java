package com.example.demo;

public class ContaCoEmpresarial extends ContaCo {
    private double taxaJurosEmprestimo;

    public ContaCoEmpresarial(String titular, double saldo, double limiteChequeEspecial, double taxaJurosEmprestimo) {
        super(titular, saldo, limiteChequeEspecial);
        this.taxaJurosEmprestimo = taxaJurosEmprestimo;
    }

    public boolean solicitaEmprestimo(double valor) {
        if (saldo + getLimiteChequeEspecial() >= valor) {
            saldo += valor;
            return true;
        }
        return false;
    }

    @Override
    public String exibeSaldo() {
        return String.format("Saldo da conta empresarial de %s: R$ %.2f", titular, saldo);
    }
}
