package com.example.tejas.TejasOnBoot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/home")
    public String greetings(){

        System.out.println("hey greet");
        return "Hey this is just a demo spring boot layout";
    }

}


