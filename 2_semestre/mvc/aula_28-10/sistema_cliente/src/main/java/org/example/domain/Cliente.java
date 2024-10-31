package org.example.domain;

public class Cliente {
    private Integer id;
    private String name;
    private String endereco;

    public Cliente(Integer id, String name, String endereco) {
        this.id = id;
        this.name = name;
        this.endereco = endereco;
    }

    public Cliente() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
