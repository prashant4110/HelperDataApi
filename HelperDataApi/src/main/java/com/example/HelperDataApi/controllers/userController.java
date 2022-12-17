package com.example.HelperDataApi.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/user")
@Slf4j
public class userController {
    @GetMapping("/detail")
    @ResponseStatus(HttpStatus.OK)
    public String getUser() throws IOException {
        log.info("user details gathered");
        return "Hello world";
    }
}
