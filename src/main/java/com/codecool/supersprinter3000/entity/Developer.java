package com.codecool.supersprinter3000.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Developer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    @OneToMany(mappedBy = "developer", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<UserStory> userStories = new ArrayList<>();
}
