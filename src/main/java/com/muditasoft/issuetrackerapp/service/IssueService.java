package com.muditasoft.issuetrackerapp.service;

import com.muditasoft.issuetrackerapp.dto.IssueDto;
import com.muditasoft.issuetrackerapp.util.TPage;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IssueService {
    IssueDto save(IssueDto issueDto);

    IssueDto getById(Long id);

    TPage<IssueDto> getAll(Pageable pageable);

    Boolean delete(Long issueId);

    IssueDto update(Long id, IssueDto issueDto);

    List<IssueDto> getAll();
}
