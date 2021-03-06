package org.b14.service;

import org.b14.dao.PostDAO;
import org.b14.dao.UserDAO;
import org.b14.model.Post;
import org.b14.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by onazaruk on 18.02.2016.
 */
@Service
public class PostServiceImpl implements PostService{
    private static final int POST_PER_PAGE=5;

    @Autowired
    private PostDAO postDAO;
    @Autowired
    private UserDAO userDAO;

    @Override
    public void save(Post post){
        User user = userDAO.getByLogin(post.getAuthor());
        postDAO.save(post,user);
    }

    @Override
    public List<Post> getLastPosts(){
        return postDAO.getLastPosts(POST_PER_PAGE);
    }

    @Override
    public List<Post> getFavoritePost(){
        return postDAO.getFavoritePost();
    }

    @Override
    public Post getPost(long postId){return  postDAO.getById(postId);}
}
