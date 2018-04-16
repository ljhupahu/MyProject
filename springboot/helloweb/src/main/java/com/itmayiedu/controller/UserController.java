package com.itmayiedu.controller;


import com.itmayiedu.entity.User;
import com.itmayiedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/createUser")
    public String createUser(String name, Integer age) {
        userService.createUser(name, age);
        return "success";
    }

    @RequestMapping("/createJpaUser")
    public String createJpaUser(String name, Integer age) {
        userService.createJpaUser(name, age);
        return "success";
    }

    @RequestMapping("/getUser")
    public String getUser(int id) {
        User user = userService.getUser(id);
        System.out.println(user.getName() + "===================");
        return "success";
    }
}
