package com.zhiguogongfang.hrmapp.controller;

import com.zhiguogongfang.hrmapp.common.HrmConstants;
import com.zhiguogongfang.hrmapp.domain.User;
import com.zhiguogongfang.hrmapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    @Qualifier("userService")
    private UserService userService;
    @RequestMapping("login")
    public ModelAndView login(String loginname, String password, HttpSession session,ModelAndView mv){
        User user =userService.login(loginname,password);
        if(user!=null){
            session.setAttribute(HrmConstants.USER_SESSION,user);
            mv.setViewName("redirect:/main");
        }else{
            mv.addObject("message","登录名或密码错误！请重新输入！");
            mv.setViewName("forward:/loginForm");
        }
        return mv;
    }
}
