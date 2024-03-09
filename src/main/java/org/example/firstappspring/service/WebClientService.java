package org.example.firstappspring.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class WebClientService {

    private final WebClient webClient;
    private final WebClient webClientInternal;

    public WebClientService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://jsonplaceholder.typicode.com").build();
        this.webClientInternal = webClientBuilder.baseUrl("http://localhost:8080").build();
    }

    public Mono<String> fetchData() {
        return webClient.get()
                .uri("/todos/")
                .retrieve()
                .bodyToMono(String.class);
    }

    public Mono<String> fetchItem(String id) {
        return webClient.get()
                .uri("/todos/" + id)
                .retrieve()
                .bodyToMono(String.class);
    }

    public Mono<String> fetchDataArticles() {
        return webClientInternal.get()
                .uri("/articles")
                .retrieve()
                .bodyToMono(String.class);
    }

    public Mono<String> fetchItemArticle(String id) {
        return webClientInternal.get()
                .uri("/articles/" + id)
                .retrieve()
                .bodyToMono(String.class);
    }

}
