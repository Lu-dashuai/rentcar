package com.aaa.rent.dao;

import com.aaa.rent.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * className:UserDao
 * discription:
 * author:luRuiHua
 * createTime:2018-12-05 08:44
 */
public interface UserDao {

    List<User> getUserList();

    List<User> getUserByName(Map map);
}
