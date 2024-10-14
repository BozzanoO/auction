package com.lpii.Repository;

import com.lpii.Entity.Auction;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

@Repository
public interface AuctionRepo extends JpaRepository<Auction, Long>{
    
}
