package ru.job4j.chat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
@RequestMapping("/")
public class GreetingController {

    @GetMapping
    public String greeting() {
        return "index";
    }

    @GetMapping("/login")
    public String log() {
        return "login";
    }
}
