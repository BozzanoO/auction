package com.lpii.Controller;

import java.util.List;

import com.lpii.Entity.Auction;
import com.lpii.service.AuctionService;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;

@Controller("/leiloes")
public class AuctionController {
    
    @Inject
    private AuctionService auctionService;

    @Get
    public List<Auction> allAuctions(){
        return auctionService.allAuctions();
    }

    @Post
    public Auction newAuction(@Body Auction auction){
        return auctionService.newAuction(auction);
    }

    @Get(value = "/{id}")
    public Auction findById(@PathVariable("id") Long id){
        return auctionService.findById(id);
    }
}
