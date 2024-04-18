package com.BusinessCalculation;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

interface Data 
{
    public int[] GetData();
}

@Component
class DB
{
    private Data data;

    public DB(@Qualifier("Mongo") Data data)
    {
        this.data = data;
    }

    public int GetMax()
    {
        return Arrays.stream(data.GetData()).max().orElse(0);
    }
}

@Component
@Qualifier("Mongo")
class MongoDB implements Data
{
    public int[] GetData()
    {
        return new int[] {1,2,3,4,5};
    }
}

@Component 
@Primary
class SQL implements Data
{
    public int[] GetData()
    {
        return new int[] {11,22,33,44,55};
    }
}

@Configuration
@ComponentScan
public class BusinessCalculation 
{
    public static void main(String[] args)
    {
        var context = new AnnotationConfigApplicationContext(BusinessCalculation.class);

        System.out.println("Max: " + context.getBean(DB.class).GetMax());
        System.out.println("Beans: " + context.getBeanDefinitionCount());
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out :: println);

        context.close();
    }
}