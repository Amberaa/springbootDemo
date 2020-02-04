package com.example.springbootdemomybatis.service.impl;

import com.example.springbootdemomybatis.dao.UserDAO;
import com.example.springbootdemomybatis.entity.User;
import com.example.springbootdemomybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public List<User> selectAll() {
        return userDAO.selectAll();
    }

    @Override
    public int insertUser(User user) {
        return userDAO.insertUser(user);
    }

    @Override
    public int updateUser(User user) {
        return userDAO.updateUser(user);
    }

    @Override
    public int deleteUser(Integer id) {
        return userDAO.deleteUser(id);
    }
}
