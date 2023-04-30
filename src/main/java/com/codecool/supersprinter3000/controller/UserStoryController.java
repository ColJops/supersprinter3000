package com.codecool.supersprinter3000.controller;

import com.codecool.supersprinter3000.entity.UserStory;
import com.codecool.supersprinter3000.entity.UserStoryStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserStoryController {

    @GetMapping("/")
    public String allUsersStories(Model model) {
        List<UserStory> userStories = List.of(new UserStory(1L,
                "User Story Title",
                "User Story",
                "Must be done",
                0.5,
                100,
                UserStoryStatus.TODO),
                new UserStory(2L,
                        "User Story Title1",
                        "User Story1",
                        "Must be done",
                        0.7,
                        120,
                        UserStoryStatus.TODO));
        model.addAttribute("userStories", userStories);
        return "index";
    }
}
