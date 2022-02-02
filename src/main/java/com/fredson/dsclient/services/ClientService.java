package com.fredson.dsclient.services;

import com.fredson.dsclient.dto.ClientDTO;
import com.fredson.dsclient.entities.Client;
import com.fredson.dsclient.repositories.ClientRepository;
import com.fredson.dsclient.services.exception.ClientNotFoundException;
import com.fredson.dsclient.services.exception.ServerErrorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Transactional(readOnly = true)
    public List<ClientDTO> findAll() {
        return clientRepository.findAll().stream().map(ClientDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAllPaged(PageRequest pageRequest) {
        return clientRepository.findAll(pageRequest).map(ClientDTO::new);
    }

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        return new ClientDTO(clientRepository.findById(id).orElseThrow(ClientNotFoundException::new));
    }

    @Transactional
    public ClientDTO insert(ClientDTO client) {
        return new ClientDTO(clientRepository.save(new Client(client.getBirthDate(), client.getName(), client.getCpf(), client.getIncome(), client.getChildren())));
    }

    @Transactional
    public ClientDTO update(Long id, ClientDTO clientDTO) {
        try {
            Client client = clientRepository.getById(id);
            client.setName(clientDTO.getName());
            client.setBirhDate(clientDTO.getBirthDate());
            client.setChildren(clientDTO.getChildren());
            client.setCpf(clientDTO.getCpf());
            client.setIncome(clientDTO.getIncome());
            return new ClientDTO(clientRepository.save(client));
        } catch (EntityNotFoundException exception) {
            throw new ClientNotFoundException();
        }
    }

    public void delete(Long id) {
        try {
            clientRepository.deleteById(id);
        } catch (EmptyResultDataAccessException exception) {
            throw new ClientNotFoundException();
        }
    }
}
