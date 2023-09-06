package com.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.model.cat;

public interface CRepository extends JpaRepository<cat, Long> {
}
