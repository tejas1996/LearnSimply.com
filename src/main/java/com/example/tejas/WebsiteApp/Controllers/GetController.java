package com.example.tejas.WebsiteApp.Controllers;

import com.example.tejas.WebsiteApp.Data;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

    @Autowired
    Data database;


    @RequestMapping("/home/getArticle/{id}")
    public String getArticle(@PathVariable String id) {

        String article = database.getArticle(id);
        String finalResponse = id + ": " + article;
        return finalResponse;

    }


}
