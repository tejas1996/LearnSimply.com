package com.example.tejas.WebsiteApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tejas.WebsiteApp.model.JsonArticle;

@Repository
public interface ArticleRepository extends JpaRepository<JsonArticle, Long> {

}
