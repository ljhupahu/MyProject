package com.itmayiedu.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloWorldController {

    @RequestMapping("/index")
    public String index(){
        System.out.println("Index ===");
        return "success_index";
    }

    @RequestMapping("/getMap")
    public Map<String,Object> getMap(){
        HashMap<String, Object> result = new HashMap<>();
        result.put("errorCode", "200");
        result.put("errorMsg", "successful");
        return  result;
    }


}
