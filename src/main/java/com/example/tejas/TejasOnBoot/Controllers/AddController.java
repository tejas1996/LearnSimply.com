package com.example.tejas.TejasOnBoot.Controllers;

import com.example.tejas.TejasOnBoot.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;


@RestController
public class AddController {


    @Autowired
    Data database;


    @RequestMapping("/home/add/{id}")
    public String addArticle(@PathVariable String id) {

        String key = id.substring(0, id.indexOf("="));
        String dat = id.substring(id.indexOf("=") + 1, id.length());
        database.add(key, dat);
        return "Added the article";

    }


    @RequestMapping("/home/get/{id}")
    public String getArticle(@PathVariable String id) {

        return database.getArticle(id);

    }

//    @RequestMapping("/home/get")
//    public String getArticle() {
//
//        return database.getAll();
//
//    }


}
