package org.example.firstappspring.controller;

import org.example.firstappspring.service.AclService;
import org.example.firstappspring.service.FirstAppService;
import org.example.firstappspring.service.SecondAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class FirstApp {

    private final FirstAppService firstAppService;
    private final SecondAppService secondAppService;

    @Autowired
    public FirstApp(
            FirstAppService firstAppService,
            SecondAppService secondAppService
    ) {
        this.firstAppService = firstAppService;
        this.secondAppService = secondAppService;
    }

    @GetMapping("/")
    public String index() {
        return firstAppService.welcome();
    }

    @GetMapping("/second")
    public String second() {
        return secondAppService.welcome();
    }

    @GetMapping("/acl")
    public String acl(AclService aclService) {

        String user = "admin";
        boolean access = false;
        // admin, moderator, user
        aclService.setAcl_group("admin");

        if(Objects.equals(aclService.getAcl_group(), user)) {
            access = true;
        }

        return access
                ? "Uzytkownika ma uprawnienia"
                : "Uzytkownik nie ma uprawnien";
    }
}
