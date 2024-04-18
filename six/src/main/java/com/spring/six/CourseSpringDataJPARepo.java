package com.spring.six;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJPARepo extends JpaRepository<Course, Long>
{
    List<Course> findByAuthor(String author);
    List<Course> findByName(String name);
}
