package com.codecool.supersprinter3000.repository;

import com.codecool.supersprinter3000.entity.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperRepository extends JpaRepository <Developer, Long> {
}
