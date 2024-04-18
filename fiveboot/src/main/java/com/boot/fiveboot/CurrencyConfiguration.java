package com.boot.fiveboot;

import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;
import com.fasterxml.jackson.annotation.JsonProperty;

@Component
@ConfigurationProperties(prefix = "currency")
public class CurrencyConfiguration 
{
     private static final Logger logger = LoggerFactory.getLogger(CurrencyConfiguration.class);

    private String name;
    private String url; 
    private String key;

    @PostConstruct
    public void init() {
        logger.info("======================================================= Log by DKCurrency Configuration - name: {}, url: {}, key: {}", name, url, key);
    }
    
    @JsonProperty("name")
    public void SetName(String name) 
    {
        this.name = name;
    }

    @JsonProperty("url")
    public void SetUrl(String url) 
    {
        this.url = url;
    }
    
    @JsonProperty("key")
    public void SetKey(String key) 
    {
        this.key = key;
    }

    @JsonProperty("name")
    public String GetName()
    {
        return name;
    }
    
    @JsonProperty("url")
    public String GetUrl()
    {
        return url;
    }
    
    @JsonProperty("key")
    public String GetKey()
    {
        return key;
    }
}