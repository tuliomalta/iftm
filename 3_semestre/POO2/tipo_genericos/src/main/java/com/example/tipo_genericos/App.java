package com.example.tipo_genericos;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vetor<Pessoa> pessoas = new Vetor<>(3);
        Vetor<Cidade> cidades = new Vetor<>(4);

        pessoas.set(0, new Pessoa("Maria Aparecida Lemos", "F", "Uberlândia"));
        pessoas.set(1, new Pessoa("Félix Moreira", "M", "Cuiabá"));
        pessoas.set(2, new Pessoa("Jander Pereira Borges", "M", "Juazeiro do Norte"));

        cidades.set(0, new Cidade("Uruguaiana", "uruguaianense", "Rio Grande do Sul"));
        cidades.set(1, new Cidade("Uberlândia", "uberlandense", "Minas Gerais"));
        cidades.set(2, new Cidade("Cuiabá", "cuiabano/cuiabana", "Mato Grosso"));
        cidades.set(3, new Cidade("Manaus", "manauara", "Amazonas"));

        System.out.print("Digite o nome da pessoa: ");
        String nomeBusca = sc.nextLine();

        Pessoa encontrada = null;
        for (int i = 0; i < pessoas.getTamanho(); i++) {
            if (pessoas.get(i).getNome().equalsIgnoreCase(nomeBusca)) {
                encontrada = pessoas.get(i);
                break;
            }
        }

        if (encontrada != null) {
            String naturalidade = encontrada.getNaturalidade();
            Cidade cidadeEncontrada = null;
            for (int i = 0; i < cidades.getTamanho(); i++) {
                if (cidades.get(i).getNome().equalsIgnoreCase(naturalidade)) {
                    cidadeEncontrada = cidades.get(i);
                    break;
                }
            }

            if (cidadeEncontrada != null) {
                String genero = encontrada.getSexo().equalsIgnoreCase("F") ? "A" : "O";
                String[] adjetivos = cidadeEncontrada.getAdjetivo().split("/");
                String adjetivo = adjetivos[0];
                if (encontrada.getSexo().equalsIgnoreCase("F") && adjetivos.length > 1)
                    adjetivo = adjetivos[1];

                System.out.printf("%s %s nasceu em %s - %s.\n",
                        genero.equals("A") ? "A" : "O",
                        capitalize(adjetivo) + " " + encontrada.getNome(),
                        cidadeEncontrada.getNome(),
                        cidadeEncontrada.getEstado());
            } else {
                System.out.printf("%s nasceu em cidade desconhecida.\n", encontrada.getNome());
            }
        } else {
            System.out.printf("%s nasceu em cidade desconhecida.\n", nomeBusca);
        }

        sc.close();
    }

    private static String capitalize(String str) {
        if (str.length() == 0) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}

