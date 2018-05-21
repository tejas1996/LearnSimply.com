package com.example.tejas.WebsiteApp.Controllers;

import com.example.tejas.WebsiteApp.Data;
import com.example.tejas.WebsiteApp.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TypesOfControllers {

    @Autowired
    StudentService studentService;

    @Autowired
    Data data;

    // just a normal controller to handle get requests
    @GetMapping("/home")
    public String greetings(Map<String, Object> model) {

        model.put("message", data.getAll());
        return "Hello";
    }

    @GetMapping("/home/addArticle")
    public String addArticle(Map<String, Object> model) {
        return "AddArticle";
    }




    // Controllers with a path variable
    // In this type we use a {} to define a variable and use the anotation called path variable


}
