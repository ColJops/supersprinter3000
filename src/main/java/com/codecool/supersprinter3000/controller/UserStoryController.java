package com.codecool.supersprinter3000.controller;

import com.codecool.supersprinter3000.entity.UserStory;
import com.codecool.supersprinter3000.repository.UserStoryRepository;
import com.codecool.supersprinter3000.service.UserStoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("ap1/v1/user_stories")
public class UserStoryController {

    private final UserStoryService userStoryService;

    public UserStoryController(UserStoryService userStoryService) {
        this.userStoryService = userStoryService;
    }

    @GetMapping
    public List<UserStory> getAllUserStories() {
        return userStoryService.getAllUserStories();
    }

    @GetMapping("/{id}")
    public UserStory getUserStory(@PathVariable Long id) {
        return userStoryService.getUserStory(id);

    }

}
