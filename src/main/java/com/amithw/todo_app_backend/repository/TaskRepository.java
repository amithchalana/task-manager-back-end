package com.amithw.todo_app_backend.repository;

import com.amithw.todo_app_backend.mode.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TaskRepository extends JpaRepository<Task, UUID> {
}
