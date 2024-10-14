package com.lpii.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "financial-instituition")
public class FinancialInstituition {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ins-id")
    private Long instituitionId;

    @Column(name = "ins-name")
    private String instituitionName;

    @Column(name = "ins-cnpj")
    private String instituitionCNPJ;

    public FinancialInstituition(){}

}
