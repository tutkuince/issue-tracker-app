package com.muditasoft.issuetrackerapp.service.impl;

import com.muditasoft.issuetrackerapp.dto.IssueDto;
import com.muditasoft.issuetrackerapp.model.Issue;
import com.muditasoft.issuetrackerapp.repository.IssueRepository;
import com.muditasoft.issuetrackerapp.service.IssueService;
import com.muditasoft.issuetrackerapp.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class IssueServiceImpl implements IssueService {


    private final IssueRepository issueRepository;
    private final ModelMapper modelMapper;

    public IssueServiceImpl(IssueRepository issueRepository, ModelMapper modelMapper) {
        this.issueRepository = issueRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public IssueDto save(IssueDto issueDto) {
        Issue issue = modelMapper.map(issueDto, Issue.class);
        issue = issueRepository.save(issue);
        return modelMapper.map(issue, IssueDto.class);
    }

    @Override
    public IssueDto getById(Long id) {
        Issue issue = issueRepository.getOne(id);
        return modelMapper.map(issue, IssueDto.class);
    }

    @Override
    public TPage<IssueDto> getAll(Pageable pageable) {
        Page<Issue> data = issueRepository.findAll(pageable);
        TPage<IssueDto> response = new TPage<>();
        response.setStat(data, Arrays.asList(modelMapper.map(data.getContent(), IssueDto[].class)));
        return response;
    }

    @Override
    public Boolean delete(Long issueId) {
        issueRepository.deleteById(issueId);
        return Boolean.TRUE;
    }

    @Override
    public IssueDto update(Long id, IssueDto issueDto) {
        return null;
    }

    @Override
    public List<IssueDto> getAll() {
        List<Issue> data = issueRepository.findAll();
        return Arrays.asList(modelMapper.map(data, IssueDto[].class));
    }
}
