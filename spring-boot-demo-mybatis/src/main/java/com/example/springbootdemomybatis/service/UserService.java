package com.example.springbootdemomybatis.service;

import com.example.springbootdemomybatis.entity.User;

import java.util.List;

public interface UserService {
    public List<User> selectAll();
    public int insertUser(User user);
    public int updateUser(User user);
    public int deleteUser(Integer id);
}
