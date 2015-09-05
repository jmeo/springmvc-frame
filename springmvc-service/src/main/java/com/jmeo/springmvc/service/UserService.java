package com.jmeo.springmvc.service;

import com.jmeo.springmvc.entities.User;
import java.util.List;

/**
 * Created by JmeoM on 2015/9/5.
 */
public interface UserService {

    List<User> getAllUsers();

    boolean addUser(User user);

}
