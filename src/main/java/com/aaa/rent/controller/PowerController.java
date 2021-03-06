package com.aaa.rent.controller;

import com.aaa.rent.entity.TreeNode;
import com.aaa.rent.service.PowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/power")
public class PowerController {
    @Autowired
    private PowerService powerService;
    /**
     * 获取权限菜单树
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/tree")
    public Object getTree() {
        List<TreeNode> powerList = powerService.getPowerList();
        return powerList;
    }
    /**
     * 获取权限菜单树
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/tree1")
    public Object getTree1() {
        List<Map> powerList = powerService.getPowerList1();
        System.out.println(powerList);
        return powerList;
    }
}
