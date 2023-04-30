package com.codecool.supersprinter3000.entity;

public record UserStory(
    Long id,
    String title,
    String story,
    String acceptanceCriteria,
    Double estimastion,
    Integer bussinesValue,
    UserStoryStatus userStoryStatus){}

