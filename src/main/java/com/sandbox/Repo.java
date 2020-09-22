package com.sandbox;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Model, Integer> {
}
