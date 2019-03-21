package com.zdhs.oms.helloservice.dao;

import com.zdhs.oms.helloserviceapi.UserEntity;

public interface UserMapper {

    UserEntity findUser(Integer age);

    int saveUser(UserEntity user);

    int deleteUser(Integer age);

}
