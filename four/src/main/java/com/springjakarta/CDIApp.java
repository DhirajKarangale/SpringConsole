package com.springjakarta;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;

// @Component
@Named
class BusinessService
{
    private DataService dataService;

    // @Autowired
    @Inject
    public void SetData(DataService dataService)
    {
        System.out.println("Setting Data");
        this.dataService = dataService;
    }
    
    public DataService GetData()
    {
        System.out.println("Getting Data");
        return dataService;
    }
}

// @Component
@Named
class DataService
{

}


@Configuration
@ComponentScan 
public class CDIApp 
{
    public static void main(String[] args) 
    {
		var context = new AnnotationConfigApplicationContext(CDIApp.class);

        System.out.println("Data : " + context.getBean(BusinessService.class).GetData());
		// Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out :: println);

		context.close();
	}
    
}