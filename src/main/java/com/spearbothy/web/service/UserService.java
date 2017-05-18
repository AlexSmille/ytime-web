package com.spearbothy.web.service;

import com.spearbothy.web.dao.UserDao;
import com.spearbothy.web.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Alex_MaHao on 2017/5/18.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> findUsers(){
        return userDao.findUsers();
    }

    public User findUserById(String id){
        return userDao.findUserById(id);
    }
}
