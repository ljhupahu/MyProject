package com.itmayiedu.service;

import com.itmayiedu.dao.UserDao;
import com.itmayiedu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void createUser(String name, Integer age) {
        System.out.println("ssss");
        jdbcTemplate.update("insert into users values(null,?,?);", name, age);
        System.out.println("Successful ....");
    }

    public void createJpaUser(String name, Integer age) {
        System.out.println("createJpaUser");
        User user = new User();
        user.setAge(age);
        user.setName(name);
        userDao.save(user);
        System.out.println("Successful ....");
    }

    public User getUser(int id) {
        return userDao.getOne(id);
    }
}
