package com.lpii.service.Impl;

import java.util.List;
import java.util.Optional;

import com.lpii.Entity.FinancialInstituition;
import com.lpii.Repository.FinancialInstituitionRepo;
import com.lpii.service.FinancialInstituitionService;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.exceptions.HttpStatusException;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class FinancialInstituitionServiceImpl implements FinancialInstituitionService {

    @Inject
    private FinancialInstituitionRepo repo;

    @Override
    public List<FinancialInstituition> allFinancialInstituitions(){
        return repo.findAll();
    }

    @Override
    public FinancialInstituition newFinancialInstituition (FinancialInstituition financialInstituition){
        return repo.save(financialInstituition);
    }

    @Override
    public FinancialInstituition findById(Long id){
        Optional<FinancialInstituition> financialInstituitionOp = repo.findById(id);
        if (financialInstituitionOp.isEmpty()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND,"Leilão não encontrado!");
        }

        return financialInstituitionOp.get();
    }
}
