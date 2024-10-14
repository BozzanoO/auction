package com.lpii.Controller;

import java.util.List;

import com.lpii.Entity.Client;
import com.lpii.service.ClientService;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;

@Controller("/clientes")
public class ClientController {
    
    @Inject
    private ClientService ClientService;

    @Get
    public List<Client> allClients(){
        return ClientService.allClients();
    }

    @Post
    public Client newClient(@Body Client client){
        return ClientService.newClient(client);
    }

    @Get(value = "/{id}")
    public Client findById(@PathVariable("id") Long id){
        return ClientService.findById(id);
    }
}
