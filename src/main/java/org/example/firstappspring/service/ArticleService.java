package org.example.firstappspring.service;

import lombok.RequiredArgsConstructor;
import org.example.firstappspring.model.Article;
import org.example.firstappspring.repository.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleService {


    private final ArticleRepository articleRepository;

    public List<Article> getArticle() {
        return articleRepository.findAll();
    }


    public Article getSingleArticle(long id) {
        return articleRepository.findById(id)
                .orElse(null);
    }

    public void addArticle(Article article) {
        articleRepository.save(article);
    }

    public void updateArticle(Article article) {
        articleRepository.save(article);
    }

    public void deleteArticle(Article article) {
        articleRepository.delete(article);
    }

    public void deleteArticleById(long id) {
        articleRepository.deleteById(id);
    }
}
