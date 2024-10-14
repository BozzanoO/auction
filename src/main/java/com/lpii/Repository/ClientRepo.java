package com.lpii.Repository;

import com.lpii.Entity.Client;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

@Repository
public interface ClientRepo extends JpaRepository<Client, Long>{
    
}
