package com.aaa.rent.controller;

import com.aaa.rent.entity.User;
import com.aaa.rent.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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

}
