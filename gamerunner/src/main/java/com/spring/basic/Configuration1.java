package com.spring.basic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {};
record Address(String city, String state) {};

@Configuration
public class Configuration1 
{   
    @Bean
    public String Name()
    {
        return "DK";
    }

    @Bean(name = "Age")
    public int DKAge()
    {
        return 21;
    }

    // if More than 1 Bean with same Return type, then Param name Should exactly similar to Bean Name. Ex: 2 Bean with Return type Address.
    @Bean
    public Person PersonParam(String name, int age, Address AddressDK)
    {
        Person person = new Person(name, age, AddressDK);
        return person;
    } 

    @Bean()
    public Person PersonDK()
    {
        Address address = new Address("Khamgaon", "Maharashtra");
        Person person = new Person(Name(), DKAge(), address);
        return person;
    }

    @Bean()
    public Person PersonAjju()
    {
        Person person = new Person("Ajju Bhai", 24, AddressAjju());
        return person;
    }

    @Bean(name = "AjjuAddress")
    public Address AddressAjju()
    {
        Address address = new Address("Aamboda", "Maharashtra");
        return address;
    }

    @Bean
    @Primary
    public Address AddressDK()
    {
        Address address = new Address("Khamgaon", "Maharashtra");
        return address;
    }
}