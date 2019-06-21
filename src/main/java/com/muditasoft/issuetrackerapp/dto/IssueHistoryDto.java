package com.muditasoft.issuetrackerapp.dto;

import com.muditasoft.issuetrackerapp.model.IssueStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class IssueHistoryDto {
    private Long id;
    private String description;
    private LocalDateTime date;
    private String details;
    private IssueStatus issueStatus;
    private IssueDto issueDto;
    private UserDto userDto;

}
