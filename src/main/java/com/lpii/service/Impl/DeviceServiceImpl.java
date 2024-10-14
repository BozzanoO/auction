package com.lpii.service.Impl;

import java.util.List;
import java.util.Optional;

import com.lpii.Entity.Device;
import com.lpii.Repository.DeviceRepo;
import com.lpii.service.DeviceService;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.exceptions.HttpStatusException;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class DeviceServiceImpl implements DeviceService {

    @Inject
    private DeviceRepo repo;

    @Override
    public List<Device> allDevices(){
        return repo.findAll();
    }

    @Override
    public Device newDevice (Device device){
        return repo.save(device);
    }

    @Override
    public Device findById(Long id){
        Optional<Device> deviceOp = repo.findById(id);
        if (deviceOp.isEmpty()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND,"Leilão não encontrado!");
        }

        return deviceOp.get();
    }
}
