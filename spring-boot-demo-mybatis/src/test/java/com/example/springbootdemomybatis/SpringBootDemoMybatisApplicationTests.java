package com.example.springbootdemomybatis;

import com.example.springbootdemomybatis.dao.UserDAO;
import com.example.springbootdemomybatis.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoMybatisApplicationTests {
    @Autowired
    private UserDAO userDAO;

    @Test
    public void contextLoads() {
    }

    @Test
    public void insert(){
        User user = new User(1,"张三",22,"1325555666");
        userDAO.insertUser(user);
        System.out.println(userDAO.selectAll());
    }

}
