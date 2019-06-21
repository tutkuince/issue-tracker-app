package com.muditasoft.issuetrackerapp.dto;

import com.muditasoft.issuetrackerapp.model.IssueStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class IssueDto {
    private Long id;
    private String description;
    private String details;
    private LocalDateTime date;
    private IssueStatus issueStatus;
    private UserDto userDto;
    private ProjectDto projectDto;
}
