package org.example.firstappspring.controller;

import lombok.RequiredArgsConstructor;
import org.example.firstappspring.model.Article;
import org.example.firstappspring.service.ArticleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ArticleController {

    private final ArticleService articleService;

    @GetMapping("/articles")
    public List<Article> getArticles() {

        return articleService.getArticle();
    }

    @GetMapping("/articles/{id}")
    public Article getSingleArticles(@PathVariable long id) {

        return articleService.getSingleArticle(id);
    }

}
