package com.jmeo.springmvc.dao;

import com.jmeo.springmvc.entities.User;

import java.util.List;

/**
 * Created by JmeoM on 2015/9/5.
 */
public interface UserTestDao {

    public User getUserById(int id);

    public List<User> getAllUsers();

    boolean addUser(User user);
}
