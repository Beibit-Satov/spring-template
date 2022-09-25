package kz.edu.astanait.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${welcome.message}")
    String welcomeText;

    @RequestMapping("/test")
    public String getProfile() {
        return this.welcomeText;

    }
}
