package com.spring.basic;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Spring1 
{
    public static void main(String[] args)
    {
        // Launch Spring Contex.
        var contex = new AnnotationConfigApplicationContext(Configuration1.class);
        
        // Configure thing that want to manage by Spring.

        // Retriving Bean managed by Spring.

        // System.out.println(contex.getBean("Name"));
        // System.out.println(contex.getBean("Age"));
        // System.out.println(contex.getBean("PersonAjju"));
        // System.out.println(contex.getBean("PersonDK"));
        // System.out.println(contex.getBean("AjjuAddress"));
        // System.out.println(contex.getBean(Address.class));
        // System.out.println(contex.getBean("PersonParam"));
        

        
        String[] beans = contex.getBeanDefinitionNames();
        for(int i = 0; i < beans.length; i++)
        {
            System.out.println("Name " + i + " : " + beans[i]);
        }

        System.out.println("All Beans Count : " + contex.getBeanDefinitionCount());

        contex.close();
    }    
}