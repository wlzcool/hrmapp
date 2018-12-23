package com.zhiguogongfang.hrmapp.service;

import com.zhiguogongfang.hrmapp.domain.User;

import java.util.List;

public interface UserService {

    User login(String loginname, String password);
    User findUserById(Integer id);
    List<User> findUser();
    void removeUserById(Integer id);
    void modifyUser(User user);
    void addUser(User user);
}
