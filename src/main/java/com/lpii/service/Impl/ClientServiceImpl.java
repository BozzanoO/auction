package com.lpii.service.Impl;

import java.util.List;
import java.util.Optional;

import com.lpii.Entity.Client;
import com.lpii.Repository.ClientRepo;
import com.lpii.service.ClientService;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.exceptions.HttpStatusException;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class ClientServiceImpl implements ClientService {

    @Inject
    private ClientRepo repo;

    @Override
    public List<Client> allClients(){
        return repo.findAll();
    }

    @Override
    public Client newClient (Client client){
        return repo.save(client);
    }

    @Override
    public Client findById(Long id){
        Optional<Client> clientOp = repo.findById(id);
        if (clientOp.isEmpty()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND,"Leilão não encontrado!");
        }

        return clientOp.get();
    }
}
