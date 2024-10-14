package com.lpii.Repository;

import com.lpii.Entity.Device;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

@Repository
public interface DeviceRepo extends JpaRepository<Device, Long>{
    
}
