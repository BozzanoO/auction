package com.lpii.service;

import java.util.List;
import com.lpii.Entity.Device;

public interface DeviceService {
    public List<Device> allDevices();
    
    public Device newDevice(Device device);

    public Device findById(Long Id);
}
