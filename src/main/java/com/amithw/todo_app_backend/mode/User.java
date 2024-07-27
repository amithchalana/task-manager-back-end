package com.amithw.todo_app_backend.mode;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id ;

    @Column(name = "username", unique = true,nullable = false)
    private String userName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email", unique = true,nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Set<Project> projects;



}
