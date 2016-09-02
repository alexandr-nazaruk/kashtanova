package org.b14.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * Created by onazaruk on 15.02.2016.
 */
@Repository
public class GenericDAO {
    @Autowired
    protected JdbcTemplate jdbcTemplate;

}
