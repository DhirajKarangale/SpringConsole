package com.dependency;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusiness
{   
    // @Autowired
    private Dependency1 dependency1;
    
    // @Autowired
    private Dependency2 dependency2;
    
    // @Autowired
    // public void SetDependency1(Dependency1 dependency1) 
    // {
    //     System.out.println("Set Depedency 1");
    //     this.dependency1 = dependency1;
    // }
    
    // @Autowired
    // public void SetDependency2(Dependency2 dependency2) 
    // {
    //     System.out.println("Set Depedency 2");
    //     this.dependency2 = dependency2;
    // }

    // @Autowired
    public YourBusiness(Dependency1 dependency1, Dependency2 dependency2)
    {
        System.out.println("Constructor");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }
    

    public String toString()
    {
        return "Using " + dependency1 + " and " + dependency2;
    }
}

@Component
class Dependency1
{
    
}

@Component
class Dependency2
{

}

@Configuration 
@ComponentScan
public class DependencyInjection 
{
    public static void main(String[] args) 
    {
        var context = new AnnotationConfigApplicationContext(DependencyInjection.class);

        System.out.println("Beans: " + context.getBeanDefinitionCount());
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        
        System.out.println(context.getBean(YourBusiness.class));

        context.close();
    }
}