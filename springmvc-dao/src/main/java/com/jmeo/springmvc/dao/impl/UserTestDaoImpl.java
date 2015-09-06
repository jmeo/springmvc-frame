package com.jmeo.springmvc.dao.impl;

import com.jmeo.springmvc.dao.UserTestDao;
import com.jmeo.springmvc.entities.User;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by JmeoM on 2015/9/5.
 */
@Service("userTestDao")
public class UserTestDaoImpl implements UserTestDao {


    public User getUserById(int id) {
        return new User(1,"jk1",20);
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        users.add(new User(1,"jk1",20));
        users.add(new User(2,"jk2",30));
        users.add(new User(3,"jk3",40));
        users.add(new User(4,"jk4",50));
        return users;
    }

    @Transactional
    public boolean addUser(User user){

        return true;
    }
}
