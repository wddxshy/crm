package com.shy.controller;

import com.shy.beans.SysUser;
import com.shy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @Author: WeiDongDong
 * @Date 2020/5/13 13:18
 * @Description  用户管理控制器
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/regist")
    public String userRegister(SysUser sysUser){
        System.out.println(sysUser.toString());
        userService.addUser(sysUser);
        return "login";
    }

    @RequestMapping("/checkCode")
    @ResponseBody
    public String checkUserCode(String userCode){
        return userService.findUserByCode(userCode);
    }

    @RequestMapping("/login")
    public String login(SysUser sysUser, HttpSession session, Model model){
        SysUser user = userService.findUserByCodeAndPassword(sysUser);
        if (user != null){
            session.setAttribute("user",user);
            return "index";
        }
        model.addAttribute("loginTip","用户名或密码错误");
        return "login";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();    //清空session
        return "login";
    }

    @RequestMapping("/edit")
    public String updatePassword(SysUser sysUser){
        userService.updateUserPassword(sysUser);
        return "login";
    }
}
