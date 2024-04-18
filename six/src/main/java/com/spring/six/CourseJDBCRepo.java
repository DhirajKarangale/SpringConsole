package com.spring.six;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepo 
{
    @Autowired
    private JdbcTemplate template;

    private static String InsertQuery = 
    """
    Insert into Course (id, name, author) values (?, ?, ?);
    """;

    private static String DeleteQuery = 
    """
    Delete from Course where id=?;
    """;

    private static String SelectQuery = 
    """
    Select * from Course where id=?;
    """;



    public void Insert(Course course)
    {
        template.update(InsertQuery, course.getId(), course.getName(), course.getAuthor());
    }

    public void Delete(long id)
    {
        template.update(DeleteQuery, id);
    }

    public Course Select(long id)
    {
        return template.queryForObject(SelectQuery, new BeanPropertyRowMapper<>(Course.class), id);
    }
}