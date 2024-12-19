package aplicacao;

public class Aluno {
    private String nome;
    private String telefone;
    private int categoria;
    private String codigo;
    private int acessos;

    public Aluno() {}

    public Aluno(String nome, String telefone, int categoria, String codigo) {
        this.nome = nome;
        this.telefone = telefone;
        this.categoria = categoria;
        this.codigo = codigo;
        this.acessos = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getCategoria() {
        return categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getAcessos() {
        return acessos;
    }

    public void incrementarAcessos() {
        this.acessos++;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + "\n" +
                "Nome: " + nome + "\n" +
                "Telefone: " + telefone + "\n" +
                "Categoria: " + categoria + "\n" +
                "Acessos: " + acessos;
    }
}