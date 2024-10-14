package com.lpii.service;

import java.util.List;
import com.lpii.Entity.Bid;

public interface BidService {
    
    public List<Bid> allBid();

    public Bid newBid(Bid bid);

    public Bid findById(Long Id);
}
