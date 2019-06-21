package com.muditasoft.issuetrackerapp.repository;

import com.muditasoft.issuetrackerapp.model.Issue;
import org.springframework.data.repository.CrudRepository;

public interface IssueRepository extends CrudRepository<Issue, Long> {

}
