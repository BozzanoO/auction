package com.lpii.service.Impl;

import java.util.List;
import java.util.Optional;

import com.lpii.Entity.Auction;
import com.lpii.Repository.AuctionRepo;
import com.lpii.service.AuctionService;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.exceptions.HttpStatusException;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class AuctionServiceImpl implements AuctionService {

    @Inject
    private AuctionRepo repo;

    @Override
    public List<Auction> allAuctions(){
        return repo.findAll();
    }

    @Override
    public Auction newAuction (Auction auction){
        return repo.save(auction);
    }

    @Override
    public Auction findById(Long id){
        Optional<Auction> auctionOp = repo.findById(id);
        if (auctionOp.isEmpty()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND,"Leilão não encontrado!");
        }

        return auctionOp.get();
    }
}
