package org.example.repository;

import org.example.domain.Cliente;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClienteRepository {
    private List<Cliente> clientes;

    public ClienteRepository(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ClienteRepository() {
        clientes = new ArrayList<>();
        clientes.add(new Cliente(1, "Eliezer", "Rua dos Comédias"));
        clientes.add(new Cliente(2, "Tulião", "Rua dos Trabalhadores"));
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void addCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }
}
