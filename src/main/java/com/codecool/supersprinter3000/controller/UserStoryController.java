package com.codecool.supersprinter3000.controller;

import com.codecool.supersprinter3000.service.UserStoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserStoryController {

    private final UserStoryService userStoryService;

    public UserStoryController(UserStoryService userStoryService) {
        this.userStoryService = userStoryService;
    }

    @GetMapping("/")
    public String allUsersStories(Model model) {
        model.addAttribute("userStories", userStoryService.getAllUserStories());
        return "index";
    }
}
