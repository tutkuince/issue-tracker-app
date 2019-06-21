package com.muditasoft.issuetrackerapp.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "issue")
@Data
public class Issue extends BaseEntity {

    @Column(name = "description", length = 1000)
    private String description;

    @Column(name = "details", length = 4000)
    private String details;

    @Column(name = "date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime date;

    @Column(name = "issue_status")
    @Enumerated(EnumType.STRING)
    private IssueStatus issueStatus;

    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private Project project;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "issue")
    private Set<IssueHistory> issueHistories;
}
