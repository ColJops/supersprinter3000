package com.codecool.supersprinter3000.controller;

import com.codecool.supersprinter3000.controller.dto.UserStoryDto;
import com.codecool.supersprinter3000.controller.dto.NewUserStoryDto;
import com.codecool.supersprinter3000.service.UserStoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ap1/v1/user_stories")
public class UserStoryController {

    private final UserStoryService userStoryService;

    public UserStoryController(UserStoryService userStoryService) {
        this.userStoryService = userStoryService;
    }

    @GetMapping
    public List<UserStoryDto> getAllUserStories() {
        return userStoryService.getAllUserStories();
    }

    @GetMapping("/{id}")
    public UserStoryDto getUserStory(@PathVariable Long id) {
        return userStoryService.getUserStory(id);

    }
    @PostMapping()
    public UserStoryDto createNewUserStory(@RequestBody NewUserStoryDto newUserStory) {
       return userStoryService.addNewUserStory(newUserStory);
    }
}
