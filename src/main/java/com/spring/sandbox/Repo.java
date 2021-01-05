package com.spring.sandbox;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Repo extends JpaRepository<Model, Integer> {

    Optional<Model> findByUserId(Long userId);
}
