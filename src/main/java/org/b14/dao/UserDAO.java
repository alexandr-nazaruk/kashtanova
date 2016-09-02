package org.b14.dao;

import org.b14.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Created by onazaruk on 15.02.2016.
 */
@Repository
public class UserDAO extends GenericDAO {
    private static final String INSERT_QUERY = "INSERT INTO users(name,email,apartment) VALUES(?,?,?)";
    private static final String GET_BY_LOGIN_QRY = "SELECT user_id,name,email FROM users WHERE email=?";

    public int save(final User user){
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(
                new PreparedStatementCreator() {
                    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                        PreparedStatement ps =
                                connection.prepareStatement(INSERT_QUERY, new String[] {"id"});
                        ps.setString(1, user.getName());
                        ps.setString(2, user.getEmail());
                        ps.setInt(3, user.getApartment());

                        return ps;
                    }
                },
                keyHolder);
        return keyHolder.getKey().intValue();
    }

    public User getByLogin(String login){
        return jdbcTemplate.queryForObject(GET_BY_LOGIN_QRY, new Object[]{login}, new RowMapper<User>() {
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setEmail(rs.getString("email"));
                user.setId(rs.getInt("user_id"));
                return user;
            }
        });
    }
}
