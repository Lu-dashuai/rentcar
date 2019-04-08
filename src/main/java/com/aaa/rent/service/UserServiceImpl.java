package com.aaa.rent.service;

import com.aaa.rent.dao.UserDao;
import com.aaa.rent.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * className:UserServiceImpl
 * discription:
 * author:luRuiHua
 * createTime:2018-12-05 09:21
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserList() {
        return userDao.getUserList();
    }
}
