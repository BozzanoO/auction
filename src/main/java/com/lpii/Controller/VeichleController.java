package com.lpii.Controller;

import java.util.List;

import com.lpii.Entity.Veichle;
import com.lpii.service.VeichleService;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;

@Controller("/veiculos")
public class VeichleController {
    
    @Inject
    private VeichleService VeichleService;

    @Get
    public List<Veichle> allVeichles(){
        return VeichleService.allVeichles();
    }

    @Post
    public Veichle newVeichle(@Body Veichle veichle){
        return VeichleService.newVeichle(veichle);
    }

    @Get(value = "/{id}")
    public Veichle findById(@PathVariable("id") Long id){
        return VeichleService.findById(id);
    }
}
