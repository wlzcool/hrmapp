package com.zhiguogongfang.hrmapp.service.Impl;

import com.zhiguogongfang.hrmapp.domain.User;
import com.zhiguogongfang.hrmapp.mapper.UserMapper;
import com.zhiguogongfang.hrmapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String loginname, String password) {
        return userMapper.selectByLoginnameAndPassword(loginname, password);
    }

    @Override
    public User findUserById(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<User> findUser() {
        Map<String, Object> params = new HashMap<>();
        return userMapper.selectByPage(params);
    }

    @Override
    public void removeUserById(Integer id) {
        userMapper.deleteById(id);
    }

    @Override
    public void modifyUser(User user) {
        userMapper.update(user);
    }

    @Override
    public void addUser(User user) {
        userMapper.save(user);
    }
}
