package com.muditasoft.issuetrackerapp.repository;

import com.muditasoft.issuetrackerapp.model.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IssueHistoryRepository extends JpaRepository<IssueHistory, Long> {
    List<IssueHistory> getByIssueIdOrderById(Long id);
}
