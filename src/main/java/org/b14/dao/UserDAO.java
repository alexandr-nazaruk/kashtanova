package org.b14.dao;

import org.b14.model.User;

/**
 * Created by onazaruk on 02.09.2016.
 */
public interface UserDAO {
    public int save(final User user);
    public User getByLogin(String login);
}
