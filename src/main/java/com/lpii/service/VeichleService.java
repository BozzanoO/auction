package com.lpii.service;

import java.util.List;
import com.lpii.Entity.Veichle;

public interface VeichleService {
    public List<Veichle> allVeichles();
    
    public Veichle newVeichle(Veichle Veichle);

    public Veichle findById(Long Id);
}
