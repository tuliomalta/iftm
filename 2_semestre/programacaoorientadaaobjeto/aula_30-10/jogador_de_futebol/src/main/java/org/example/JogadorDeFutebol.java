package org.example;

import java.time.LocalDateTime;

public class JogadorDeFutebol {
    private String nome;
    public String posicao;
    public int anoDeNascimento;
    public String nacionalidade;
    public double altura;
    public double peso;

    public JogadorDeFutebol(String nome, String posicao, int anoDeNascimento, String nacionalidade,
                            double altura, double peso) {
        this.nome = nome;
        this.posicao = posicao;
        this.anoDeNascimento = anoDeNascimento;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }

    public static int calculaIdade(int anoDeNascimento) {
        int anoAtual = LocalDateTime.now().getYear();
        return  anoAtual - anoDeNascimento;
    }

    public String exibe() {
        return "Cadastro Jogador \nNome: " + nome + "\nPosição: " + posicao + "\nAno de Nascimento: " +
                anoDeNascimento + "\nNacionalidade: " + nacionalidade + "\nAltura: " + altura + "\nPeso: " + peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(int anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}

