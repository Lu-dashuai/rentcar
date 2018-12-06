package com.aaa.rent.controller;

import com.aaa.rent.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * className:DeptController
 * discription:
 * author:luRuiHua
 * createTime:2018-12-06 14:35
 */
@RestController //默认该类的所有方法返回json,等同于以前方法上面加@ResponseBody
@RequestMapping("/dept")
public class DeptController {
    //依赖注入
    @Autowired
    private DeptService deptService;

    /**
     * 部门列表方法
     * @return
     */
    @RequestMapping("/list")
    public Object list(){
        //List list = new ArrayList(20);
        return deptService.getList();
    }
}
