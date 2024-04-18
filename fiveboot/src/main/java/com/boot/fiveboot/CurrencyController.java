package com.boot.fiveboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController 
{
    @Autowired
    private CurrencyConfiguration configuration;

    @RequestMapping("currency")
    public CurrencyConfiguration GetConfiguration()
    {
        return configuration;
    }
}