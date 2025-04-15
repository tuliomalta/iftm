package org.example.atividade_polimorfismo;

public class Motor extends Parte {
    float potencia;
    float corrente;
    int rpm;

    public Motor(int cod, String nome, String descricao, float valor, float potencia, float corrente, int rpm) {
        super(cod, nome, descricao, valor);
        this.potencia = potencia;
        this.corrente = corrente;
        this.rpm = rpm;
    }

    @Override
    public float calculaValor() {
        return valor;
    }

    @Override
    public String toString() {
        return String.format("codigo:%d nome:%s descricao:%s valor:%.1f potencia:%.1f corrente:%.1f rpm:%d",
                cod, nome, descricao, valor, potencia, corrente, rpm);
    }
}


