package org.example;

public class Formacao {
    public String nivel;
    public boolean concluido;
    public String instituicao;
    public int ano;

    public Formacao(String nivel, boolean concluido, String instituicao, int ano) {
        this.nivel = nivel;
        this.concluido = concluido;
        this.instituicao = instituicao;
        this.ano = ano;
    }

    public String exibe() {
        return "CADASTRO \nNivel: " + nivel + "\nConcluído: " + concluido + "\nInstituição: " + instituicao + "\nAno: " + ano;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}