package com.lpii.Controller;

import java.util.List;

import com.lpii.Entity.FinancialInstituition;
import com.lpii.service.FinancialInstituitionService;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;

@Controller("/instituicoes")
public class FinancialInstituitionController {
    
    @Inject
    private FinancialInstituitionService FinancialInstituitionService;

    @Get
    public List<FinancialInstituition> allFinancialInstituitions(){
        return FinancialInstituitionService.allFinancialInstituitions();
    }

    @Post
    public FinancialInstituition newFinancialInstituition(@Body FinancialInstituition financialInstituition){
        return FinancialInstituitionService.newFinancialInstituition(financialInstituition);
    }

    @Get(value = "/{id}")
    public FinancialInstituition findById(@PathVariable("id") Long id){
        return FinancialInstituitionService.findById(id);
    }
}
