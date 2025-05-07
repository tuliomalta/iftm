package org.example.treinamento_prova01;

import java.util.ArrayList;
import java.util.List;

public class Departamento<T extends Funcionario> {
    private String nome;
    private List<T> funcionarios;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(T funcionario) {
        funcionarios.add(funcionario);
    }

    public String listarFuncionario() {
        StringBuilder sb = new StringBuilder();
        sb.append("Departamento: ").append(nome).append("\n");
        for (T f : funcionarios) {
            sb.append(f.mostrarDados()).append("\n");
        }
        return sb.toString();
    }
}