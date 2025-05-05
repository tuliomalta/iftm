package com.example.atividade_junit;


public class Funcionario {
    private String nome;
    private int horasTrabalhadas;
    private double valorHora;

    public static final double SALARIO_MINIMO = 1518.00;
    public static final double PAGAMENTO_MAXIMO = 100000.00;
    public static final int HORAS_MIN = 20;
    public static final int HORAS_MAX = 40;
    public static final double VALOR_HORA_MIN = SALARIO_MINIMO * 0.04; // 60.72
    public static final double VALOR_HORA_MAX = SALARIO_MINIMO * 0.10; // 151.80

    public Funcionario(String nome, int horasTrabalhadas, double valorHora) {
        setNome(nome);
        setHorasTrabalhadas(horasTrabalhadas);
        setValorHora(valorHora);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        this.nome = nome;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        if (horasTrabalhadas < HORAS_MIN || horasTrabalhadas > HORAS_MAX) {
            throw new IllegalArgumentException(
                    "O número de horas trabalhadas deve ser entre " + HORAS_MIN + " e " + HORAS_MAX + "."
            );
        }
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        if (valorHora < VALOR_HORA_MIN || valorHora > VALOR_HORA_MAX) {
            throw new IllegalArgumentException(
                    "O valor da hora deve ser entre 4% e 10% do salário mínimo."
            );
        }
        this.valorHora = valorHora;
    }

    /**
     * Calcula o pagamento básico e valida contra mínimo e teto.
     */
    public double calcularPagamento() {
        double pagamento = valorHora * horasTrabalhadas;
        if (pagamento < SALARIO_MINIMO) {
            throw new IllegalArgumentException("Pagamento inferior ao salário mínimo.");
        }
        if (pagamento > PAGAMENTO_MAXIMO) {
            throw new IllegalArgumentException("Pagamento acima do teto permitido.");
        }
        return pagamento;
    }
}

