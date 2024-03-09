package org.example.firstappspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {


    @GetMapping("/articles")
    public List<Article> getArticle() {
        return
    }

}
