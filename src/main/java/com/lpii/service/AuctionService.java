package com.lpii.service;

import java.util.List;
import com.lpii.Entity.Auction;

public interface AuctionService {
    
    public List<Auction> allAuctions();

    public Auction newAuction(Auction auction);

    public Auction findById(Long Id);
}
