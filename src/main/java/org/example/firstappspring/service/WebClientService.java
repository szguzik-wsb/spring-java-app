package org.example.firstappspring.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class WebClientService {

    private final WebClient webClient;

    public WebClientService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://jsonplaceholder.typicode.com").build();
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

}
