package com.amithw.todo_app_backend.repository;

import com.amithw.todo_app_backend.mode.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
