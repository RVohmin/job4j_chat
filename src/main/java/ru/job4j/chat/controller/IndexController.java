package ru.job4j.chat.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
//    private final TopicRepository topicRepository;

//    public IndexControl(TopicRepository topicRepository) {
//        this.topicRepository = topicRepository;
//    }

    @GetMapping({"/", "/index"})
    public String index(Model model) {
        model.addAttribute("user", SecurityContextHolder.getContext().getAuthentication().getPrincipal());
//        model.addAttribute("topics", topicRepository.findAll());
        return "index";
    }

}
