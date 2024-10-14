package com.lpii.service.Impl;

import java.util.List;
import java.util.Optional;

import com.lpii.Entity.Bid;
import com.lpii.Repository.BidRepo;
import com.lpii.service.BidService;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.exceptions.HttpStatusException;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class BidServiceImpl implements BidService {

    @Inject
    private BidRepo repo;

    @Override
    public List<Bid> allBid(){
        return repo.findAll();
    }

    @Override
    public Bid newBid (Bid bid){
        return repo.save(bid);
    }

    @Override
    public Bid findById(Long id){
        Optional<Bid> bidOp = repo.findById(id);
        if (bidOp.isEmpty()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND,"Lance não encontrado!");
        }

        return bidOp.get();
    }
}
