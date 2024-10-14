package com.lpii.Repository;

import com.lpii.Entity.Veichle;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

@Repository
public interface VeichleRepo extends JpaRepository<Veichle, Long>{
    
}
