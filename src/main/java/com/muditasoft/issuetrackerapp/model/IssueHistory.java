package com.muditasoft.issuetrackerapp.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Table(name = "issue_history")
@Entity
public class IssueHistory extends BaseEntity {

    @Column(name = "description", length = 1000)
    private String description;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "data")
    private LocalDateTime date;

    @Column(name = "details", length = 4000)
    private String details;

    @Column(name = "issue_status")
    @Enumerated(EnumType.STRING)
    private IssueStatus issueStatus;

    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private Issue issue;

    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private User user;
}
