package com.muditasoft.issuetrackerapp.repository;

import com.muditasoft.issuetrackerapp.model.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProjectRepository extends CrudRepository<Project, Long> {
    Page<Project> findAll(Pageable pageable);
    List<Project> findAll(Sort sort);
}
