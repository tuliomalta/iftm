package org.example.solid;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

class ColaboradorArquivo {
    private static final Path ARQUIVO = Paths.get("colaboradores.txt");

    public void salvar(Colaborador colaborador) {
        try (BufferedWriter writer = Files.newBufferedWriter(ARQUIVO, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            writer.write("Nome: " + colaborador.getNome());
            writer.newLine();
            writer.write("Cargo: " + colaborador.getCargo());
            writer.newLine();
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Erro ao salvar colaborador: " + e.getMessage());
        }
    }

    public void exibir() {
        if (!Files.exists(ARQUIVO)) {
            System.out.println("Nenhum colaborador cadastrado.");
            return;
        }

        try (BufferedReader reader = Files.newBufferedReader(ARQUIVO)) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao exibir colaboradores: " + e.getMessage());
        }
    }
}