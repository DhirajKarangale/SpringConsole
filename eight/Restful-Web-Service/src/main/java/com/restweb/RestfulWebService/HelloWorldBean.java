package com.restweb.RestfulWebService;

public class HelloWorldBean 
{
    
    public String msg;

    public HelloWorldBean(String msg)
    {
        this.msg = msg;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }
    
    @Override
    public String toString()
    {
        return "Hello world Bean " + msg; 
    }
}