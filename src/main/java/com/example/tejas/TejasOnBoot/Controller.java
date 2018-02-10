package com.example.tejas.TejasOnBoot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/home")
    public String greetings(Map<String, Object> model) {
        model.put("message", "hey there");
        model.put("another", "hello again");
        System.out.println("hey greet");
        return "Hello";
    }

}




