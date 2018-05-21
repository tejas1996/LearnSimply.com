package com.example.tejas.WebsiteApp.model;

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


import javax.persistence.*;
import org.hibernate.validator.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.Id;
@Entity
@Table(name = "aarticle")
@EntityListeners(AuditingEntityListener.class)
public class JsonArticle {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long articleId;

	@NotBlank
    String articletitle;
	
	@NotBlank
    String imageLink;
    
	@NotBlank
	String content;
    
	String videoLink;

    public String getArticletitle() {
        return articletitle;
    }

    public void setArticletitle(String articletitle) {
        this.articletitle = articletitle;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }
    
	
	public Long getArticleId() {
		return articleId;
	}

	public void setArticleId(Long articleId) {
		this.articleId = articleId;
	}
}
