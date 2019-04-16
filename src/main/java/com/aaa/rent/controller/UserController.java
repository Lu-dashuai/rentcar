package com.aaa.rent.controller;

import com.aaa.rent.entity.User;
import com.aaa.rent.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * className:UserController
 * discription:
 * author:luRuiHua
 * createTime:2018-12-05 09:30
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getUserList")
    @ResponseBody
    public Object getUserList(){
        List<User> userList = userService.getUserList();
        return  userList;
    }

    /**
     * 通过用户名查询密码
     * @return
     */
    @RequestMapping("/getUserByName")
    @ResponseBody
    public Object getUserByName(@RequestBody Map map){
        List<User> userList = userService.getUserByName(map);
        return  userList;
    }
}
