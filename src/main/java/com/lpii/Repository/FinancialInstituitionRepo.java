package com.lpii.Repository;

import com.lpii.Entity.FinancialInstituition;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

@Repository
public interface FinancialInstituitionRepo extends JpaRepository<FinancialInstituition, Long>{
    
}
