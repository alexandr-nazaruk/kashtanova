package org.b14.dao;

import org.b14.model.Post;
import org.b14.model.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by onazaruk on 19.02.2016.
 */
@Repository
public class PostDAOImpl extends GenericDAO implements PostDAO {
    private final static String INSERT_QUERY="INSERT INTO post (title,author_id,publication_date,value) values (?,?,?,?)";
    private final static String LAST_POSTS_QRY = "SELECT post_id, title, author_id, publication_date,value FROM post ORDER BY post_id DESC LIMIT ? ";
    private final static String FAVORITE_POSTS_QRY = "SELECT p.post_id, title FROM post p JOIN favorite_post fp ON p.post_id=fp.post_id ORDER BY fp.order";
    private final static String FIND_BY_ID_QRY = "SELECT post_id, title, author_id, publication_date,value FROM post WHERE post_id=?";

    @Override
    public void save(Post post, User user){
        jdbcTemplate.update(INSERT_QUERY, new Object[] {post.getTitle(),user.getId(),post.getPublicationDate(),post.getText()});
    }

    @Override
    public List<Post>getLastPosts(int limit){
        return jdbcTemplate.query(LAST_POSTS_QRY, new Object[]{limit}, (RowMapper) (rs,rowNum)->{
                    return new Post(rs.getLong("post_id")
                                    ,rs.getString("title")
                                    ,rs.getDate("publication_date")
                                    ,rs.getString("author_id")
                                    ,rs.getString("value"));
            }
        );
    }

    @Override
    public List<Post> getFavoritePost(){
        return jdbcTemplate.query(FAVORITE_POSTS_QRY, (RowMapper) (rs,rowNum)-> {
                    return  new Post(rs.getLong("post_id"),rs.getString("title"));
            }
        );
    }

    @Override
    public Post getById(long postId){
        return jdbcTemplate.queryForObject(FIND_BY_ID_QRY, new Object[]{postId},(RowMapper<Post>)(rs,rowNum)->{
           return new Post(rs.getLong("post_id")
                   ,rs.getString("title")
                   ,rs.getDate("publication_date")
                   ,rs.getString("author_id")
                   ,rs.getString("value"));
        });
    }
}
