package com.example.springbootdemomybatis.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String phone;

    public User(){
    }
    public User(int id,String name,int age,String phone){
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
}
