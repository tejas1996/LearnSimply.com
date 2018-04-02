package com.example.tejas.TejasOnBoot.Controllers;

import com.example.tejas.TejasOnBoot.Data;
import com.example.tejas.TejasOnBoot.model.JsonArticle;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;


@RestController
public class AddController {


    @Autowired
    Data database;


    @RequestMapping(value = "/home/add/{jsonObject}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String addArticle(@PathVariable String jsonObject) throws IOException {

        System.out.println(jsonObject);
        ObjectMapper ob = new ObjectMapper();
        JsonArticle ar = ob.readValue(jsonObject, JsonArticle.class);


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
