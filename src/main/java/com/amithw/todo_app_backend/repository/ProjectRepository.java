package com.amithw.todo_app_backend.repository;

import com.amithw.todo_app_backend.mode.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProjectRepository extends JpaRepository<Project, UUID> {
}
