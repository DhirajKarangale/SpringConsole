package com.spring.six;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJPARepo 
{
    @PersistenceContext
    private EntityManager entityManager;

    public void Insert(Course course)
    {
        entityManager.merge(course);
    }

    public void Delete(long id)
    {
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }

    public Course Select(long id)
    {
        return entityManager.find(Course.class, id);
    }
}