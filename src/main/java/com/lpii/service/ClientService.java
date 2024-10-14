package com.lpii.service;

import java.util.List;
import com.lpii.Entity.Client;

public interface ClientService {
    public List<Client> allClients();
    
    public Client newClient(Client client);

    public Client findById(Long Id);
}
