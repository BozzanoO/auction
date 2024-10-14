package com.lpii.Entity;

import com.lpii.Entity.Enum.DeviceType;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "device")
public class Device {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dev-id")
    private Long deviceId;

    @Column(name = "dev-name")
    private String deviceName;

    @Column(name = "dev-description")
    private String deviceDescription;

    @Column(name = "dev-initial-value")
    private Double deviceInitialValue;

    @Column(name = "dev-selled")
    private boolean deviceSelled;

    @Enumerated(EnumType.STRING)
    private DeviceType deviceType;
    
    public Device(){}

}
