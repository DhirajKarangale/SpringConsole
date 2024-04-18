package com.boot.fiveboot;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Course  
{
    private long id;    
    private String name;    
    private String author;    

    public Course(long id, String name, String author)
    {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    @JsonProperty("id")
    public long GetId()
    {
        return id;
    }
    
    @JsonProperty("name")
    public String GetName()
    {
        return name;
    }
    
    @JsonProperty("author")
    public String GetAuthor()
    {
        return author;
    }


    // @Override
    // public String toString()
    // {
    //     return "id: ";
    // }    
}