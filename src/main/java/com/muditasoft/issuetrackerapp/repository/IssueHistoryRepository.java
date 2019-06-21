package com.muditasoft.issuetrackerapp.repository;

import com.muditasoft.issuetrackerapp.model.IssueHistory;
import org.springframework.data.repository.CrudRepository;

public interface IssueHistoryRepository extends CrudRepository<IssueHistory, Long> {

}
