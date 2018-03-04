package com.example.tejas.TejasOnBoot.Controllers;

import com.example.tejas.TejasOnBoot.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TypesOfControllers {

    @Autowired
    StudentService studentService;

    // just a normal controller to handle get requests
    @GetMapping("/home")
    public String greetings(Map<String, Object> model) {
        model.put("message", "Hello Sev");
        return "Hello";
    }

    // Controllers with a path variable
    // In this type we use a {} to define a variable and use the anotation called path variable
    @RequestMapping("/home/{id}")
    public String singleStudent(@PathVariable String id) {
        return studentService.getSingle(id);
    }


}
