package com.boot.fiveboot;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController 
{
    @RequestMapping("courses")
    public List<Course> GetCourses()
    {
        // Course course1 = new Course(1, "Maths", "RD Sharma");
        // Course course2 = new Course(2, "Physics", "HC Varma");

        // List<Course> courses = new ArrayList<Course>();
        // courses.add(course1);
        // courses.add(course2);

        // return courses;

        return Arrays.asList
        (
            new Course(1, "Maths", "RD Sharma"),
            new Course(2, "Physics", "HC Varma"),
            new Course(3, "Chemistry", "Tondon")
        );
    }

    @RequestMapping("dk")
    public String Hello()
    {
        return "Hello DK";
    }
}