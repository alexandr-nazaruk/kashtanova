package org.b14.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * Created by onazaruk on 11.02.2016.
 */
@Component
public class TestDAO {
    private final String sql="SELECT id FROM a_test_table";
    @Autowired
    private DataSource dataSource;


    public String testSpringJdbc(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        return jdbcTemplate.queryForObject(sql,String.class);
    }
}
