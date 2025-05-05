package com.example.atividade_junit;


public class FuncionarioTerceirizado extends Funcionario {
    private double despesaAdicional;
    public static final double DESPESA_MAX = 1000.00;

    public FuncionarioTerceirizado(String nome, int horasTrabalhadas, double valorHora, double despesaAdicional) {
        super(nome, horasTrabalhadas, valorHora);
        setDespesaAdicional(despesaAdicional);
    }

    public double getDespesaAdicional() {
        return despesaAdicional;
    }

    public void setDespesaAdicional(double despesaAdicional) {
        if (despesaAdicional < 0 || despesaAdicional > DESPESA_MAX) {
            throw new IllegalArgumentException("A despesa adicional não pode ultrapassar R$ 1000.00.");
        }
        this.despesaAdicional = despesaAdicional;
    }

    @Override
    public double calcularPagamento() {
        double pagamentoBase = super.getValorHora() * super.getHorasTrabalhadas();
        double bonus = this.despesaAdicional * 1.10;
        double total = pagamentoBase + bonus;
        if (total < SALARIO_MINIMO) {
            throw new IllegalArgumentException("Pagamento inferior ao salário mínimo.");
        }
        if (total > PAGAMENTO_MAXIMO) {
            throw new IllegalArgumentException("Pagamento acima do teto permitido.");
        }
        return total;
    }
}

