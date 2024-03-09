package org.example.firstappspring.service;

import org.springframework.stereotype.Service;

@Service
public class FirstAppService {
    public String welcome() {
        return "Welcome First App";
    }
}
