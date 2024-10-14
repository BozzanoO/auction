package com.lpii.Repository;

import com.lpii.Entity.Bid;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

@Repository
public interface BidRepo extends JpaRepository<Bid, Long>{
    
}
