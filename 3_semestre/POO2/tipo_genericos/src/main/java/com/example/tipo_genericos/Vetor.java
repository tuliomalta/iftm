package com.example.tipo_genericos;

public class Vetor<T> {
    private T[] vet;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public Vetor(int tamanho) {
        this.tamanho = tamanho;
        this.vet = (T[]) new Object[tamanho];
    }

    public T get(int i) {
        return vet[i];
    }

    public void set(int i, T valor) {
        vet[i] = valor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}

