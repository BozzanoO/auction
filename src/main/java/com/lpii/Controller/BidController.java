package com.lpii.Controller;

import java.util.List;

import com.lpii.Entity.Bid;
import com.lpii.service.BidService;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;

@Controller("/lances")
public class BidController {
    
    @Inject
    private BidService BidService;

    @Get
    public List<Bid> allBids(){
        return BidService.allBid();
    }

    @Post
    public Bid newBid(@Body Bid bid){
        return BidService.newBid(bid);
    }

    @Get(value = "/{id}")
    public Bid findById(@PathVariable("id") Long id){
        return BidService.findById(id);
    }
}
