package org.example.heranca01;

import org.example.testprotected.Pessoa;

public class Funcionario extends Pessoa {

    private double salario;
    private int anoAdmissao;
    private String cargo;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, int anoNascimento, double salario, int anoAdmissao, String cargo) {
        super(nome, cpf, anoNascimento);
        this.salario = salario;
        this.anoAdmissao = anoAdmissao;
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAnoAdmissao() {
        return anoAdmissao;
    }

    public void setAnoAdmissao(int anoAdmissao) {
        this.anoAdmissao = anoAdmissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
