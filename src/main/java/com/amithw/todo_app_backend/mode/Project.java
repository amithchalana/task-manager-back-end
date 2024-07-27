package com.amithw.todo_app_backend.mode;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Data
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Temporal(TemporalType.DATE)
    @Column(name = "start_date")
    private Date startDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "end_date")
    private Date endDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id",nullable = false)
    private User user;

    @OneToMany(mappedBy = "project",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Set<Task> tasks;
}
