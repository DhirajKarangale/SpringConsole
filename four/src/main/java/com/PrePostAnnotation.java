package com;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass 
{
    private Depedency depedency;

    public SomeClass(Depedency depedency)
    {
        System.out.println("Setting depedency");
        this.depedency = depedency;
    }

    @PostConstruct
    public void Ready()
    {
        depedency.Ready();
    }

    @PreDestroy
    public void Clean()
    {
        System.out.println("Cleaned");
    }
}

@Component
class Depedency
{
    public void Ready()
    {
        System.out.println("Depedency Ready");
    }
}

@Configuration
@ComponentScan 
public class PrePostAnnotation 
{
    public static void main(String[] args) 
    {
		var context = new AnnotationConfigApplicationContext(PrePostAnnotation.class);

		// Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out :: println);
        context.getBean(SomeClass.class);

		context.close();
	}
}
