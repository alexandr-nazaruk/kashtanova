package org.b14.dao;

import org.b14.model.Post;
import org.b14.model.User;

import java.util.List;

/**
 * Created by onazaruk on 02.09.2016.
 */
public interface PostDAO {
    public void save(Post post, User user);
    public Post getById(long postId);
    public List<Post>getLastPosts(int limit);
    public List<Post> getFavoritePost();
}
