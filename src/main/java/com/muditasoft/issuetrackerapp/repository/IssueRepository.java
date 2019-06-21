package com.muditasoft.issuetrackerapp.repository;

import com.muditasoft.issuetrackerapp.model.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<Issue, Long> {

}
