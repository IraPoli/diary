package com.example.application;

import org.springframework.data.jpa.repository.JpaRepository;


public interface PeopleRepository extends JpaRepository<People, Long> {
}
