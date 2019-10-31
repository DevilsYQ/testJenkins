package com.devil.dao;

import com.devil.domian.User;

import java.util.List;

public interface UserMapper {

    void insertUser(User user);

    List<User> findAll();
}
