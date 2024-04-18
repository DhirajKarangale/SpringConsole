package com.spring.six;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner
{
    // @Autowired
    // private CourseJDBCRepo repo;

    // @Autowired
    // private CourseJPARepo repo;

    @Autowired
    private CourseSpringDataJPARepo repo;


    @Override
    public void run(String... args) throws Exception 
    {
        Course course1 = new Course(1, "Math", "RD Sharma");
        Course course2 = new Course(2, "Physics", "HC Varma");
        Course course3 = new Course(3, "Chemistry", "Tondon");
        Course course4 = new Course(4, "Chemistry2", "Tondon");
        repo.save(course1);
        repo.save(course2);
        repo.save(course3);
        repo.save(course4);
        repo.deleteById(2l);

        System.out.println(repo.findById(1l));
        System.out.println(repo.findAll());
        System.out.println(repo.count());
        System.out.println(repo.findByAuthor("Tondon"));
        System.out.println(repo.findByAuthor("HC Varma"));
        System.out.println(repo.findByName("Chemistry"));
        
    }
}