package com.aaa.rent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * className:GoBackController
 * discription:
 * author:luRuiHua
 * createTime:2019-04-12 17:13
 */
@Controller
@RequestMapping("go")
public class GoBackController {
    /**
     * 跳转后台首页
     * @return
     */
    @RequestMapping("toTree")
    public String toTree(){
        return "tree/tree";
    }
    /**
     * 跳转emp
     * @return
     */
    @RequestMapping("toEmp")
    public String toEmp(){
        return "back/emp";
    }
    /**
     * 跳转emp
     * @return
     */
    @RequestMapping("toIndex")
    public String toIndex(){
        return "back/index";
    }
}
