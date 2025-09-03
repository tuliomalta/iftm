package org.example.dscliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.example.dscliente.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
