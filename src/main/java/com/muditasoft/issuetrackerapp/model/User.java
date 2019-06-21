package com.muditasoft.issuetrackerapp.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Table(name = "users")
@Entity
public class User extends BaseEntity {

    @Column(name = "uname", length = 100, unique = true)
    private String username;

    @Column(name = "pwd", length = 200)
    private String password;

    @Column(name = "full_name", length = 200)
    private String fullName;

    @Column(name = "email", length = 100)
    private String email;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Issue> issues;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<IssueHistory> issueHistories;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Project> projects;
}
