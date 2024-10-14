package com.lpii.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "auction")
public class Auction {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "auc-id")
    private Long auctionId;

    @Column(name = "auc-adress")
    private String auctionAdress;

    @Column(name = "auc-city")
    private String auctionCity;

    @Column(name = "auc-state")
    private String auctionState;

    @Column(name = "auc-ocurrency-date")
    private LocalDateTime auctionOcurrencyDate;

    @Column(name = "auc-visited-date")
    private LocalDateTime auctionVisitedDate;

    public Auction(){}

}
