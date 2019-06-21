package com.muditasoft.issuetrackerapp.service.impl;

import com.muditasoft.issuetrackerapp.dto.IssueHistoryDto;
import com.muditasoft.issuetrackerapp.model.Issue;
import com.muditasoft.issuetrackerapp.model.IssueHistory;
import com.muditasoft.issuetrackerapp.repository.IssueHistoryRepository;
import com.muditasoft.issuetrackerapp.service.IssueHistoryService;
import com.muditasoft.issuetrackerapp.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class IssueHistoryServiceImpl implements IssueHistoryService {

    private final IssueHistoryRepository issueHistoryRepository;
    private final ModelMapper modelMapper;

    public IssueHistoryServiceImpl(IssueHistoryRepository issueHistoryRepository, ModelMapper modelMapper) {
        this.issueHistoryRepository = issueHistoryRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public IssueHistoryDto save(IssueHistoryDto issueHistoryDto) {
        IssueHistory issueHistory = modelMapper.map(issueHistoryDto, IssueHistory.class);
        issueHistory = issueHistoryRepository.save(issueHistory);
        issueHistoryDto.setId(issueHistory.getId());
        return issueHistoryDto;
    }

    @Override
    public IssueHistoryDto getById(Long id) {
        IssueHistory issueHistory = issueHistoryRepository.getOne(id);
        return modelMapper.map(issueHistory, IssueHistoryDto.class);
    }

    @Override
    public List<IssueHistoryDto> getByIssueId(Long id) {
        return Arrays.asList(modelMapper.map(issueHistoryRepository.getByIssueIdOrderById(id), IssueHistoryDto[].class));
    }

    @Override
    public TPage<IssueHistoryDto> getAllPageable(Pageable pageable) {
        Page<IssueHistory> data = issueHistoryRepository.findAll(pageable);
        TPage<IssueHistoryDto> response = new TPage<>();
        response.setStat(data, Arrays.asList(modelMapper.map(data.getContent(), IssueHistoryDto[].class)));
        return response;
    }

    @Override
    public Boolean delete(IssueHistoryDto issueHistoryDto) {
        issueHistoryRepository.deleteById(issueHistoryDto.getId());
        return Boolean.TRUE;
    }

    @Override
    public void addHistory(Long id, Issue issue) {
        IssueHistory history=new IssueHistory();
        history.setIssue(issue);
        history.setUser(issue.getUser());
        history.setDate(issue.getDate());
        history.setDescription(issue.getDescription());
        history.setDetails(issue.getDetails());
        history.setIssueStatus(issue.getIssueStatus());
        issueHistoryRepository.save(history);
    }
}
