package com.zdhs.oms.helloservice.helloservice.helloServiceImpl;

import com.zdhs.oms.helloservice.dao.UserMapper;
import com.zdhs.oms.helloservice.helloservice.UserService;
import com.zdhs.oms.helloserviceapi.UserEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public UserEntity findUser(Integer age) {
        return this.userMapper.findUser(age);
    }

    @Override
    public int saveUser(UserEntity user) {
        this.userMapper.saveUser(user);
        return 1;
    }

    @Override
    public int deleteUser(Integer age) {
        this.userMapper.deleteUser(age);
        return 1;
    }
}
