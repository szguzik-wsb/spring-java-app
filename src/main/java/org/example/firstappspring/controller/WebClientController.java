package org.example.firstappspring.controller;

import org.example.firstappspring.service.WebClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class WebClientController {

    private final WebClientService webClientService;

    public WebClientController(WebClientService webClientService) {
        this.webClientService = webClientService;
    }

    @GetMapping("/api/data/")
    public Mono<String> getItems() {
        return webClientService.fetchData();
    }

    @GetMapping("/api/data/{id}")
    public Mono<String> getItem(@PathVariable String id) {
        return webClientService.fetchItem(id);
    }
}
