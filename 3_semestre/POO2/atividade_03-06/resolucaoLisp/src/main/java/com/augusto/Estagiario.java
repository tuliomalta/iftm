package com.augusto;

public class Estagiario implements FuncionarioEstagiario {
    private double bolsaAuxilio;
    private String instituicaoEnsino;

    public Estagiario(double bolsaAuxilio) {
        this.bolsaAuxilio = bolsaAuxilio;
    }

    @Override
    public String getCargo() {
        return "Estagiário";
    }

    @Override
    public double calculaSalario() {
        return bolsaAuxilio;
    }

    @Override
    public void setInstituicaoEnsino(String instituicao) {
        this.instituicaoEnsino = instituicao;
    }

    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }
}