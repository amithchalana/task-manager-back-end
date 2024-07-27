package com.amithw.todo_app_backend.mode;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id ;

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

    @Column(name = "status")
    private boolean status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id",nullable = false)
    private Project project;

}
