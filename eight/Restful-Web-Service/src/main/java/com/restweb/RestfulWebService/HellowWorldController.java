package com.restweb.RestfulWebService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowWorldController 
{
    // @RequestMapping(method = RequestMethod.GET, path = "hello-world")
    @GetMapping(path = "hello-world")
    public String HellowWorld()
    {
        return "Hello World DK";
    }  
    
    @GetMapping(path = "hello-world-bean")
    public HelloWorldBean HellowWorldBean()
    {
        return new HelloWorldBean("Bean by DK");
    }  

    @GetMapping(path = "hello-world/path-variable/{name}")
    public HelloWorldBean HellowWorldPathVariable(@PathVariable String name)
    {
        return new HelloWorldBean("Get data of " + name);
    }  
}