package org.b14.service;

import org.b14.model.Post;

import java.util.List;

/**
 * Created by onazaruk on 02.09.2016.
 */
public interface PostService {
    public void save(Post post);
    public List<Post> getLastPosts();
    public List<Post> getFavoritePost();
    public Post getPost(long postId);
}
