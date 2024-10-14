package com.lpii.Controller;

import java.util.List;

import com.lpii.Entity.Device;
import com.lpii.service.DeviceService;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;

@Controller("/dispositivos")
public class DeviceController {
    
    @Inject
    private DeviceService DeviceService;

    @Get
    public List<Device> allDevices(){
        return DeviceService.allDevices();
    }

    @Post
    public Device newDevice(@Body Device device){
        return DeviceService.newDevice(device);
    }

    @Get(value = "/{id}")
    public Device findById(@PathVariable("id") Long id){
        return DeviceService.findById(id);
    }
}
