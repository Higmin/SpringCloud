package com.zdhs.oms.helloservice.helloservice;


import com.zdhs.oms.helloserviceapi.UserEntity;

public interface UserService {

    UserEntity findUser(Integer id);

    int saveUser(UserEntity user);

    int deleteUser(Integer id);
}
