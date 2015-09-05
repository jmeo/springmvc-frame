package com.jmeo.springmvc.service.impl;

import com.jmeo.springmvc.dao.UserTestDao;
import com.jmeo.springmvc.entities.User;
import com.jmeo.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by JmeoM on 2015/9/5.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource(name = "userTestDao")
    UserTestDao userTestDao;

    public List<User> getAllUsers(){
        List<User> users= userTestDao.getAllUsers();
        return users;
    }

    public boolean addUser(User user) {
        return userTestDao.addUser(user);
    }
}
