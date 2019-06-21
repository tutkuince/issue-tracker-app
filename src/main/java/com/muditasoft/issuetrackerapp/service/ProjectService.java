package com.muditasoft.issuetrackerapp.service;

import com.muditasoft.issuetrackerapp.dto.ProjectDto;
import com.muditasoft.issuetrackerapp.util.TPage;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {
    ProjectDto save(ProjectDto projectDto);

    ProjectDto getById(Long id);

    ProjectDto getByProjectCode(String projectCode);

    List<ProjectDto> getByProjectCodeContains(String projectCode);

    TPage<ProjectDto> getAllPageable(Pageable pageable);

    Boolean delete(ProjectDto projectDto);

    ProjectDto update(Long id, ProjectDto project);

    Boolean delete(Long id);

    List<ProjectDto> getAll();
}
