package com.muditasoft.issuetrackerapp.service;

import com.muditasoft.issuetrackerapp.dto.IssueHistoryDto;
import com.muditasoft.issuetrackerapp.model.Issue;
import com.muditasoft.issuetrackerapp.util.TPage;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IssueHistoryService {
    IssueHistoryDto save(IssueHistoryDto issueHistoryDto);

    IssueHistoryDto getById(Long id);

    List<IssueHistoryDto> getByIssueId(Long id);

    TPage<IssueHistoryDto> getAllPageable(Pageable pageable);

    Boolean delete(IssueHistoryDto issueHistoryDto);

    void addHistory(Long id, Issue issue);
}
