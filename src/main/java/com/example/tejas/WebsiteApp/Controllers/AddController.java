package com.example.tejas.WebsiteApp.Controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tejas.WebsiteApp.model.JsonArticle;
import com.example.tejas.WebsiteApp.repository.ArticleRepository;
import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
public class AddController {


    @Autowired
    ArticleRepository repository;

    @RequestMapping(value = "/home/add/{jsonObject}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String addArticle(@PathVariable String jsonObject) throws IOException {

        System.out.println(jsonObject);
        ObjectMapper ob = new ObjectMapper();
        JsonArticle ar = ob.readValue(jsonObject, JsonArticle.class);
        
        updateArticle(ar.getArticleId(),ar);

        return "Added the article";

    }


    
    public boolean updateArticle(Long articleId, JsonArticle articleDetails) {

        JsonArticle article = new JsonArticle();  
        
        
        article.setArticleId(articleId);
        article.setImageLink(articleDetails.getImageLink());
        article.setVideoLink(articleDetails.getVideoLink());
        article.setArticletitle(articleDetails.getArticletitle());
        article.setContent(articleDetails.getContent());
        
        JsonArticle updatedArticle = repository.save(article);
        System.out.println(updatedArticle.getArticleId());
        return true;
    }

    
    @RequestMapping("/home/get/{id}")
    public JsonArticle getArticle(@PathVariable Long id) {

        return repository.findOne((Long)id);

    }




}
