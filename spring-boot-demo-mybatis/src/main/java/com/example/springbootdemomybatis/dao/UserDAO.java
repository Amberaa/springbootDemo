package com.example.springbootdemomybatis.dao;

import com.example.springbootdemomybatis.entity.User;
import org.jboss.logging.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDAO {
    public List<User> selectAll();
    public int insertUser(User user);
    public int updateUser(User user);
    public int deleteUser(int id);
}
