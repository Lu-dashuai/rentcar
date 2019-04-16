package com.aaa.rent.controller;

import com.aaa.rent.service.BackLoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.Random;

/**
 * className:BackLoginController
 * discription:
 * author:luRuiHua
 * createTime:2019-04-16 11:48
 */
@Controller
@RequestMapping("back")
public class BackLoginController {
    @Autowired
    private BackLoginService backLoginService;

    /**
     * 当登陆页面加载时获取token
     * @return
     */
    @RequestMapping("getToken")
    @ResponseBody
    public Object getToken(HttpServletRequest request){
        Random rand = new Random();
        int token = rand.nextInt(100);
        request.getSession().setAttribute("token",token);
        return token;
    }

    /**
     * 登陆
     * @return
     */
    @RequestMapping("goLogin")
    @ResponseBody
    public Object goLogin(@RequestBody Map map,HttpServletRequest request){
        String username = (String)map.get("username");
        String password = (String)map.get("password");
        String token = map.get("token")+"";
        String sessionToken = request.getSession().getAttribute("token")+"";
        //shiro的关键代码，执行认证功能
        // 1.获取subject
        Subject subject = SecurityUtils.getSubject();
        //2.封装用户数据
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username, password);
        //0是成功，-1是失败
        if (sessionToken==null){
            return -1;
        } else if (!token.equals(sessionToken)){
            return -1;
        } else if (token.equals(sessionToken)){

            //3.执行登陆方法
            try {
                //登陆成功
                subject.login(usernamePasswordToken);
                request.getSession().removeAttribute("token");//移除session中的token
                return 0;
                //跳到欢迎页面
            } catch (UnknownAccountException e) {
                //用户名不存在的异常
                return -1;
            } catch (IncorrectCredentialsException e) {
                //用户名不存在的异常
                return -1;
            }

        }
        request.getSession().removeAttribute("token");//移除session中的token
        return 0;
    }

}
