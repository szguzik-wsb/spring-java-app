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
}
