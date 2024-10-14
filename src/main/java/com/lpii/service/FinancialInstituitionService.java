package com.lpii.service;

import java.util.List;
import com.lpii.Entity.FinancialInstituition;

public interface FinancialInstituitionService {
    public List<FinancialInstituition> allFinancialInstituitions();
    
    public FinancialInstituition newFinancialInstituition(FinancialInstituition financialInstituition);

    public FinancialInstituition findById(Long Id);
}
