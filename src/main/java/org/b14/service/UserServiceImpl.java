package org.b14.service;

import org.b14.dao.UserDAO;
import org.b14.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by onazaruk on 15.02.2016.
 */
@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;


}
