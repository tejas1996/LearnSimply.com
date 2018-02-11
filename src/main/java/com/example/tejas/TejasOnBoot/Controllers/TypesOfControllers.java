package com.example.tejas.TejasOnBoot.Controllers;

import com.example.tejas.TejasOnBoot.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

public class TypesOfControllers {

    @Autowired
    StudentService studentService;

    // just a normal controller to handle get requests
    @RequestMapping("/home")
    public HashMap<String, String> greetings(Map<String, Object> model) {
        return studentService.getStudents();
    }

    // Controllers with a path variable
    // In this type we use a {} to define a variable and use the anotation called path variable
    @RequestMapping("/home/{id}")
    public String singleStudent(@PathVariable String id) {
        return studentService.getSingle(id);
    }


}
