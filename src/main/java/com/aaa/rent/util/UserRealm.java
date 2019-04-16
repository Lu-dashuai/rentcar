package com.aaa.rent.util;

import com.aaa.rent.entity.User;
import com.aaa.rent.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * className:UserRealm
 * discription:
 * author:luRuiHua
 * createTime:2018-11-30 14:41
 */
public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;
    /**
     * 执行授权逻辑
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //获取当前登陆的用户
        Subject subject = SecurityUtils.getSubject();
        //获取用户名
        String username = subject.getPrincipal()+"";
        //通过用户名查当前用户
        Map map = new HashMap();
        map.put("username",username);
        List<User> listUser = userService.getUserByName(map);
        //获取当前的权限字符
        Integer role_id = listUser.get(0).getRole_id();
        //设置只有是这个字符才可以访问
        info.addStringPermission(role_id.toString());


        return info;
    }

    /**
     * 执行认证逻辑
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        //编写shiro判断逻辑，判断用户名密码是否正确
        UsernamePasswordToken token = (UsernamePasswordToken)authenticationToken;
        String username = token.getUsername();
        //1.判断用户名
        Map map = new HashMap();
        map.put("username",username);
        List<User> mapList = userService.getUserByName(map);
        if (mapList.size() == 0) {
            return null;
        } else {
            return new SimpleAuthenticationInfo(username, mapList.get(0).getPassword(),"");
        }
    }
}
