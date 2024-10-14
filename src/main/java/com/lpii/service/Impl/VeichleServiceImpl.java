package com.lpii.service.Impl;

import java.util.List;
import java.util.Optional;

import com.lpii.Entity.Veichle;
import com.lpii.Repository.VeichleRepo;
import com.lpii.service.VeichleService;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.exceptions.HttpStatusException;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class VeichleServiceImpl implements VeichleService {

    @Inject
    private VeichleRepo repo;

    @Override
    public List<Veichle> allVeichles(){
        return repo.findAll();
    }

    @Override
    public Veichle newVeichle (Veichle veichle){
        return repo.save(veichle);
    }

    @Override
    public Veichle findById(Long id){
        Optional<Veichle> veichleOp = repo.findById(id);
        if (veichleOp.isEmpty()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND,"Leilão não encontrado!");
        }

        return veichleOp.get();
    }
}
