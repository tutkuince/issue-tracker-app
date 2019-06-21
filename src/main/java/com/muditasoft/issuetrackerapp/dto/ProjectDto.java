package com.muditasoft.issuetrackerapp.dto;

import lombok.Data;

@Data
public class ProjectDto {
    private Long id;
    private String projectName;
    private String projectCode;
    private UserDto userDto;
}
