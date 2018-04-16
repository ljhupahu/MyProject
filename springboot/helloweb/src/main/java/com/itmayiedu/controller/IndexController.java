package com.itmayiedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping("/indexController")
    public String index(Map<String, Object> testmap){
        System.out.println("indexController");
        testmap.put("name", "Tony");
        testmap.put("sex", 0);

//        ArrayList<String> list = new ArrayList<>();
//        list.add("zhang");
//        list.add("lisi");

        Map<String, Object> result =new HashMap<>();
        result.put("name", "test");
        return "index1";
    }
}
