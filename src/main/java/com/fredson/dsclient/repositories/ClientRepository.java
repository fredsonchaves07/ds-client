package com.fredson.dsclient.repositories;

import com.fredson.dsclient.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
