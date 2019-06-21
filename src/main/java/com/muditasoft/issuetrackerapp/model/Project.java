package com.muditasoft.issuetrackerapp.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Table(name = "project")
@Entity
public class Project extends BaseEntity {

    @Column(name = "project_name", length = 300)
    private String projectName;

    @Column(name = "project_code", length = 30)
    private String projectCode;

    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private User user;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "project")
    private Set<Issue> issues;
}
