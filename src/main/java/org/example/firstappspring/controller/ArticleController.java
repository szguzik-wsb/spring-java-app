package org.example.firstappspring.controller;

import lombok.RequiredArgsConstructor;
import org.example.firstappspring.model.Article;
import org.example.firstappspring.service.ArticleService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/articles")
    public Article addArticle(@RequestBody Article article) {
        articleService.addArticle(article);
        return article;
    }

    @PutMapping("/articles/{id}")
    public Article updateArticle(@RequestBody Article article) {
        articleService.updateArticle(article);
        return article;
    }

    @DeleteMapping("/articles")
    public String deleteArticle(@RequestBody Article article) {
        articleService.deleteArticle(article);
        return "Wpis został skasowany na podstawie obiektu";
    }

    @DeleteMapping("/articles/{id}")
    public String deleteArticleById(@PathVariable long id) {
        articleService.deleteArticleById(id);
        return "Wpis został skasowany na podstawie id";
    }
}
