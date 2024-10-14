package com.lpii.Entity;

import com.lpii.Entity.Enum.VeichleType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "veichle")
public class Veichle {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vei-id")
    private Long veichleId;

    @Column(name = "vei-brand")
    private String veichleBrand;

    @Column(name = "vei-name")
    private String veichleName;

    @Column(name = "vei-description")
    private String veichleDescription;

    @Column(name = "vei-initial-value")
    private Double veichleInitialValue;

    @Column(name = "vei-selled")
    private boolean veichleSelled;

    @Enumerated(EnumType.STRING)
    private VeichleType veichleType;

    public Veichle(){}

}
