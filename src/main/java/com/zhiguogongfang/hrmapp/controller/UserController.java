package com.zhiguogongfang.hrmapp.controller;

import com.zhiguogongfang.hrmapp.domain.User;
import com.zhiguogongfang.hrmapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @RequestMapping("/userlist")
    public String selectUser() {
        return "user/userlist";
    }

    @ResponseBody
    @RequestMapping("/delete")
    public boolean deleteUser(Integer userId) {
        userService.removeUserById(userId);
        return true;
    }

    @RequestMapping("/addUser")
    public boolean addUser(User user) {
        return true;
    }
}
