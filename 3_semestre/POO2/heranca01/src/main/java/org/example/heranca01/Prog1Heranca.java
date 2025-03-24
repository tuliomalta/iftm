package org.example.heranca01;

import org.example.testprotected.Pessoa;

public class Prog1Heranca {
    public static void main(String[] args) {
        Aluno al = new Aluno("Jose Francisco", "123.456.789-00", 1988, 123456);

        Pessoa p = new Pessoa("Maria Joana", "987.654.321-00", 1990);

        System.out.println("RESULTADO\n\nNome: " + al.getNome());
        System.out.println("CPF: " + al.getCpf());
        System.out.println("Data de nascimento: " + al.getAnoNascimento());
        System.out.println("Matrícula: " + al.getMatricula());

        System.out.println("RESULTADO\n\nNome: " + p.getNome());
        System.out.println("CPF: " + p.cpf);
        System.out.println("Data de nascimento: " + p.anoNascimento);

    }
}
