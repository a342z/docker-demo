package com.zakister.dockerdemobackend.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class MessagesController {

    @GetMapping("/messages")
    public String getMessages() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://backend:8080/messages";

        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        String responseBody = response.getBody();
        return responseBody;
    }
}
